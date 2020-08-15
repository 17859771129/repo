package com.ylz.cdr.write.tool;

import com.ylz.cdr.common.Dom4jTool;
import com.ylz.dict.bean.MetaConfigList;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.dom4j.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;

public class TransElement {
    private static final Logger log = LoggerFactory.getLogger(TransElement.class);

    /**
     * 取数据
     *
     * @param sourceElement
     * @param metaConfigList
     */
    public static Map<String, Object> setMetaXml(Element sourceElement, List<MetaConfigList> metaConfigList) throws DocumentException {
        Map<String, Object> listMap = getMap(metaConfigList);
        Map<String, Object> returnMap = new HashMap<>();
        List<MetaConfigList> configList = (List<MetaConfigList>) listMap.get("list");
        Map<String, List<MetaConfigList>> mapList = (Map<String, List<MetaConfigList>>) listMap.get("map");
        for (MetaConfigList metaConfig : configList) {
            readText(sourceElement, metaConfig, mapList, returnMap);
        }
        return returnMap;
    }


    /**
     * 分组数据
     *
     * @param mappingInfeList
     * @return
     */
    private static Map<String, Object> getMap(List<MetaConfigList> mappingInfeList) {
        List<MetaConfigList> listNode = new ArrayList<>();
        List<MetaConfigList> normalList = new ArrayList<>();
        mappingInfeList.forEach(mappingInfe -> {
            if (StringUtils.isNotEmpty(mappingInfe.getParentPath())) {
                listNode.add(mappingInfe);
            } else {
                normalList.add(mappingInfe);
            }
        });
        Map<String, List<MetaConfigList>> listNodeMap = listNode.stream().collect(Collectors.groupingBy(MetaConfigList::getParentPath));
        Map<String, Object> map = new HashMap<>();
        map.put("list", normalList);
        map.put("map", listNodeMap);
        return map;
    }


    public static String setText(MetaConfigList infeMeta, Node node) {
        if (null == node) {
            return null;
        }
        String text = node.getText();
        if (StringUtils.isNotEmpty(text)) {
            if (infeMeta.getIsPdf() == 1) {
                String uniqueId = UUID.randomUUID().toString();
                String pathAnnex = ComposeXml.getAnnex(text, infeMeta.getCdaType(), uniqueId, ".pdf");
                text = pathAnnex;
            } else if (infeMeta.getIsImage() == 1) {
                String uniqueId = UUID.randomUUID().toString();
                String pathAnnex = ComposeXml.getAnnex(text, infeMeta.getCdaType(), uniqueId, ".jpg");
                text = pathAnnex;
            }
        }
        return text;
    }

    /**
     * @param elementSource 原始文件的节点
     * @param metaConfig    节点和数据源信息
     * @param listMap       list节点的信息
     */
    public static void readText(Element elementSource, MetaConfigList metaConfig, Map<String, List<MetaConfigList>> listMap, Map<String, Object> returnMap) throws DocumentException {
        String xpathString = metaConfig.getCdaXpath();
        String name = metaConfig.getColumnNameAlias();
        List<MetaConfigList> listList = listMap.get(xpathString);
        if (CollectionUtils.isEmpty(listList)) {
            if (metaConfig.getIsList() == 0) {
                List<Node> nodeList = Dom4jTool.selectNode(elementSource, elementSource.getNamespaceURI(), xpathString);
                String nodeValue = null;
                if (CollectionUtils.isNotEmpty(nodeList)) {
                    if (1 == nodeList.size()) {
                        nodeValue = setText(metaConfig, nodeList.get(0));
                    } else {
                        List<String> nodeValueList = new ArrayList<>();
                        for (Node node : nodeList) {
                            nodeValueList.add(setText(metaConfig, node));
                        }
                        nodeValue = StringUtils.join(nodeValueList.toArray(), ",");
                    }
                }
                returnMap.put(name, nodeValue);
                return;
            }
            List<Node> nodeList = Dom4jTool.selectNode(elementSource, elementSource.getNamespaceURI(), xpathString);
            if (CollectionUtils.isNotEmpty(nodeList)) {
                for (Node node : nodeList) {
                    returnMap.put(name, setText(metaConfig, node));
                }
            }
            return;
        }
        if (metaConfig.getIsList() == 0) {
            Node node = Dom4jTool.selectSingleNode(elementSource, elementSource.getNamespaceURI(), xpathString);
            if (null == node) {
                return;
            }
            setMap(node, listList, listMap, returnMap);
            return;
        }
        List<Node> nodeList = Dom4jTool.selectNode(elementSource, elementSource.getNamespaceURI(), xpathString);
        if (CollectionUtils.isNotEmpty(nodeList)) {
            List<Map<String, Object>> mapList = new ArrayList<>();
            for (Node node : nodeList) {
                Map<String, Object> listChildMap = new HashMap<>();
                setMap(node, listList, listMap, listChildMap);
                if (null != listChildMap && listChildMap.size() > 0) {
                    mapList.add(listChildMap);
                }
            }
            returnMap.put(name, mapList);
        }
    }

    private static void setMap(Node node, List<MetaConfigList> listList,
                               Map<String, List<MetaConfigList>> listMap, Map<String, Object> listChildMap) throws DocumentException {
        for (MetaConfigList config : listList) {
            Map<String, Object> listValueMap = new HashMap<>();
            Document document = DocumentHelper.parseText(node.asXML());
            readText(document.getRootElement(), config, listMap, listValueMap);
            if (null != listValueMap && listValueMap.size() > 0) {
                listChildMap.putAll(listValueMap);
            }
        }
    }
}
