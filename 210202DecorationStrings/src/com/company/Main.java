package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        //文字数カウントをする
        int strNum = line.length();
        //上の+マークを出力

        String upStr = "+".repeat(strNum + 2);
            System.out.println(upStr);

        //真ん中の行
        System.out.println("+" + line + "+");

        //下の行は上と同じなので同じコード
        String loStr = "+".repeat(strNum + 2);
            System.out.println(loStr);

    }
}
