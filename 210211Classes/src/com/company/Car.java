package com.company;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String Colour;

    public void setModel (String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("Porsche") || validModel.equals("holden")) {
            this.model = model;
        }else {
            this.model = "Unknown"
        }
    }

    public String getModel() {
        return this.model;
    }

}
