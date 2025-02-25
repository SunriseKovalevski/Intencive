package ru.aston.kovalevski_vv.task5.prime_numbers;

/* Создание Stream из массива целых чисел и
   вывод на экран всех простых чисел в диапазоне от 2 до 100. */

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
        List<Integer> listNumbers = new ArrayList<>();

        for (int i = 0; i < 101; i++) {
            listNumbers.add(i);
        }

        listNumbers.stream().filter(PrimeNumbers::isPrime).forEach(System.out::println);
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
