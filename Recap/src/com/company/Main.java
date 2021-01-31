package com.company;

public class Main {

    public static void main(String[] args) {
        int hourMinutesSecond = getDurationString(70,49);
        System.out.println(hourMinutesSecond);

    }

    public static int getDurationString (int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            System.out.println("Invalid value");
            return -1;
        }

        int hours = minutes * 60;
        minutes = seconds * 60;
        System.out.println(hours + "h" + minutes + "m" + seconds + "s");
        return getDurationString(minutes, seconds);
    }
}
