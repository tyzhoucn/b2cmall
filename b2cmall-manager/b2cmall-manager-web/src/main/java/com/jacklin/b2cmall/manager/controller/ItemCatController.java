package com.jacklin.b2cmall.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jacklin.b2cmall.manager.ItemCatService;
import com.jacklin.b2cmall.manager.pojo.EasyUITreeNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 类目控制器
 */
@Controller
@RequestMapping("/item/cat")
public class ItemCatController {

    @Reference
    private ItemCatService itemCatService;

    @RequestMapping("/list")
    @ResponseBody
    public List<EasyUITreeNode> getItemCatList(@RequestParam(value = "id", defaultValue = "0") Long parentId) {
        List<EasyUITreeNode> list = itemCatService.getCatList (parentId);
        return list;
    }
}
