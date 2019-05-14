package com.jacklin.b2cmall.manager.mapper;


import com.jacklin.b2cmall.manager.pojo.TbItemCat;

import java.util.List;

public interface TbItemCatMapper {
    List<TbItemCat> getItemCatByParentId(long parentId);

    String getItemCatNameById(long id);
}
