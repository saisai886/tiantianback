package com.guigu.tian.entity.jiangweijie;

public class Supchanxu {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Supchanxu() {
    }

    public Supchanxu(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Supchanxu{" +
                "name='" + name + '\'' +
                '}';
    }
}
