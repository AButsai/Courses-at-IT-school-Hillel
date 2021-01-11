package ua.butsai.homework14;

import java.util.SplittableRandom;

/**
 * Задание2:
 * 3)Создать двумерный массив из 3 строк по 5 столбцов.
 * Массив заполнить случайными целыми числами из отрезка [0;9].
 * Преобразовать массив таким образом, чтобы на первом месте в каждой строке стоял её наименьший элемент,
 * а на последнем месте в каждой строке стоял её наибольший элемент.
 * Можно только переставлять элементы в рамках одной строки.
 * Вывести преобразованный массив на экран в виде шахматной доски.
 */
public class Solution2 {
    public static void main(String[] args) {

        int[][] array = twoDimensionalArray(4, 5);
        sortMinAndMax(array);
    }

    public static int[][] twoDimensionalArray(int n, int n1) {

        SplittableRandom random = new SplittableRandom();
        int[][] array = new int[n][n1];
        System.out.println("Массив до преобразования: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(0, 9);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        return array;
    }

    public static void sortMinAndMax(int[][] array) {
        int max, min;
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++) {
                if (array[i][j] < array[i][0]) {
                    min = array[i][j];
                    array[i][j] = array[i][0];
                    array[i][0] = min;
                }
                if(array[i][j]>array[i][array.length]) {
                    max = array[i][j];
                    array[i][j] = array[i][array.length];
                    array[i][array.length] = max;
                }
            }
        }
        System.out.println("Массив после преобразования: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
