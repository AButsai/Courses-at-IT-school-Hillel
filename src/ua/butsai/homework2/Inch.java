package ua.butsai.homework2;
/**
 * Задание 4.
 * Напишите программу, которая считывает число в дюймах и преобразует его в метры.
 * Примечание. Один дюйм равен 0,0254 метра.
 *
 * Ожидаемый рузльтат в консоли:
 * Введите значение для дюйма: 1000
 * 1000,0 дюйма - это 25,4 метра
 */

import java.util.Scanner;

public class Inch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение для дюйма: ");
        double number2 = scan.nextInt();

        final double A = 0.0254;
        double i = number2 * A;
        
        System.out.println(Double.toString(number2) + " дюйма - это " + i + " метра");
    }
}
