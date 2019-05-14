package com.jacklin.b2cmall.manager.mapper;


import com.jacklin.b2cmall.manager.pojo.TbItem;

import java.util.List;

public interface TbItemMapper {

    TbItem selectByPrimaryKey(Long id);

    List<TbItem> getItemList();

    void insert(TbItem item);
}