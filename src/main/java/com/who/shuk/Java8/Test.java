package com.who.shuk.Java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        String s = "sushmita";
        //calculate the occurence of every character
        Map<String, Long> occurence = Arrays.stream(s.split(""))
                 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        //find duplicate characters
        List<String> duplicate = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        Arrays.stream(new String[] {"Sushmita","Neelu","Tanu"})
                .filter(s1->s1.startsWith("S"))
                .map(String::toLowerCase)
                .collect(Collectors.toList());


    }
}
