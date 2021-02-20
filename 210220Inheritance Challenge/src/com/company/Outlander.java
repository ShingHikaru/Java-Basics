package com.company;

public class Outlander extends Car{
    private int roadServiceMonth;

    public Outlander(int roadServiceMonth) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonth = roadServiceMonth;
    }

    public void acceralerate (int rate) {
        int newVelocity = getCurrentVelocity() + rate;


        if (newVelocity == 0) {

        }
}
}
