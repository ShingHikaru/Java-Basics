package com.company;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }
    public String accelerate() {
        return "Car -> accelerate()";
    }
    public String brake() {
        return "Car -> brake";
    }
}

class Mitsubishi extends Car {
    public Mitsubishi (int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitshbishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitshbishi -> brake()";
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}

class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Holden -> accelerate()";
    }

    @Override
    public String brake() {
        return "Holden -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
	    Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.brake());
        System.out.println(car.accelerate());
        Mitsubishi mitsubishi = new Mitsubishi(6, "kar");
        System.out.println(mitsubishi.accelerate());
    }


}
