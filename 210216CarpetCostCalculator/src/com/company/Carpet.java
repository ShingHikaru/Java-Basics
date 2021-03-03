package com.company;

public class Carpet {
    private double theCost;

    public Carpet(double theCost) {
        this.theCost = theCost;
        if (this.theCost < 0) {
            theCost = 0;
        }
    }

    public double getTheCost() {
        return theCost;
    }
}
