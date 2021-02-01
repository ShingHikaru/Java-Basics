package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sum of all digit = " + sumDigits(124));
    }


    public static int sumDigits(int number) {

//        int sum = 0;

//        while (number > 0) {
//            if (number >= 10) {
//                System.out.println("Sum of all digits = " + sum);
//                sum = sum + number % 10;
//                number = number / 10;
//                number++;
//
//
//            }else if((number >= 0) && (number <= 9)){
//                return -1;
//            }
//            break;
//        }
//    return sum;


        if (number <10) {
            return -1;
        }

        int sum = 0;

        //number=125の場合、一周目
        //int digit = 125 % 10 = [5],number = 125 / 10 = 12
        //2週目、残ったnumber = 12
        //int digit = 12 % 10 = [2],number = 12 / 10 = 1
        //3週目、残ったnumber = 1
        //int digit = 1 % 10 = [1],number = 1 / 10 = 0(Terminal)
        //sum = 5 + 2 + 1 = 8

        while(number >0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}

