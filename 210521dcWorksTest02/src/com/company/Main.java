package com.company;

public class Main {

    public static void main(String[] args) {
	    for (int i=1; i<= 10; i++) {
            int x = 14515200 / i;
            if (i == 10) {
                System.out.println(x + "＊");
                System.out.println("答えは" + x);
                break;
            } else if (x >= 50000) {
                System.out.println(x + "＊");
            } else if (x < 50000) {
                System.out.println(x);
            }
            }
        }
    }

