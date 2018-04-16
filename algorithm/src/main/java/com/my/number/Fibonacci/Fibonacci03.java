package com.my.number.Fibonacci;

public class Fibonacci03 {

    public static void main(String[] args) {
        System.out.println(getResult(5));
        System.out.println(getResult(6));
        System.out.println(getResult(7));
        System.out.println(getResult(8));
    }

    public static int getResult(int n ) {
//        checkValidation(n);
        if (n ==1 || n ==2){
            return 1;
        }

        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n ; i++) {
            arr [i] = arr[i - 1] + arr[i -2];
        }

        return arr[n - 1];
    }

}
