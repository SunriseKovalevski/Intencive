package ru.aston.kovalevski_vv.task3.merge;

import java.util.Random;

public class MergeSort {

    // Основной метод для запуска сортировки
    public static void mergeSort(int[] array) {
        if (array == null || array.length <= 1) {
            return; // Массив уже отсортирован или пуст
        }
        int[] temp = new int[array.length]; // Временный массив для слияния
        mergeSort(array, temp, 0, array.length - 1);
    }

    // Рекурсивный метод для разделения и сортировки
    private static void mergeSort(int[] array, int[] temp, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2; // Находим середину
            mergeSort(array, temp, left, mid);  // Сортируем левую половину
            mergeSort(array, temp, mid + 1, right); // Сортируем правую половину
            merge(array, temp, left, mid, right); // Сливаем две половины
        }
    }

    // Метод для слияния двух отсортированных половин
    private static void merge(int[] array, int[] temp, int left, int mid, int right) {
        // Копируем элементы во временный массив
        if (right + 1 - left >= 0) System.arraycopy(array, left, temp, left, right + 1 - left);

        int i = left;       // Индекс для левой половины
        int j = mid + 1;   // Индекс для правой половины
        int k = left;       // Индекс для результирующего массива

        // Сливаем две половины
        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                array[k] = temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
            }
            k++;
        }

        // Копируем оставшиеся элементы из левой половины (если есть)
        while (i <= mid) {
            array[k] = temp[i];
            i++;
            k++;
        }

        // Правую половину копировать не нужно, так как она уже на месте
    }

    // Метод для заполнения массива случайными числами
    private static void fillArrayWithRandomNumbers(int[] array, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min; // Случайное число в диапазоне [min, max]
        }
    }

    // Пример использования
    public static void main(String[] args) {
        int size = 10; // Размер массива
        int min = 1;   // Минимальное значение случайного числа
        int max = 100; // Максимальное значение случайного числа

        int[] array = new int[size];
        fillArrayWithRandomNumbers(array, min, max); // Заполняем массив случайными числами

        System.out.println("Исходный массив:");
        printArray(array);

        mergeSort(array); // Сортируем массив

        System.out.println("Отсортированный массив:");
        printArray(array);
    }

    // Вспомогательный метод для вывода массива
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
