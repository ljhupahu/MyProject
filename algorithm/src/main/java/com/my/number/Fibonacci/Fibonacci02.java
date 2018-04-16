package com.my.number.Fibonacci;

public class Fibonacci02 {
    public static void main(String[] args) {
        System.out.println(getResult(8));
    }

    public static int getResult(int n ){
        //        checkValidation(n);
        if (n ==1 || n ==2){
            return 1;
        }

        return getResult(n - 1)  + getResult(n -2);
    }
}
