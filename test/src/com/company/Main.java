package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calcurateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calcurateScore(75);
        calcurateScore();
        int calcFeetAndInchesToCentimeters = calcFeetAndInchesToCentimeters(6,0);
        if (calcFeetAndInchesToCentimeters > 0.0) {
            System.out.println("Invalid feet or inches parameters");
        }
    }

    public static int calcurateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " point ");
        return score * 1000;
    }
    public static int calcurateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calcurateScore() {
        System.out.println("No player name,no player score");
        return 0;
    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if((feet < 0) || (inches < 0) && (inches > 12)) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;  //feet,inch to centimeter calcuration method
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + "cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0.0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + "inches is equal to to " + feet + "feet and " + remainingInches);
        return calcFeetAndInchesToCentimeters(feet, inches);

    }

}




