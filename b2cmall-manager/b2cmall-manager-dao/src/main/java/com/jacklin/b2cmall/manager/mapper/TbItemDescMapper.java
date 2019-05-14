package com.jacklin.b2cmall.manager.mapper;


import com.jacklin.b2cmall.manager.pojo.TbItemDesc;

public interface TbItemDescMapper {

    void insert(TbItemDesc tbItemDesc);

    TbItemDesc selectItemDescByPrimaryKey(Long itemId);
}
