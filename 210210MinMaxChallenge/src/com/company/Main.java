package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int min = 0;
        boolean first = true;

        while (true) {  //while (true) は最後にbreak;で閉めない限り無限ループ

            System.out.println("Enter Number:");    //数値を入力するごとにEnter Numberが出るようにしたい
            boolean isAnInt = scanner.hasNextInt(); //以下に入力される文字がInteger（数値）かどうか(True or false)
            if (isAnInt) {                          //上のbooleanがtrueならば
                int number = scanner.nextInt(); //入力される数値データをnumberとする

                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number > max) { //numberは入力されるたびに変わる。１回目「１」、２回目「３」の場合、１回目の入力数値よりも２回目の
                    number = max;   //入力数値の方が大きいため1から３に書き変わる。以降も何度も同じ処理が繰り返される。
                }
                if (number < min) {
                    number = min;
                }
            }else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min = " + min + ", " + "Max = " + max);
        scanner.close();
    }
}