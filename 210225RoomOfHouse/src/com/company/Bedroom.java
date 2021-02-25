package com.company;

public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Wall wall5;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Wall wall5, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.wall5 = wall5;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return this.lamp;
    }

    public void makingBed() {
        System.out.println("Bedroom -> Making bed.");
        bed.make();
    }

}
