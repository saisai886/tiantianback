package com.guigu.tian.entity.jiangweijie;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.guigu.tian.entity.Userdtails;

public class Supuserlogn extends Userdtails {

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
    //用户状态
    private String  userzhuangtai;

    //后台
    private String userboutten;

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

    public String getUserzhuangtai() {
        return userzhuangtai;
    }

    public void setUserzhuangtai(String userzhuangtai) {
        this.userzhuangtai = userzhuangtai;
    }

    public String getUserboutten() {
        return userboutten;
    }

    public void setUserboutten(String userboutten) {
        this.userboutten = userboutten;
    }

    public Supuserlogn() {
    }

    @Override
    public String toString() {
        return "Supuserlogn{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upawssword='" + upawssword + '\'' +
                ", updomestic='" + updomestic + '\'' +
                ", upsupplier='" + upsupplier + '\'' +
                ", upbusiness='" + upbusiness + '\'' +
                ", userzhuangtai='" + userzhuangtai + '\'' +
                ", userboutten='" + userboutten + '\'' +
                '}';
    }

    public Supuserlogn(int uid, String uname, String upawssword, String updomestic, String upsupplier, String upbusiness, String userzhuangtai, String userboutten) {
        this.uid = uid;
        this.uname = uname;
        this.upawssword = upawssword;
        this.updomestic = updomestic;
        this.upsupplier = upsupplier;
        this.upbusiness = upbusiness;
        this.userzhuangtai = userzhuangtai;
        this.userboutten = userboutten;
    }
}
