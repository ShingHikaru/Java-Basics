package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage () {

        Scanner scanner = new Scanner(System.in);

        double sum = 0.0d;  //切り上げを使いたいため、一時的にdoubleを使う（書き出しはMath.roundでIntegerとして書き出す）
        long average = (long) 0.0000;
        double count = 0.0;

        while (true) {

            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                
                count = count + 1;
                sum = sum + number;
                average = (long) Math.ceil(sum / count);    //Math.ceilで切り上げ
            }else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + Math.round(sum) + " AVG = " + average);
    }
}
