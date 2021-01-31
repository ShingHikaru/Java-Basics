package com.company;

public class Main {

    public static void main(String[] args) {

        long minutes = 525600;

        printYearsAndDays(minutes);

    }


    public static void printYearsAndDays (long minutes) {

        long year = minutes / 525600;
        long remainingMinutes = minutes % 525600;
        long day = remainingMinutes / (60 * 24); //60(1hour) * 24(1day 24 hour)

        if(minutes <= 0) {
            System.out.println("Invalid Value");
        }else {
            System.out.println(minutes + " min = " + year + " y " + day + " d ");

        }


    }


}
