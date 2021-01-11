package ua.butsai.homework12;

/**
 *  C помощью рекурсии напишите программу, которая вычисляет
 *  b) сумму элементов массива
 *  Например, для массива {3, 5, 7, 9, -8} сумма чисел будет 16.
 */
public class SumOfArrayElements {
    public static void main(String[] args) {

        int[] array = {3, 5, 7, 9, -8};
        System.out.println(sumElement(array, 0));
    }

    public static int sumElement(int[] array, int i) {

        if (i == (array.length - 1)) {
            return array[i];
        }
        return array[i] + sumElement(array, i + 1);
    }
}
