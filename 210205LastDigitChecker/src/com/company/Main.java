package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(25, 46, 87));
        System.out.println(isValid(211));

    }

    public static boolean hasSameLastDigit (int numFirst, int numSecond, int numThird) {
        if ((numFirst < 10) || (numFirst > 1000) || (numSecond < 10) || (numSecond > 1000) ||
                (numThird < 10) || (numThird > 1000)) {
            return false;
        }
        while ((numFirst >0) & (numSecond >0) & (numThird >0)) {
            int digitNF = numFirst % 10;
            numFirst = numFirst / 10;
            int digitNS = numSecond % 10;
            numSecond = numSecond / 10;
            int digitNT = numThird % 10;
            numThird = numThird / 10;

            if ((digitNF == digitNS) || (digitNF == digitNT) || (digitNS == digitNT)) {
                return true;
            }else {
                return false;
            }
        }
        return false;

    }
    public static boolean isValid (int number) {
        if ((number >= 10) && (number <= 1000)) {
            return true;
        }else{
            return false;
        }
    }
}
