package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumOdd(-1, 100));
    }

    public static boolean isOdd(int n) {
        if (n < 0) {
            return false;
        } else if (!(n % 2 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {

        int sum = 0;

        for (int i = start; i <= end; i++) {
            if ((!(i % 2 == 0)) && (start <= end) && (start >= 0) && (end >= 0)) {
                sum += i;

            } else if((i % 2 == 0) && (start == i) && (end == i)){
                return 0;
            } else if((start > end) && (start < 0) && (end < 0)) {
                return -1;
            }
        }

        return sum;
    }
}

