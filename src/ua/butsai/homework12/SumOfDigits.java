package ua.butsai.homework12;

import java.util.Scanner;

/**
 *  C помощью рекурсии напишите программу, которая вычисляет
 *  a) сумму чисел заданного числа
 *  Например, пользователь ввел число 5432. Сумма чисел будет равна 14
 */
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();

        System.out.println(sumDigits(number));
    }

    public static int sumDigits(int number) {

        if (number == 0) {
            return 0;
        }
        return number % 10 + sumDigits(number / 10);
    }
}
