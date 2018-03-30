package com.my.number;

/**
 * Created by jli on 3/28/2018.
 */
public class Combination {

    public static void main(String[] args) {

        for (int i = 4; i <= 7; i++)
            for (int j = 4; j <= 7; j++)
                for (int k = 4; k <= 7; k++) {
                    System.out.print(i * 100 + j * 10 + k);
                    System.out.print(" ");
                }
    }


}
