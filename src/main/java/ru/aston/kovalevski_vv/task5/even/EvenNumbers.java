package ru.aston.kovalevski_vv.task5.even;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }

        list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
