package com.ahmetmesut.tdd;

public class FizzBuzz {
    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";

    public String division(int number) {

        String result = "";

        if (number % 3 == 0 && number % 5 == 0) {
            return result += FIZZ + BUZZ;
        }
        if (number % 3 == 0) {
            return result += FIZZ;
        }
        if (number % 5 == 0) {
            return result += BUZZ;
        }
        return result.isEmpty() ? "" + number : result;
    }
}
