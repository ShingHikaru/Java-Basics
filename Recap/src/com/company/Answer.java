package com.company;

public class Answer {

    public static void answer(String[] args) {
        System.out.println(getDurationString(65, 4));

    }
    private static String getDurationString(long minutes, long second) {
        if((minutes < 0) || (second < 0) || (second > 59)) {
            return "Invalid value";
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + "h" + remainingMinutes + "m" + second + "s";
    }



}
