package com.company;

public class Main {

    public static void main(String[] args) {
        int[] seq = new int[10];    //10個の配列を持つint型のseq配列を作成（型を作っただけ）

        for (int i = 0; i < seq.length; i++) {  //初期値は0,seqの長さ（10）まで繰り返す
            seq[i] = new java.util.Random().nextInt(4); //②10個の配列を持つseqの各配列に0,1,2,3のうちどれかの乱数を代入
            char[] base = {'A', 'T', 'G', 'C'}; //③baseというchar要素を持った配列を作成
            System.out.print((base[seq[i]]) + " "); /*②でseqの各配列に割り当てられた数字を元に③からデータを取り出し格納する。
                                                    例えば②でseq[i] = {1, 3, 2, 0.....}と乱数が代入された場合、T C G Aが出力される。
        }
    }
}
