package com.guigu.tian.entity.jiangweijie;

public class Supgowuchetiaoiang {
    private String id;
    private String name;

    @Override
    public String toString() {
        return "Supgowuchetiaoiang{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Supgowuchetiaoiang() {
    }

    public Supgowuchetiaoiang(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
