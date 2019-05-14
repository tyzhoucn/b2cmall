package com.jacklin.b2cmall.manager.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jacklin.b2cmall.manager.ItemCatService;
import com.jacklin.b2cmall.manager.mapper.TbItemCatMapper;
import com.jacklin.b2cmall.manager.pojo.EasyUITreeNode;
import com.jacklin.b2cmall.manager.pojo.TbItemCat;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * 类目信息业务实现类
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {

    //注入DAO组件
    @Autowired
    private TbItemCatMapper tbItemCatMapper;

    /**
     * 根据 parentId查询节点信息
     *
     * @param parentId
     * @return
     */
    @Override
    public List<EasyUITreeNode> getCatList(Long parentId) {
        List<TbItemCat> itemCat = tbItemCatMapper.getItemCatByParentId (parentId);
        //转换为EasyUITreeNode列表
        List<EasyUITreeNode> easyUITreeNodes = new ArrayList<> ();
        for (TbItemCat tbItemCat : itemCat) {
            EasyUITreeNode node = new EasyUITreeNode ();
            node.setId (tbItemCat.getId ());
            node.setText (tbItemCat.getName ());
            node.setState (tbItemCat.getIsParent () ? "closed" : "open");
            //添加到列表
            easyUITreeNodes.add (node);
        }
        //返回封装好的类目集合
        return easyUITreeNodes;
    }
}
