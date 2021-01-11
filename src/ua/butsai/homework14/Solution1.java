package ua.butsai.homework14;

import java.util.SplittableRandom;

/**
 * Задание1:
 * 2)Создать двумерный массив из 7 строк и 5 столбцов.
 * Массив заполнить случайными целыми числами из отрезка [-5;5].
 * Определить и вывести в консоль индекс строки с наибольшим по модулю произведением элементов.
 * Если таких строк несколько, то вывести индекс ВТОРОЙ встретившейся из них.
 */
public class Solution1 {
    public static void main(String[] args) {

        int[][] array = twoDimensionalArray(7, 5);
        int[] arr = intermediateArray(array);
        largestRowIndex(arr);
    }

    public static int[][] twoDimensionalArray(int n, int n1) {

        SplittableRandom random = new SplittableRandom();
        int[][] array = new int[n][n1];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = random.nextInt(-5, 5);
            }
        }
        return array;
    }

    public static int[] intermediateArray(int[][] array) {
        int[] arr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int temp = 1;
            for (int j = 0; j < array[0].length; j++) {
                temp *= array[i][j];
            }
            arr[i] = Math.abs(temp);
        }
        return arr;
    }

    public static void largestRowIndex(int[] arr) {
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("Наибольший индекс по модулю произведением элементов (" + max + ") = " + index);
    }
}
