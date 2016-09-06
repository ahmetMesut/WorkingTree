package com.ahmetmesut.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class SampleOne {

    public static List<String> printEven() {

        List<String> list = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .filter(i -> i % 2 == 0)
                .map(i -> "Ahmet" + i)
                .collect(toList());
        return list;
    }

    public static int reduceSum() {
        int sum = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .reduce((a, b) -> a + b)
                .get();
        return sum;
    }

    public static List<Integer> doSorted() {
        List<Integer> values = Stream.of(6, 3, 1, 9, 0, 2, -1)
                .sorted((o1, o2) -> o1.compareTo(o2))
                .collect(toList());
        return values;

    }
    public static List<String> sort(){
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
       Collections.sort(names,(a,b)->a.compareTo(b));
        return names;
    }

    public static int doConvert(){
        Converter<String,Integer> converter = from -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        return converted;
    }
    public static List<String> doSomething() {
        List<String> list = Arrays.asList("spring", "node", "ahmet");

        List<String> result = list.stream()
                .filter(i -> !"ahmet".equals(i))
                .collect(toList());
        return result;
    }

    public static String filterMapFindAnyOrElse() {
        List<Person> persons = Arrays.asList(new Person("Ahmet", 24), new Person("michael", 21), new Person("emre", 22));

        String name = persons.stream()
                .filter(i -> "Ahmet".equals(i.getName()))
                .map(Person::getName)
                .findAny()
                .orElse("");
        return name;
    }

    public static String doFunction(){
        Function<String,Integer> fn1 = Integer::valueOf;
        Function<String,String> fn2 = fn1.andThen(String::valueOf);

        String result = fn2.apply("12");
       /* if (result instanceof String) {
            System.out.println("Yes String");
        }*/
        return result;
    }

    public static void main(String[] args) {
        //printEven();
        //reduceSum();
        //doSorted();
        //doSomething();
        //filterMapFindAnyOrElse();
        //System.out.println(sort());
        //doConvert();
        // doFunction();
    }
}