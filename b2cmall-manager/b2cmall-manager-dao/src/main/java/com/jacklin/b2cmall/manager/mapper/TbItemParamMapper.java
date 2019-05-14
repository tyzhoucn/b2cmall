package com.jacklin.b2cmall.manager.mapper;


import com.jacklin.b2cmall.manager.pojo.TbItemParam;
import com.jacklin.b2cmall.manager.pojo.TbItemParamAndName;

import java.util.List;

public interface TbItemParamMapper {

    List<TbItemParamAndName> getItemParamList();

    TbItemParam getItemParamByCid(Long cid);

    Integer insertItemParam(TbItemParam tbItemParam);
}
