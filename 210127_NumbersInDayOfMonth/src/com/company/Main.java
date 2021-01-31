package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        isLeapYear(1600);
        isLeapYear(-1600);
        isLeapYear(2017);
        isLeapYear(2000);

        getDaysInMonth(1, 2020);
        getDaysInMonth(2, 2020);

    }

    public static int isLeapYear(int year) {

        boolean year = false;   //I don't know boolean type version.public static boolean??
        for (year < 1; year> 9999;) {
            System.out.println("");
        }


        if ((year < 1) && (year > 9999)) {
            System.out.println("false");
        } else if (year % 4 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        return year;

    }

    private static int getDaysInMonth(int month, int year) {

        if ((month < 1) && (month > 12)) {
            return -1;
        }else if((year < 1) && (year > 9999)){
            return  -1;
        }

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30");
                break;
            case 2:
                if (year % 4 == 0) {
                    System.out.println("29");
            }else if(!(year % 4 == 0))
                    System.out.println("28");
            }

        return month;

        }
    }
