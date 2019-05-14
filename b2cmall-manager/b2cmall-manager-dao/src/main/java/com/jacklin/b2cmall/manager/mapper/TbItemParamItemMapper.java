package com.jacklin.b2cmall.manager.mapper;


import com.jacklin.b2cmall.manager.pojo.TbItemParamItem;

public interface TbItemParamItemMapper {
    void insert(TbItemParamItem tbItemParamItem);

    TbItemParamItem selectItemParamByItemId(Long itemId);
}
