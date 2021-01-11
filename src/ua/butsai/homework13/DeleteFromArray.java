package ua.butsai.homework13;

import java.util.Arrays;

/**
 * Задание 3.
 * Дан массив целых чисел и ещё одно целое число.
 * Удалите все вхождения этого числа из массива (пропусков быть не должно).
 * Например, если задан массив {0,1,2,2,3,0,4,2} и число 3, то результатом должен быть массив {0,1,2,2,0,4,2}
 * если задан массив {0,1,2,2,3,0,4,2} и число 2, то результатом должен быть массив {0,1,3,0,4}
 */
public class DeleteFromArray {
    public static void main(String[] args) {

        int[] array = {0, 1, 2, 2, 3, 0, 4, 2};
        int index = 2;
        System.out.println("Исходный массив: " + Arrays.toString(array));

        int count = 0;
        for (int value : array) {
            if (value == index) {
                count++;
            }
        }

        int[] array1 = new int[array.length - count];

        int a = 0;
        for (int value : array) {
            if (value == index) {
                continue;
            }
            array1[a] = value;
            a++;
        }
        System.out.println("Обновленный массив: " + Arrays.toString(array1));
    }
}
