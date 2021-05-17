package com.guigu.tian.entity.jiangweijie;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.guigu.tian.entity.hesijie.Shanghu;

public class Supshohuo extends Shanghu {
    @TableId(value = "uid",type = IdType.AUTO)
    private int uid;
    //登录名
    private String uname;
    //密码
    private String upawssword;
    //普通用户
    private String updomestic;
    //供货商
    private String upsupplier;
    //商户
    private String upbusiness;

    private  int shid;
    //默认地址
    private String usshiyong;


    @Override
    public String toString() {
        return "Supshohuo{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upawssword='" + upawssword + '\'' +
                ", updomestic='" + updomestic + '\'' +
                ", upsupplier='" + upsupplier + '\'' +
                ", upbusiness='" + upbusiness + '\'' +
                ", shid=" + shid +
                ", usshiyong='" + usshiyong + '\'' +
                '}';
    }

    public Supshohuo() {
    }

    public Supshohuo(int uid, String uname, String upawssword, String updomestic, String upsupplier, String upbusiness, int shid, String usshiyong) {
        this.uid = uid;
        this.uname = uname;
        this.upawssword = upawssword;
        this.updomestic = updomestic;
        this.upsupplier = upsupplier;
        this.upbusiness = upbusiness;
        this.shid = shid;
        this.usshiyong = usshiyong;
    }

    @Override
    public int getUid() {
        return uid;
    }

    @Override
    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpawssword() {
        return upawssword;
    }

    public void setUpawssword(String upawssword) {
        this.upawssword = upawssword;
    }

    public String getUpdomestic() {
        return updomestic;
    }

    public void setUpdomestic(String updomestic) {
        this.updomestic = updomestic;
    }

    public String getUpsupplier() {
        return upsupplier;
    }

    public void setUpsupplier(String upsupplier) {
        this.upsupplier = upsupplier;
    }

    public String getUpbusiness() {
        return upbusiness;
    }

    public void setUpbusiness(String upbusiness) {
        this.upbusiness = upbusiness;
    }

    @Override
    public int getShid() {
        return shid;
    }

    @Override
    public void setShid(int shid) {
        this.shid = shid;
    }

    public String getUsshiyong() {
        return usshiyong;
    }

    public void setUsshiyong(String usshiyong) {
        this.usshiyong = usshiyong;
    }
}
