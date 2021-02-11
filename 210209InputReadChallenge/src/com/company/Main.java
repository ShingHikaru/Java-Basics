package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;

        while (true) {
            int order = counter + 1;
            System.out.println("Enter Number # " + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if (counter == 10) {
                    System.out.println("sum = " + sum);
                    break;
                }
            }else{
                System.out.println("Invalid Number");
            }
        }

        scanner.close();

//        boolean hasNextInt = scanner.hasNextInt();
//
//        int inputNum = scanner.nextInt();
//
//        if (hasNextInt) {
//
//            while(inputNum[) {
//                int sum = inputNum++;
//                System.out.println("sum = " + sum);
//            }
//
//
//        }else if (!(hasNextInt)){
//            System.out.println("Please input Number again.");
//        }



    }
}
