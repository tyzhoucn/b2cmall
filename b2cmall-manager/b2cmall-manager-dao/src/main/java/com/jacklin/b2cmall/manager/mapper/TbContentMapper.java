package com.jacklin.b2cmall.manager.mapper;


import com.jacklin.b2cmall.manager.pojo.TbContent;

import java.util.List;

public interface TbContentMapper {
    List<TbContent> getContentListByCategoryId(Long categoryId);

    List<TbContent> getAllContentList();

    void insertContent(TbContent tbContent);
}
