package com.company;

public class Point {
    private int x;
    private int y;

    public Point () {
    }
    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance () {
        return Math.sqrt((this.x) + (this.y));    //(0,0)地点との距離なので、Math.sqrt((x - 0) + (y - 0))
    }
    public double distance (int xA, int yA) {
        return Math.sqrt((xA - x) * (xA - x) + (yA - y) * (yA - y));
    }
    public double distance (Point) {
        return Math.sqrt()


    }

}
