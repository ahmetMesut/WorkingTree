package com.ahmetmesut.tdd;

import java.util.List;

public class Number {

    private Number(){

    }

    public static int findHighestNumber(int numbers[]){
        int highest = 0;
        for (int number : numbers) {
            if (number > highest){
                highest = number;
            }
        }
        return  highest;
    }

    public static int sumListItem(List<Integer> numbers){
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

}
