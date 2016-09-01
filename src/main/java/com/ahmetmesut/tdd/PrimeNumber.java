package com.ahmetmesut.tdd;

public class PrimeNumber {

    public Boolean check(Integer number) {
        for (int i = 2; i < (number / 2); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
