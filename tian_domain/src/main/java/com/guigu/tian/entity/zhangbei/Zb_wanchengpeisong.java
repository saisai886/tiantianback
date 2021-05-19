package com.guigu.tian.entity.zhangbei;

import com.guigu.tian.entity.Userdingdan;

public class Zb_wanchengpeisong extends Userdingdan {
    //配送id
    private Integer pcid;
    //员工id
    private Integer ygid;
    //车辆id
    private Integer clcid;
    //配送定单
    private String peisongid;
    //配送状态
    private String pzhuangtai;
    //员工状态
    private String ygzhuangtai;
    //车辆状态
    private String clzhuangtai;

    public Integer getPcid() {
        return pcid;
    }

    public void setPcid(Integer pcid) {
        this.pcid = pcid;
    }

    public Integer getYgid() {
        return ygid;
    }

    public void setYgid(Integer ygid) {
        this.ygid = ygid;
    }

    public Integer getClcid() {
        return clcid;
    }

    public void setClcid(Integer clcid) {
        this.clcid = clcid;
    }

    public String getPeisongid() {
        return peisongid;
    }

    public void setPeisongid(String peisongid) {
        this.peisongid = peisongid;
    }

    public String getPzhuangtai() {
        return pzhuangtai;
    }

    public void setPzhuangtai(String pzhuangtai) {
        this.pzhuangtai = pzhuangtai;
    }

    public String getYgzhuangtai() {
        return ygzhuangtai;
    }

    public void setYgzhuangtai(String ygzhuangtai) {
        this.ygzhuangtai = ygzhuangtai;
    }

    public String getClzhuangtai() {
        return clzhuangtai;
    }

    public void setClzhuangtai(String clzhuangtai) {
        this.clzhuangtai = clzhuangtai;
    }
}
