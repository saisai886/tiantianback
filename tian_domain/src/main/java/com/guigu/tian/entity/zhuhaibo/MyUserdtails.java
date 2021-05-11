package com.guigu.tian.entity.zhuhaibo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.guigu.tian.entity.User;

public class MyUserdtails  extends User {


    private int udid;

    private int  uid;

    private String udname;

    private String udphone;

    private String  udaddr;

    private String  udimg;

    private String udsex;

    private Float udmoney;

    private String udpwd;

    public int getUdid() {
        return udid;
    }

    public void setUdid(int udid) {
        this.udid = udid;
    }

    @Override
    public int getUid() {
        return uid;
    }

    @Override
    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUdname() {
        return udname;
    }

    public void setUdname(String udname) {
        this.udname = udname;
    }

    public String getUdphone() {
        return udphone;
    }

    public void setUdphone(String udphone) {
        this.udphone = udphone;
    }

    public String getUdaddr() {
        return udaddr;
    }

    public void setUdaddr(String udaddr) {
        this.udaddr = udaddr;
    }

    public String getUdimg() {
        return udimg;
    }

    public void setUdimg(String udimg) {
        this.udimg = udimg;
    }

    public String getUdsex() {
        return udsex;
    }

    public void setUdsex(String udsex) {
        this.udsex = udsex;
    }

    public Float getUdmoney() {
        return udmoney;
    }

    public void setUdmoney(Float udmoney) {
        this.udmoney = udmoney;
    }

    public String getUdpwd() {
        return udpwd;
    }

    public void setUdpwd(String udpwd) {
        this.udpwd = udpwd;
    }

    @Override
    public String toString() {
        return "MyUserdtails{" +
                "udid=" + udid +
                ", uid=" + uid +
                ", udname='" + udname + '\'' +
                ", udphone='" + udphone + '\'' +
                ", udaddr='" + udaddr + '\'' +
                ", udimg='" + udimg + '\'' +
                ", udsex='" + udsex + '\'' +
                ", udmoney=" + udmoney +
                ", udpwd='" + udpwd + '\'' +
                '}';
    }
}
