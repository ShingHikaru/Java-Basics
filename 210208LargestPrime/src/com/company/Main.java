package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int getLargestPrime (int num) {

        if (num <= 0) {
            return -1;
        }
        if (num >0) {
            //公約数は割り切れる数だから、num % cdNum = 0
            for (int i=0; i<=num/i; i++) {
                if (num % i != 0) {
                    return -1;
                }else if(num % i == 0) {
                    return
                }
            }


        }
    }
}
