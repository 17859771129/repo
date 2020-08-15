package com.ylz.hf.write.tool;

import com.ylz.cdr.common.Dom4jTool;
import com.ylz.dict.service.IDictInfoService;
import com.ylz.dict.bean.MetaConfigList;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.dom4j.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import java.util.stream.Collectors;

/*@Configuration*/
public class TransElement2 {
    private static final Logger log = LoggerFactory.getLogger(TransElement2.class);

    @Autowired
    private IDictInfoService rangeDataService;

    /**
     * 取数据
     *
     * @param sourceElement
     * @param metaConfigList
     */
    public Map<String, Object> setMetaXml(Element sourceElement, List<MetaConfigList> metaConfigList) throws DocumentException {
        Map<String, Object> listALLMap = getMap(metaConfigList);
        Map<String, Object> returnMap = new HashMap<>();
        Map<String, MetaConfigList> configList = (Map<String, MetaConfigList>) listALLMap.get("list");
        Map<String, List<MetaConfigList>> mapAllList = (Map<String, List<MetaConfigList>>) listALLMap.get("map");
        for (String name : configList.keySet()) {
            MetaConfigList metaConfig = configList.get(name);
            MetaConfigList metaConfigR = null;
            if (StringUtils.isNotEmpty(metaConfig.getRelationColumnNameAlias())) {
                if (configList.containsKey(metaConfig.getRelationColumnNameAlias())) {
                    metaConfigR = configList.get(metaConfig.getRelationColumnNameAlias());
                }
            }
            readData(sourceElement, metaConfig, mapAllList, returnMap, metaConfigR);
        }
        return returnMap;
    }

    /**
     * @param sourceElement
     * @param metaConfig
     * @param mapAllList
     * @param returnMap
     * @param metaConfigListR
     * @throws DocumentException
     */
    private void readData(Element sourceElement, MetaConfigList metaConfig,
                          Map<String, List<MetaConfigList>> mapAllList,
                          Map<String, Object> returnMap,
                          MetaConfigList metaConfigListR) throws DocumentException {
        String xpathString = metaConfig.getCdaXpath();
        String name = metaConfig.getColumnNameAlias();
        List<MetaConfigList> listList = mapAllList.get(xpathString);
        if (CollectionUtils.isEmpty(listList)) {
            String value = (String) returnMap.get(name);
            if (StringUtils.isEmpty(value)) {
                String nodeValue = getValue(sourceElement, metaConfig);
                returnMap.put(name, nodeValue);
            }
            String nameR = metaConfig.getRelationColumnNameAlias();
            if (StringUtils.isNotEmpty(nameR)) {
                if (returnMap.containsKey(nameR)) {
                    String rValue = (String) returnMap.get(nameR);
                    if (StringUtils.isEmpty(rValue)) {
                        String nodeValue = null;
                        if (null != metaConfigListR) {
                            nodeValue = getValue(sourceElement, metaConfigListR);
                        }
                        if (StringUtils.isEmpty(nodeValue)) {
                            nodeValue = rangeDataService.getValue(metaConfig.getMetaDict(), value);
                        }
                        returnMap.put(name, nodeValue);
                    }
                } else {
                    String nodeValue = getValue(sourceElement, metaConfigListR);
                    returnMap.put(name, nodeValue);
                }
            }
            return;
        }
        List<Node> nodeList = Dom4jTool.selectNode(sourceElement, sourceElement.getNamespaceURI(), xpathString);
        if (CollectionUtils.isEmpty(nodeList)) {
            return;
        }
        List<Map<String, Object>> mapValueList = new ArrayList<>();
        if (0 == metaConfig.getIsList()) {
            setMap(nodeList.get(0), listList, mapAllList, returnMap);
        } else {
            for (Node node : nodeList) {
                Map<String, Object> listChildMap = new HashMap<>();
                setMap(node, listList, mapAllList, listChildMap);
                if (null != listChildMap && listChildMap.size() > 0) {
                    mapValueList.add(listChildMap);
                }
            }
            returnMap.put(name, mapValueList);
        }
    }


    /**
     * 分组数据
     *
     * @param mappingInfeList
     * @return
     */
    private static Map<String, Object> getMap(List<MetaConfigList> mappingInfeList) {
        List<MetaConfigList> listNode = new ArrayList<>();
        Map<String, MetaConfigList> normalList = new HashMap<>();
        mappingInfeList.forEach(mappingInfe -> {
            if (StringUtils.isNotEmpty(mappingInfe.getParentPath())) {
                listNode.add(mappingInfe);
            } else {
                normalList.put(mappingInfe.getColumnNameAlias(), mappingInfe);
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

    private static String getValue(Element elementSource, MetaConfigList metaConfig) {

        String nodeValue = null;
        List<Node> nodeList = Dom4jTool.selectNode(elementSource, elementSource.getNamespaceURI(), metaConfig.getCdaXpath());
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
        return nodeValue;
    }

    private void setMap(Node node, List<MetaConfigList> listList,
                        Map<String, List<MetaConfigList>> listMap, Map<String, Object> listChildMap) throws DocumentException {
        Map<String, MetaConfigList> configList = new HashMap<>();
        listList.forEach(metaConfigList -> {
            configList.put(metaConfigList.getColumnNameAlias(), metaConfigList);
        });
        for (String name : configList.keySet()) {
            Map<String, Object> listValueMap = new HashMap<>();
            Document document = DocumentHelper.parseText(node.asXML());
            MetaConfigList metaConfig = configList.get(name);
            MetaConfigList metaConfigR = null;
            if (StringUtils.isNotEmpty(metaConfig.getRelationColumnNameAlias())) {
                if (configList.containsKey(metaConfig.getRelationColumnNameAlias())) {
                    metaConfigR = configList.get(metaConfig.getRelationColumnNameAlias());
                }
            }
            readData(document.getRootElement(), metaConfig, listMap, listValueMap, metaConfigR);
            if (null != listValueMap && listValueMap.size() > 0) {
                listChildMap.putAll(listValueMap);
            }
        }
    }
}
