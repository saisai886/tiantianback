package com.guigu.tian.entity.xiaosaiz;

import com.guigu.tian.entity.Shoppinglun;

public class MyUserpinglun extends Shoppinglun {

    private  String uname;

    private  String udimg;

    public String getUdimg() {
        return udimg;
    }

    public void setUdimg(String udimg) {
        this.udimg = udimg;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Override
    public String toString() {
        return "MyUserpinglun{" +
                "uname='" + uname + '\'' +
                ", udimg='" + udimg + '\'' +
                '}';
    }
}
