package com.guigu.tian.entity.zhangbei;

import com.guigu.tian.entity.Userdingdan;

public class Zb_userdingdan_user_shanghu extends Userdingdan {
    //用户姓名
    private String uname;
    //商户名称
    private String shname;
    //商户地址
    private String shaddr;

    private int spsid;

    public int getSpsid() {
        return spsid;
    }

    public void setSpsid(int spsid) {
        this.spsid = spsid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getShname() {
        return shname;
    }

    public void setShname(String shname) {
        this.shname = shname;
    }

    public String getShaddr() {
        return shaddr;
    }

    public void setShaddr(String shaddr) {
        this.shaddr = shaddr;
    }
}
