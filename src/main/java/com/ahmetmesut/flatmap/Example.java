package com.ahmetmesut.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {

    public static List<String> doFlatMap() {

        List<Developer> team = new ArrayList<>();

        Developer polyglot = new Developer("esoteric");
        polyglot.add("clojure");
        polyglot.add("scala");
        polyglot.add("groovy");
        polyglot.add("go");

        Developer busy = new Developer("pragmatic");
        busy.add("java");
        busy.add("javascript");

        team.add(polyglot);
        team.add(busy);

        List<String> teamLanguages = team.stream()
                                         .map(x -> x.getLanguages())
                                         .flatMap(x -> x.stream())
                                         .collect(Collectors.toList());
        return teamLanguages;
    }

    public static void main(String[] args) {
        System.out.println(doFlatMap());
    }
}

