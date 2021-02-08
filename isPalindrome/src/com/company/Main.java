package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-123421));

    }

    public static boolean isPalindrome(int number) {

         number = 0;
         int reverse = 0;

         while(number > 0) {
             int lastDigit = number % 10;
             reverse += lastDigit;
             reverse = (reverse * 10) + lastDigit;

             number = number / 10;
         }
         if (number == reverse) {
             return true;
         }
         else {
             return false;
         }


        }
    }

