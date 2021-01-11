package ua.butsai.homework2;
/**
 * Задание 1.
 * Напишите программу, которая читает целое число, анализирует его и складывает все его числа.
 *
 * Ожидаемый рузльтат в консоли:
 * Введите целое число: 565
 * Сумма всех цифр в 565 равна 16
 */

import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int a = number / 100; 
        int b = number / 10;
        int c = b % 10;
        int x = b / 10;
        int s = a + c + x;

        System.out.println("Сумма всех цифр в " + Integer.toString(number) + " равна " + s);
    }
}

