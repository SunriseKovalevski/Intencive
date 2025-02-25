package ru.aston.kovalevski_vv.task5.surnames;

/* Задано множество фамилий сотрудников.
   Разработать программу, которая отображает все фамилии,
   начинающиеся на букву «J».
   Задачу решить с использованием Stream API.*/

import java.util.Set;
import java.util.stream.Collectors;

public class Surnames {
    public static void main(String[] args) {
        Set<String> surnames = Set.of(
                "Johnson", "Smith", "Jackson", "Brown", "Jones",
                "Williams", "Taylor", "Davis", "Miller", "Wilson"
        );

        Set<String> result = surnames.stream()
                .filter(surname -> surname.startsWith("J"))
                .collect(Collectors.toSet());

        result.forEach(System.out::println);
    }
}
