package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        INVALID_VALUE_MESSAGE = "Hello";


        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));

    }
    private static String getDurationString(long minutes, long seconds) {
        if((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid value";
        }

        long hours = minutes / 60L;
        long remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if(hours < 10) {
            hoursString = "0" + hoursString;
        }
        String minutesString = remainingMinutes + "m";
        if(remainingMinutes < 10) {
            minutesString = "0" + minutesString;
        }
        String secondString = seconds + "s";
        if (seconds < 10) {
            secondString = "0" + secondString;
        }

        return hoursString + minutesString + secondString;
    }

    private static String getDurationString(long seconds) {
        if(seconds < 0) {
            return "Invalid value";
        }
        long minutes = seconds / 60;  //second = input second value
        long remainingSecond = seconds % 60; //remainingSecond = no input second(input second - 60x)

        return getDurationString(minutes, remainingSecond);
    }

}
