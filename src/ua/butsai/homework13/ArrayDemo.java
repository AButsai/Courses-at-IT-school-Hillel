package ua.butsai.homework13;

import java.util.Arrays;
/**
 * Задание 1.
 *
 * В классе ArrayDemo создайте следующие методы, в качестве параметра которые принимают целочисленный массив и возвращают вычисленный результат:
 * 1 метод: вычисление суммы всех элементов массива
 * 2 метод: вычисление среднего арифметического значения элементов массива
 * 3 метод: нахождение наибольшего элемента в массиве
 * 4 метод: метод, который принимает два параметра (массив и некоторое число)
 * Метод должен вернуть новый "увеличенный" массив (со всеми значениями из переданного массива) + размерность (длина массива) которого увеличина на переданное число.
 * 5 метод: Напишите метод с именем reverse() с массивом int в качестве параметра. Метод должен перевернуть массив в обратном порядке.
 * Метод не должен возвращать никакого значения (void). Другими словами, метод изменяет массив (переданный как копия ссылки в параметре метода).
 *
 * В методе main протестируйте работу всех методов.
 * Чтобы перевернуть массив, вы должны поменять местами элементы, чтобы первый элемент поменялся местами с последним и так далее.
 * Например, если массив равен {1, 2, 3, 4, 5}, то обратный массив равен {5, 4, 3, 2, 1}.
 */
public class ArrayDemo {

    public static void main(String[] args) {

        int[] array = {5, 1, 8, 7, 6, 3, 89, 66};
        int someNumber = 3;

        System.out.println("Сумма чисел массива = " + sumOfArrayElements(array));
        System.out.println("Среднее арифметическое значение элементов массива = " + arithmeticMean(array));
        System.out.println("Наибольший элемент в массиве = " + largestElement(array));
        System.out.println("Исходный массив " + Arrays.toString(array) + " , массив с измененной размерностью " + Arrays.toString(enlargedArray(array, someNumber)) + "\nИсходный размер массива = " + array.length + "\nРазмер измененого массива на (" + someNumber + ") = " + (array.length + someNumber));

        reverseArray(array);
    }

    /** Вычисляем сумму элементов массива.*/
    public static int sumOfArrayElements(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    /** Вычисляем среднее арифметическое значение элементов массива.
     * С использованием метода sumOfArrayElements()*/
    public static double arithmeticMean(int[] array) {
        return (double) sumOfArrayElements(array) / array.length;
    }

    /** Находим максимальное значение в массиве*/
    public static int largestElement(int[] array) {
        int max = 0;
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    /** Создаем новый массив и именяем его размерность на переданное число. */
    public static int[] enlargedArray(int[] array, int i) {
        int[] arrays = new int[array.length + i];
        for (int j = 0; j < array.length; j++) {
            arrays[j] = array[j];
        }
        return arrays;
    }

    /**
     * Создаем новый массив и изменяем значения в обратном порядке, выводим массив в консоль.
     * @param array
     */

    private static void reverseArray(int[] array) {
        int[] reverseArray = new int[array.length];
        for (int i = reverseArray.length - 1; i >= 0; i--) {
            reverseArray[i] = array[array.length - i - 1];
        }
        System.out.println("Массив в обратном порядке: " + Arrays.toString(reverseArray));
    }
}
