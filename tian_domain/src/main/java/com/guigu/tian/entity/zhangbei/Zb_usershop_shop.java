package com.guigu.tian.entity.zhangbei;

import com.guigu.tian.entity.Shop;
import com.guigu.tian.entity.Usershop;

public class Zb_usershop_shop extends Usershop {
    private String sname;
    private Integer sprice;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSprice() {
        return sprice;
    }

    public void setSprice(Integer sprice) {
        this.sprice = sprice;
    }
}
