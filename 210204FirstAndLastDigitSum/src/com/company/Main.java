package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(5));

    }

    public static int sumFirstAndLastDigit (int number) {
        if(number < 0) {
            return -1;
        }else if (number == 0) {
            return 0;
        }else if((number < 10) && (number > 0)) {
            int sum = number * 2;
            return sum;
        }else if(number >= 10) {
            int firstDigit = Integer.parseInt(Integer.toString(number).substring(0,1));
            int lastDigit = number % 10;
            int sum = firstDigit + lastDigit;
            return sum;}

        return -1;






    }
}
