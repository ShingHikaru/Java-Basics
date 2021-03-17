package com.company;

public class Pets extends Animal{
    public String name;

    public Pets(String kind) {
        super(kind);
    }

    public void keep() {
        System.out.println(name + "という" + size + kind + "を飼っています。");
    }

    public void setName(String name) {
        this.name = name;
    }
}
