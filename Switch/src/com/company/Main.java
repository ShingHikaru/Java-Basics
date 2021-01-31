package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
//	    int value = 1;
//	    if(value == 1) {
//            System.out.println("Value was 1.");
//        }else if(value == 2){
//            System.out.println("Value was 2");
//        }else{
//            System.out.println("Was not 1 or 2.");
//        }

//	    int switchValue = 1;
//
//	    switch (switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//
//            case 2:
//                System.out.println("Value was 2");
//                break;
//
//            default:
//                System.out.println("Was not 1 or 2");
//                break;
//
//	    }
//        char charValue = 'D';
//
//        switch (charValue) {
//            case 'A':
//                System.out.println("Value was A");
//                break;
//            case 'B': case 'C': case 'D':
//                System.out.println("Value was B or C or D");
//                System.out.println("Actually value was " + charValue);
//                break;
//            default:
//                System.out.println("Not found");
//        }


        String month ="jANuary";
        switch (month.toLowerCase()) {
            case "January":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }

    }
}
