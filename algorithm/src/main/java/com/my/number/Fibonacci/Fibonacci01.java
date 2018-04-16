package com.my.number.Fibonacci;

public class Fibonacci01 {

    public static void main(String[] args) {
        getResult(10);
    }

    public static int getResult(int n ){
//        checkValidation(n);
        if (n ==1 || n ==2){
            return 1;
        }
        int previous1 = 1;
        int previous2 = 1;
        int temp = 0;

        for (int i =3; i <= n ; i ++){
            temp = previous2;
            previous2 += previous1;
            previous1 = temp;
            System.out.println( i +" 次： " + previous2);
        }
        return previous2;
    }

}
