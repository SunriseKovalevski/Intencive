package ru.aston.kovalevski_vv.task5.two_sreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TwoStreams {
    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            firstList.add(i);
        }

        for(int j = 10; j < 20; j++) {
            secondList.add(j);
        }

        Stream<Integer> firstStream = firstList.stream();
        Stream<Integer> secondStream = secondList.stream();

        Stream.concat(firstStream, secondStream).filter(x -> x > 10).forEach(System.out::println);

    }
}
