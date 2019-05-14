package com.jacklin.b2cmall.manager.pojo;

import java.io.Serializable;

public class TbItemParamAndName extends TbItemParam implements Serializable {

    private String itemCatName;

    public String getItemCatName() {
        return itemCatName;
    }

    public void setItemCatName(String itemCatName) {
        this.itemCatName = itemCatName;
    }
}
