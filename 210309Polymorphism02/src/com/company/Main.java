package com.company;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
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

class Mitshbishi extends Car {

    public Mitshbishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitshbishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitshbishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitshbishi -> brake";
    }
}


public class Main {

    public static void main(String[] args) {
	    Car car = new Car(4, "Ramrider");
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println(car.startEngine());

        Mitshbishi mitsubishi = new Mitshbishi(5, "Panzo");
        System.out.println(mitsubishi.accelerate());
    }

    static class Folden extends Car {

        public Folden(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "Mitshbishi -> startEngine()";
        }

        @Override
        public String accelerate() {
            return "Mitshbishi -> accelerate()";
        }

        @Override
        public String brake() {
            return "Mitshbishi -> brake";
        }
    }
}
