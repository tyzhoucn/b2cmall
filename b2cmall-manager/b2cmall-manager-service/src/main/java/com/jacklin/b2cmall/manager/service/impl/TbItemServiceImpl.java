package com.jacklin.b2cmall.manager.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jacklin.b2cmall.manager.TbItemService;
import com.jacklin.b2cmall.manager.mapper.TbItemDescMapper;
import com.jacklin.b2cmall.manager.mapper.TbItemMapper;
import com.jacklin.b2cmall.manager.pojo.E3Result;
import com.jacklin.b2cmall.manager.pojo.EasyUIDataGridResult;
import com.jacklin.b2cmall.manager.pojo.TbItem;
import com.jacklin.b2cmall.manager.pojo.TbItemDesc;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 商品信息业务实现
 */
@Service
public class TbItemServiceImpl implements TbItemService {

    @Autowired
    private TbItemMapper tbItemMapper;

    @Autowired
    private TbItemDescMapper tbItemDescMapper;


    /**
     * 格局ID查询商品
     *
     * @param itemId
     * @return
     */
    @Override
    public TbItem getItemById(Long itemId) {
        return null;
    }

    /**
     * 查询所有商品
     *
     * @param page
     * @param rows
     * @return
     */
    @Override
    public EasyUIDataGridResult getItemList(int page, int rows) {
        //设置分页信息
        PageHelper.startPage (page, rows);
        //执行查询
        List<TbItem> list = tbItemMapper.getItemList ();
        //取分页信息
        PageInfo<TbItem> pageInfo = new PageInfo<> (list);

        //创建返回结果对象
        EasyUIDataGridResult result = new EasyUIDataGridResult ();
        result.setTotal (pageInfo.getTotal ());
        result.setRows (list);
        return result;
    }

    /**
     * 添加商品
     *
     * @param item
     * @param desc
     * @return
     */
    @Override
    public E3Result addItem(TbItem item, String desc) {
        return null;
    }

    /**
     * 查询商品信息
     *
     * @param itemId
     * @return
     */
    @Override
    public TbItemDesc getItemDescById(Long itemId) {
        return null;
    }

}
