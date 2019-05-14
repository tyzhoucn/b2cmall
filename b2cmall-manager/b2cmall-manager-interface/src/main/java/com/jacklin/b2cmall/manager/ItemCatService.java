package com.jacklin.b2cmall.manager;

import com.jacklin.b2cmall.manager.pojo.EasyUITreeNode;

import java.util.List;

/**
 * 查询类目节点信息
 */
public interface ItemCatService {

    List<EasyUITreeNode> getCatList(Long parentId);
}
