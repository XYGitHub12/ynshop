package com.zc.manager.pojo.vo;

import com.zc.manager.pojo.po.TbItem;

public class TbItemCustom extends TbItem {

    private String catName;
    private String statusName;

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}
