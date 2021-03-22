package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);    //terminalから入力されたデータを反映

    public static void main(String[] args) {

        int[] myInteger = getIntegers(5);
    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];    //int[] arrayにいくつの数字を格納できるのか
        System.out.println("Enter " + capacity + " integer values:\r");
        for (int i= 0; i< array.length; i++) {  //int[] arrayの長さの分だけ
            array[i] = scanner.nextInt();   //入力されたiの「数」（数値ではない）の
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println("Element" + i + "contents" + array[i]);
        }
    }

    public static void sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for(int i=0; i<array.length; i++) {
            sortedArray[i] = array[i];  //
        }
        boolean flag = true;
        int temp;   //入力された数値の一時格納場所
        while(flag) {
            flag = false;
            for(int i=0; i<sortedArray.length-1; i++) {
                if(
                        
                )
            }
        }

    }
}
