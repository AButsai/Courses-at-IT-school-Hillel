package ua.butsai.homework8;
/**
 * Напишите программу, которая принимает число, введенное пользователем
 * и печатает в консоль фразу положительное или отрицательное это было число.
 * Логику определения положительное число или отрицательное вынесите в метод.
 * Метод должен принимать один параметр (само число) и возвращать строку типа String со значением "Положительное число" или "Отрицательное число" в зависимости от значения числа. Результат работы метода выведите в консоль.
 */

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите любое число:");
        int number = scan.nextInt();

        System.out.println(positiveNegative(number));
    }

    public static String positiveNegative(int number) {
        String result;
        if (number == 0) {
            result = "Число 0 не является положительным или отрцательным!";
        } else if (number > 0) {
            result = "Это положительное число";
        } else {
            result = "Это отрицательное число";
        }
        return result;
    }
}
