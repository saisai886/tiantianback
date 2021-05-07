package com.guigu.tian.entity.jiangweijie;

import com.guigu.tian.entity.Gongyingshop;

public class Supcaigousp extends Gongyingshop {
    private int cgid;
    private String cdxiaoji;
    private String cdzhuangtai;
    private int cdcoun;

    public int getCgid() {
        return cgid;
    }

    public void setCgid(int cgid) {
        this.cgid = cgid;
    }

    public String getCdxiaoji() {
        return cdxiaoji;
    }

    public void setCdxiaoji(String cdxiaoji) {
        this.cdxiaoji = cdxiaoji;
    }

    public String getCdzhuangtai() {
        return cdzhuangtai;
    }

    public void setCdzhuangtai(String cdzhuangtai) {
        this.cdzhuangtai = cdzhuangtai;
    }

    public int getCdcoun() {
        return cdcoun;
    }

    public void setCdcoun(int cdcoun) {
        this.cdcoun = cdcoun;
    }

    @Override
    public String toString() {
        return "Supcaigousp{" +
                "cgid=" + cgid +
                ", cdxiaoji='" + cdxiaoji + '\'' +
                ", cdzhuangtai='" + cdzhuangtai + '\'' +
                ", cdcoun=" + cdcoun +
                '}';
    }

    public Supcaigousp() {
    }

    public Supcaigousp(int cgid, String cdxiaoji, String cdzhuangtai, int cdcoun) {
        this.cgid = cgid;
        this.cdxiaoji = cdxiaoji;
        this.cdzhuangtai = cdzhuangtai;
        this.cdcoun = cdcoun;
    }
}
