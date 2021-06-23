package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in).useDelimiter("\\s");

    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);

        System.out.println("Min = " + returnedMin);
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];

        for (int i=0; i< array.length; i++) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }

        return array;
    }

    private static int findMin(int[] array) {
        int minNum = 0;
        for (int i=0; i< array.length; i++) {
            if (array[i] < array[i-1]) {
                minNum = array[i];
            }
        }
        return minNum;
    }
}
