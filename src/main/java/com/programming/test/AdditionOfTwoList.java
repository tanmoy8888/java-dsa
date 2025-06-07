package com.programming.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AdditionOfTwoList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = Arrays.asList(4,5,6,7);
        List<Integer> collect = IntStream
                .range(0, Math.min(list1.size(), list2.size()))
                .map(i -> list1.get(i) + list2.get(i))
                .boxed()
                .collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }
}
