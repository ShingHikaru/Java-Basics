package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i=8; i>1; i--) {
            System.out.println("10,000 at " + i + " % interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        int count = 0;
        for(int i=10; i<50; i++) {
            if(
            }
        }

    }

    public static double calculateInterest(double amount,double interestRate) {
        return (amount * (interestRate/100)) ;
    }
}
