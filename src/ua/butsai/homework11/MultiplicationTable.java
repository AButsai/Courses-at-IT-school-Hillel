package ua.butsai.homework11;
/**
 * Задание 1. Таблица умножения.
 * Напишите программу, которая отображает таблицу умножения для заданного числа.
 */

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scan.nextInt();

        multiplicationTable(number);
    }

    public static void multiplicationTable(int number) {
        /* Но если сделать i <= 10 то получится полноценная таблица. */
        for (int i = 0; i <= number; i++) {
            System.out.println(number + " X " + i + " = " + number * i);
        }
    }
}
