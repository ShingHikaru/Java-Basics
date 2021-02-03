package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double m = sc.nextDouble();
        double p = sc.nextDouble();
        double q = sc.nextDouble();

        //惣菜の量は
        double souzai = m - (m * p / 100.000);
        //売れ残った量は
        double unMeat = souzai - (souzai * q / 100.000);

        System.out.println(unMeat);


        double c = next


    }
}
