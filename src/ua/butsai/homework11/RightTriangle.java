package ua.butsai.homework11;

/**
 * Задание 2. Прямоугольный треугольник.
 * Напишите программу, которая отображает прямоугольный треугольник с числами.
 */
public class RightTriangle {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
