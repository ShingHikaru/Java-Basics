package com.company;

public class Main {

    public static void main(String[] args) {
	Point first = new Point(6, 5);
	Point second = new Point(3,1);

        System.out.println("distance(0,0)=" + first.distance());
        System.out.println("distance(Second)=" + first.distance(second));
    }
}
