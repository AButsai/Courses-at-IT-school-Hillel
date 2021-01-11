package ua.butsai.homework2;
/**
 * Задание 3.
 * Напишите программу для преобразования температуры из Фаренгейта в градусы Цельсия.
 *
 * Ожидаемый рузльтат в консоли:
 * Введите градусы в Фаренгейте: 212
 * 212.0 градусов по Фаренгейту равна 100.0 по Цельсию
 */

import java.util.Scanner;

public class Degrees {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите градусы в Фаренгейте: ");
        double numberFahrenheit = scan.nextDouble();

        final double F = 1.8;
        double result = (numberFahrenheit - 32) / F;

        System.out.println(numberFahrenheit + " градусов по Фаренгейту равна " + result + " по Цельсию");
    }
}
