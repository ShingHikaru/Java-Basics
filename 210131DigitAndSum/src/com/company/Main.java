package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumDigits(124));
//        int num = 1200;
//        int sum = 0;
//        while (num > 0) {
//            sum = sum + num % 10;
//            num = num / 10;
//        }
//        System.out.println(sum);
    }


    public static int sumDigits(int number) {

        int sum = 0;

        while (number > 0) {
            if (number >= 10) {
                System.out.println("Sum of all digits = " + sum);
                sum = sum + number % 10;
                number++;
                number = number / 10;
            }else if((number >= 0) && (number <= 9)){
                return -1;
            }

            if ((number >= 0) && (number <= 9)) {
                return -1;
            }
            break;
        }
    }
}

