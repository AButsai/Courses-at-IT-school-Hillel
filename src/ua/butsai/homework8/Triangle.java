package ua.butsai.homework8;
/**
 *  Напишите программу, которая вычисляет площадь и периметр треугольника.
 *  Входные данные получите с помощью класса Scanner.
 *  В программу добаьте два метода calculateSquare и calculatePerimeter.
 *  Методы должны возвращать вычисленный результат площади и периметра соответственно.
 *  Выведите результаты работы этих методов в консоль.
 */

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первую сторону треугольника : ");
        double a = scan.nextDouble();

        System.out.println("Введите вторую сторону треугольника : ");
        double b = scan.nextDouble();

        System.out.println("Введите третью сторону треугольника : ");
        double c = scan.nextDouble();

        System.out.println("Площадь треугольника = " + calculateSquare(a, b, c) + " см2.");
        System.out.println("Периметр треугольника = " + calculatePerimeter(a, b, c) + " см.");

    }

    public static double calculateSquare(double a, double b, double c) {
        //Формула Герона.
        double p = calculatePerimeter(a, b, c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double calculatePerimeter(double a, double b, double c) {
        return (a + b + c);
    }
}