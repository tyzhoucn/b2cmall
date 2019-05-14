package com.jacklin.b2cmall.manager.mapper;


import com.jacklin.b2cmall.manager.pojo.TbContentCategory;

import java.util.List;

public interface TbContentCategoryMapper {
    List<TbContentCategory> selectTbContentCatsByParentId(Long parentId);

    void insertCategory(TbContentCategory contentCategory);

    TbContentCategory selectTbContentCatById(Long id);

    void updateContentCategoryById(TbContentCategory parentContentCategory);
}
