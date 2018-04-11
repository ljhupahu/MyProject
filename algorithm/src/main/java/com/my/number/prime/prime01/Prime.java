package com.my.number.prime.prime01;

public class Prime {
    public static void main(String[] args) {
        Prime prime = new Prime();
        System.out.println(prime.findNextPrime(11));
    }

    private int findNextPrime(int i){
        int temp = i + 1;
        if (preCheckPrimeNumber(temp)) {
            return temp;
        }

        if (checkPrimeNumber(temp)) {
            return temp;
        }
        return findNextPrime(temp);
    }

    private boolean preCheckPrimeNumber(int temp) {
        if (temp < 2){
            throw new RuntimeException("Please input valid prime number");
        }

        if (temp == 2){
            return true;
        }
        return false;
    }

    private boolean checkPrimeNumber(int temp) {
        for (int j = 2; j < temp; j++) {
            if (temp % j == 0){
                return false;
            }
        }
        return true;
    }
}
