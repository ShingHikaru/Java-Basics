package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] alphArray = {"A", "E", "G", "I", "O", "S", "Z"};
        int[] numArray = {4, 3, 6, 1, 0, 5, 2};
        for(int i=0; i< alphArray.length; i++) {
            for(String str: alphArray) {
                if(line == str) {
                    System.out.println(numArray[i]);
                }

            }
        }
    }
}