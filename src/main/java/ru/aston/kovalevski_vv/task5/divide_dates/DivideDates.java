package ru.aston.kovalevski_vv.task5.divide_dates;

import java.time.Month;
import java.time.LocalDate;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DivideDates {
    public static void main(String[] args) {
        Stream<LocalDate> dateStream = Stream.generate(DivideDates::generateRandomDate).limit(10);

        Map<Season, Long> dividedBySeasons = dateStream.collect(Collectors.groupingBy(DivideDates::getSeason,Collectors.counting()));

        dividedBySeasons.forEach((season, count) -> System.out.println(season + " " + count));
    }

    public static LocalDate generateRandomDate() {
        Random random = new Random();
        int year  = 2000 + random.nextInt(25);
        int month = 1 + random.nextInt(12);
        int day   = 1 + random.nextInt(28);
        return LocalDate.of(year, month, day);
    }

    public static Season getSeason(LocalDate date) {
        Month month = date.getMonth();
        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return Season.WINTER;
            case MARCH:
            case APRIL:
            case MAY:
                return Season.SPRING;
            case JUNE:
            case JULY:
            case AUGUST:
                return Season.SUMMER;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                return Season.AUTUMN;
            default:
                throw new IllegalStateException(month.toString());
        }
    }

    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }
}
