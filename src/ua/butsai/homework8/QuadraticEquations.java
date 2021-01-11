package ua.butsai.homework8;
/**
 * Напишите программу решения квадратного уравнения.
 * Входные данные получите с помощью класса Scanner (a, b, c).
 * В программу добавьте метод вычисления дискриминанта,
 * метод вычисления первого корня уравнения,
 * метод вычисления второго корня уравнения и метод вычисления корня,
 * если дискриминант равен 0. Выведите в консоль найденные корни уравнения.
 */

import java.util.Scanner;

public class QuadraticEquations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a, b, c;

        System.out.println("Введите число а:");
        a = scan.nextDouble();
        System.out.println("Введите число b:");
        b = scan.nextDouble();
        System.out.println("Введите число c:");
        c = scan.nextDouble();

        if (discriminant(a, b, c) > 0) {
            System.out.println(firstRoot(a, b, c));
            System.out.println(secondRoot(a, b, c));
        } else if (discriminant(a, b, c) == 0) {
            System.out.println(rootCalculation(a, b));
        } else {
            System.out.println("Уровнение не имеет корней. Дискреминант < 0.");
        }
    }

    public static double discriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public static double firstRoot(double a, double b, double c) {
        return (-b + Math.sqrt(discriminant(a, b, c))) / (2 * a);
    }

    public static double secondRoot(double a, double b, double c) {
        return (-b - Math.sqrt(discriminant(a, b, c))) / (2 * a);
    }

    public static double rootCalculation(double a, double b) {
        return (-b) / 2 * a;
    }
}
