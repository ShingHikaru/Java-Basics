package com.company;

public class Calculator {
    public Floor floor;
    public Carpet carpet;


    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost() {

        return floor.getArea() * Carpet.getCost(); //1 area = 8$
    }
}
