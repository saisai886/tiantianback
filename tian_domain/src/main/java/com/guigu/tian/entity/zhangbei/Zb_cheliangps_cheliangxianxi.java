package com.guigu.tian.entity.zhangbei;

import com.guigu.tian.entity.Cheliangxianxi;

public class Zb_cheliangps_cheliangxianxi extends Cheliangxianxi {
    private int  ygid;
    private int  clcid;
    private String ygname;
    private String peisongid;
    private String pzhuangtai;


    public int getClcid() {
        return clcid;
    }

    public void setClcid(int clcid) {
        this.clcid = clcid;
    }

    public String getPzhuangtai() {
        return pzhuangtai;
    }

    public void setPzhuangtai(String pzhuangtai) {
        this.pzhuangtai = pzhuangtai;
    }

    public int getYgid() {
        return ygid;
    }

    public void setYgid(int ygid) {
        this.ygid = ygid;
    }

    public String getYgname() {
        return ygname;
    }

    public void setYgname(String ygname) {
        this.ygname = ygname;
    }

    public String getPeisongid() {
        return peisongid;
    }

    public void setPeisongid(String peisongid) {
        this.peisongid = peisongid;
    }
}
