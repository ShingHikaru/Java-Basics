package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if ((bigCount < 0) && (smallCount < 0)) {
            return false;
        }

        int bigKilograms = 5;
        int smallKilograms = 1;

        int sum = (bigCount * bigKilograms) + (smallCount * smallKilograms);

        //bigCountをかけた分は５の倍数になるため

        if (smallCount == 0) {
            if ((sum % 5 != 0) && (sum == goal)) {  //５
                return false;
            } else if ((sum % 5 == 0) && (sum == goal)) {
                return true;
            }
        }
        if ((smallCount != 0) && (sum != goal)) {
            if (sum <= goal + 4) {
                return true;
            } else {
                return false;
            }
        }

        if ((smallCount != 0) && (sum == goal)) {
            if (sum <= goal + 4) {
                return true;
            } else {
                return false;
            }
        }


        return false;
    }
}


//        if (sum == goal) {
//            return true;
//        }else if((sum >= goal - 4) && (sum <= goal + 4)) {
//            return true;
//        }else {
//            return false;
//        }
