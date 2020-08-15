package com.ylz.verify.tool;

import com.ylz.cdr.common.Dom4jTool;
import com.ylz.verify.bean.VerifyConfigList;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.dom4j.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VerifyElement {
    private static final Logger log = LoggerFactory.getLogger(VerifyElement.class);

    /**
     * 取数据
     *
     * @param xml
     * @param metaConfigList
     */
    public static String setMetaXml(String xml, List<VerifyConfigList> metaConfigList) throws DocumentException {
        Document document = DocumentHelper.parseText(xml);
        Element element = document.getRootElement();
        Map<String, Object> listMap = getMap(metaConfigList);
        List<VerifyConfigList> configList = (List<VerifyConfigList>) listMap.get("list");
        List<VerifyConfigList> visitList = (List<VerifyConfigList>) listMap.get("visitInfo");
        Map<String, List<VerifyConfigList>> mapList = (Map<String, List<VerifyConfigList>>) listMap.get("map");
        StringBuilder stringBuilder = new StringBuilder();
        for (VerifyConfigList metaConfig : configList) {
            String string = readText(element, metaConfig, mapList);
            if (StringUtils.isNotEmpty(string)) {
                stringBuilder.append(string);
            }
        }
        StringBuilder visitBuilder = new StringBuilder();
        String visitId = null;
        for (VerifyConfigList metaConfig : visitList) {
            String xpathString = metaConfig.getCdaXpath();
            Node node = Dom4jTool.selectSingleNode(element, element.getNamespaceURI(), xpathString);
            if (null == node || StringUtils.isEmpty(node.getText())) {
                visitBuilder.append("\n").append(metaConfig.getInteMdname()).append(":内容为空,xpath为：").append(xpathString);
            } else {
                visitId = node.getText();
            }
        }
        if (StringUtils.isEmpty(visitId)) {
            stringBuilder.append(visitBuilder);
        }
        return stringBuilder.toString();
    }


    /**
     * 分组数据
     *
     * @param mappingInfeList
     * @return
     */
    private static Map<String, Object> getMap(List<VerifyConfigList> mappingInfeList) {
        List<VerifyConfigList> listNode = new ArrayList<>();
        List<VerifyConfigList> normalList = new ArrayList<>();
        List<VerifyConfigList> visitList = new ArrayList<>();
        mappingInfeList.forEach(mappingInfe -> {
            if (StringUtils.isNotEmpty(mappingInfe.getParentPath())) {
                listNode.add(mappingInfe);
            } else {
                if (StringUtils.equals(mappingInfe.getColumnNameAlias(), "outPatientId")) {
                    visitList.add(mappingInfe);
                } else if (StringUtils.equals(mappingInfe.getColumnNameAlias(), "inpatient")) {
                    visitList.add(mappingInfe);
                } else {
                    normalList.add(mappingInfe);
                }
            }
        });
        Map<String, List<VerifyConfigList>> listNodeMap = listNode.stream().collect(Collectors.groupingBy(VerifyConfigList::getParentPath));
        Map<String, Object> map = new HashMap<>();
        map.put("list", normalList);
        map.put("map", listNodeMap);
        map.put("visitInfo", visitList);
        return map;
    }

    /**
     * @param elementSource 原始文件的节点
     * @param metaConfig    节点和数据源信息
     * @param listMap       list节点的信息
     */
    public static String readText(Element elementSource, VerifyConfigList metaConfig, Map<String, List<VerifyConfigList>> listMap) throws DocumentException {
        String xpathString = metaConfig.getCdaXpath();
        List<VerifyConfigList> listList = listMap.get(xpathString);
        StringBuilder builder = new StringBuilder();
        if (CollectionUtils.isEmpty(listList)) {
            List<Node> nodeList = Dom4jTool.selectNode(elementSource, elementSource.getNamespaceURI(), xpathString);
            if (CollectionUtils.isEmpty(nodeList)) {
                builder.append("\n").append(metaConfig.getInteMdname()).append(":内容为空,xpath为：").append(xpathString);
                return builder.toString();
            } else {
                for (Node node : nodeList) {
                    if (StringUtils.isEmpty(node.getText())) {
                        builder.append("\n").append(metaConfig.getInteMdname()).append(":内容为空,xpath为：").append(xpathString);
                        return builder.toString();
                    }
                }
            }

        } else {
            List<Node> nodeList = Dom4jTool.selectNode(elementSource, elementSource.getNamespaceURI(), xpathString);
            if (CollectionUtils.isEmpty(nodeList)) {
                builder.append("\n").append(metaConfig.getInteMdname()).append(":内容为空,xpath为：").append(xpathString);
                return builder.toString();
            } else {
                for (Node node : nodeList) {
                    if (StringUtils.isEmpty(node.getText())) {
                        builder.append("\n").append(metaConfig.getInteMdname()).append(":内容为空,xpath为：").append(xpathString);
                        return builder.toString();
                    }
                }
            }
            for (Node node : nodeList) {
                for (VerifyConfigList config : listList) {
                    Document document = DocumentHelper.parseText(node.asXML());
                    String string = readText(document.getRootElement(), config, listMap);
                    if (StringUtils.isNotEmpty(string)) {
                        builder.append(string);
                    }
                }
            }
        }
        return builder.toString();
    }
}
