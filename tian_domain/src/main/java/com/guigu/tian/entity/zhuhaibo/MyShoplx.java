package com.guigu.tian.entity.zhuhaibo;

import com.guigu.tian.entity.Shop;

public class MyShoplx extends Shop {


    private  String stname;

    private  Integer stpanentid;

    public String getStname() {
        return stname;
    }

    public void setStname(String stname) {
        this.stname = stname;
    }

    public Integer getStpanentid() {
        return stpanentid;
    }

    public void setStpanentid(Integer stpanentid) {
        this.stpanentid = stpanentid;
    }

    @Override
    public String toString() {
        return "MyShoplx{" +
                "stname='" + stname + '\'' +
                ", stpanentid=" + stpanentid +
                '}';
    }
}
