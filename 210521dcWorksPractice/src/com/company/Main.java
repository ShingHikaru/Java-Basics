package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("3で割り切れる場合○、5で割り切れる場合●、3,5で割り切れる場合▲とします。");
	    for(int i=1; i <= 100; i++) {
	        if (i % 15 == 0) {
                System.out.println("▲ " + i + " => " + "fizzbuzz");
            } else if(i % 3 == 0) {
                System.out.println("○ " + i + " => " + "fizz");
            } else if(i % 5 == 0) {
                System.out.println("● " + i + " => " + "buzz");
            }
        }
    }
}
