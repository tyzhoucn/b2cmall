package com.jacklin.b2cmall.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jacklin.b2cmall.manager.TbItemService;
import com.jacklin.b2cmall.manager.pojo.E3Result;
import com.jacklin.b2cmall.manager.pojo.EasyUIDataGridResult;
import com.jacklin.b2cmall.manager.pojo.TbItem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/item")
public class TbItemController {


    @Reference
    private TbItemService tbItemService;

    @GetMapping("/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable Long itemId) {
        return tbItemService.getItemById (itemId);
    }

    /**
     * 查询列表
     *
     * @param page
     * @param rows
     * @return
     */
    @GetMapping("/list")
    @ResponseBody
    public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
        EasyUIDataGridResult result = tbItemService.getItemList (page, rows);
        return result;
    }

    @RequestMapping("/save")
    @ResponseBody
    public E3Result saveItem(TbItem item, String desc) {
        E3Result result = tbItemService.addItem (item, desc);
        return result;
    }
}
