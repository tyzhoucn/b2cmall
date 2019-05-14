package com.jacklin.b2cmall.manager;

import com.jacklin.b2cmall.manager.pojo.E3Result;
import com.jacklin.b2cmall.manager.pojo.EasyUIDataGridResult;
import com.jacklin.b2cmall.manager.pojo.TbItem;
import com.jacklin.b2cmall.manager.pojo.TbItemDesc;

public interface TbItemService {
    //根据ID查询商品
    TbItem getItemById(Long itemId);

    //查询所有商品
    EasyUIDataGridResult getItemList(int page, int rows);

    //添加商品
    E3Result addItem(TbItem item, String desc);

    TbItemDesc getItemDescById(Long itemId);
}
