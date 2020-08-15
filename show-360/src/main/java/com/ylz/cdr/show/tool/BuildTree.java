package com.ylz.cdr.show.tool;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class BuildTree {

    /**
     * 两层循环实现建树
     *
     * @param treeNodes 传入的树节点列表
     * @return
     */
    public static List<DomainInfoTree> bulid(List<DomainInfoTree> treeNodes) {

        List<DomainInfoTree> trees = new ArrayList<DomainInfoTree>();

        for (DomainInfoTree treeNode : treeNodes) {

            if (StringUtils.isEmpty(treeNode.getParentDomainId())) {
                trees.add(treeNode);
            }
            for (DomainInfoTree it : treeNodes) {
                if (it.getParentDomainId() == treeNode.getDomainId()) {
                    if (treeNode.getChildren() == null) {
                        treeNode.setChildren(new ArrayList<DomainInfoTree>());
                    }
                    treeNode.getChildren().add(it);
                }
            }
        }
        return trees;
    }

    /**
     * 使用递归方法建树
     *
     * @param treeNodes
     * @return
     */
    public static List<DomainInfoTree> buildByRecursive(List<DomainInfoTree> treeNodes) {
        List<DomainInfoTree> trees = new ArrayList<DomainInfoTree>();
        for (DomainInfoTree treeNode : treeNodes) {
            if (StringUtils.isEmpty(treeNode.getParentDomainId())) {
                trees.add(findChildren(treeNode, treeNodes));
            }
        }
        return trees;
    }

    /**
     * 递归查找子节点
     *
     * @param treeNodes
     * @return
     */
    public static DomainInfoTree findChildren(DomainInfoTree treeNode, List<DomainInfoTree> treeNodes) {
        for (DomainInfoTree it : treeNodes) {
            if (StringUtils.equals(treeNode.getDomainId(), it.getParentDomainId())) {
                if (CollectionUtils.isEmpty(treeNode.getChildren())) {
                    treeNode.setChildren(new ArrayList<DomainInfoTree>());
                }
                treeNode.getChildren().add(findChildren(it, treeNodes));
            }
        }
        return treeNode;
    }
}
