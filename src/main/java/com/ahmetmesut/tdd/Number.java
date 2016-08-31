package com.ahmetmesut.tdd;

public class Number {

    public static int findHighestNumber(int numbers[]){
        int highest = 0;
        for (int number : numbers) {
            if (number > highest){
                highest = number;
            }
        }
        return  highest;
    }


}
