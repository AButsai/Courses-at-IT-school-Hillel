package ua.butsai.homework13;

import java.util.Arrays;

/**
 * Задание 2.
 * Условие задачи:
 * 1. Создайте массив из 40 случайных целых чисел из отрезка [10;99]
 * 2. Выведите его на экран в строку.
 * 3. Далее определите и выведите на экран сообщение о том,
 *  является ли массив строго возрастающей последовательностью.
 */
public class RandomArray {
    public static void main(String[] args) {

        int[] array = new int[40];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 90) + 10;
        }

        System.out.println(Arrays.toString(array));

        boolean b = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                b = false;
                break;
            }
        }

        if (b) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}
