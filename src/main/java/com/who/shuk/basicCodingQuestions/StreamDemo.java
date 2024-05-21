package com.who.shuk.basicCodingQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=15;i++){
            list.add(i);
        }
        List<Integer> odd = list.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
        System.out.println(odd);
    }
}
