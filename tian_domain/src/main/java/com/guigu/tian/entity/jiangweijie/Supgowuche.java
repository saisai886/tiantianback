package com.guigu.tian.entity.jiangweijie;

import com.guigu.tian.entity.Shop;

public class Supgowuche extends Shop {

    private int Scount;

    private  String sgwstate;
    private boolean check=false;

    @Override
    public String toString() {
        return "Supgowuche{" +
                "Scount=" + Scount +
                ", sgwstate='" + sgwstate + '\'' +
                ", check=" + check +
                '}';
    }

    public int getScount() {
        return Scount;
    }

    public void setScount(int scount) {
        Scount = scount;
    }

    public String getSgwstate() {
        return sgwstate;
    }

    public void setSgwstate(String sgwstate) {
        this.sgwstate = sgwstate;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public Supgowuche() {
    }

    public Supgowuche(int scount, String sgwstate, boolean check) {
        Scount = scount;
        this.sgwstate = sgwstate;
        this.check = check;
    }
}
