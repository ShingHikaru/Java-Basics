package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(9, 99));
    }

    public static boolean hasSharedDigit (int numberLeft, int numberRight) {

        if ((numberLeft < 10) || (numberLeft > 99) || (numberRight < 10) || (numberRight > 99)) {
            return false;
        }

        while (( numberLeft > 0) & (numberRight > 0)) {
            int lastDigitLeft = numberLeft % 10;
            int firstDigitLeft = numberLeft / 10;
            int lastDigitRight = numberRight % 10;
            int firstDigitRight = numberRight / 10;

            if ((lastDigitLeft == lastDigitRight) || (lastDigitLeft == firstDigitRight) ||
                    (firstDigitLeft == lastDigitRight) || (firstDigitLeft == firstDigitRight)) {
                return true;
            }else{
                return false;
            }
        }

        return false;

    }
}
