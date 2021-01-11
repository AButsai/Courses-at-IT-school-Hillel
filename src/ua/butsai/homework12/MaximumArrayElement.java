package ua.butsai.homework12;

/**
 *  C помощью рекурсии напишите программу, которая вычисляет
 *  c) нахождение максимального числа в массиве
 *  Например, для массива {3, 5, 7, 9, -8} максимальный значение элемента массива = 9
 */
public class MaximumArrayElement {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 9, -8};
        System.out.println(sortElement(array, 0));
    }

    public static int sortElement(int[] array, int i) {

        if (i < array.length) {
            int max = sortElement(array, i + 1);
            return Math.max(array[i], max);
        }
        return array[0];
    }
}
