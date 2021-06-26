package com.company;

import java.util.Scanner;

public class Main {
//    private static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//
//    }
//
//    public static void readIntegers(int inputNum) {
//        inputNum = scanner.nextInt();
//        int array[] = new int[];
//        for (int i=0; i< array.length; i++) {
//            array[i] = inputNum;
//            if (i == array.length-1) {
//                System.out.println(i);
//            }
//        }
//
//    }

    public static Scanner scanner = new Scanner(System.in).useDelimiter("\\s \\s");

    public static void main(String[] args) {
        int count = scanner.nextInt();
        scanner.nextLine();
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[];

        for (int i=0; i< array.length; i++) {
            System.out.println("Enter number ->");
            array[i] = scanner.nextInt();
            scanner.nextLine(); //仮に数値ではない文字列の入力があってもエラーが出ないようにするため
        }
    }
}
