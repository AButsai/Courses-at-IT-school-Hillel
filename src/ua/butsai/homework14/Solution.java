package ua.butsai.homework14;

import java.util.SplittableRandom;

/**
 * Задание:
 * 1)Создать двумерный массив из 6 строк и 9 столбцов.
 * Массив заполнить случайными целыми числами из отрезка [-99;99].
 * Вывести массив на экран в виде шахматной доски.
 * Вывести в консоль значение максимального элемента этого массива (его индекс не имеет значения).
 */
public class Solution {
    public static void main(String[] args) {
        int[][] array = twoDimensionalArray(6, 9);
        outputArray(array);
        searchForTheMaximumElement(array);
    }

    public static void outputArray(int[][] arrays) {
        for (int[] array : arrays) {
            for (int j = 0; j < arrays[0].length; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] twoDimensionalArray(int n, int n1) {

        SplittableRandom random = new SplittableRandom();
        int[][] array = new int[n][n1];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = random.nextInt(-99, 99);
            }
        }
        return array;
    }

    public static void searchForTheMaximumElement(int[][] array) {

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array[0].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Максимальный элемент массива = " + max);
    }
}
