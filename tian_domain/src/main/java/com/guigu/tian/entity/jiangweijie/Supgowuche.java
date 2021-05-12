package com.guigu.tian.entity.jiangweijie;

import com.guigu.tian.entity.Shop;

public class Supgowuche extends Shop {

    private int Scount;

    public int getScount() {
        return Scount;
    }

    public void setScount(int scount) {
        Scount = scount;
    }

    public Supgowuche() {
    }

    public Supgowuche(int scount) {
        Scount = scount;
    }

    @Override
    public String toString() {
        return "Supgowuche{" +
                "Scount=" + Scount +
                '}';
    }
}
