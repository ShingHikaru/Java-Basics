package com.company;

public class Main {

    public static void main(String[] args) {
        for(int i =1; i <= 10; i++) {
            int y = 3 * i;  //int y => 3に1から10までの整数をすべて掛けた数とする
            if((i == 10) && (y % 2 == 0)) {

            }
        }
        if(y % 2 == 0) {    //2で割り切れれば偶数であるため
            System.out.println(y + " => 偶数");
        } else if (y % 2 != 0) {    //2で割り切れなければ奇数であるため
            System.out.println(y + " => 奇数");
        }






        }
    }
