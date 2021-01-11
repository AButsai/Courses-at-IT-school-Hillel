package ua.butsai.homework3;
/**
 * 1) решение квадратных уравнений
 */

import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         double x1, x2;
         double a, b, c;
         System.out.println("Введите число а:");
         a = scan.nextDouble();
         System.out.println("Введите число b:");
         b = scan.nextDouble();
         System.out.println("Введите число c:");
         c = scan.nextDouble();

         double Discriminant = b * b - 4 * a * c;
        if (Discriminant > 0) {
            x1 = (-b + Math.sqrt(Discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(Discriminant)) / (2 * a);
            System.out.println("Уровнение имеет два корня: " + x1 + " " + x2);
        } else if (Discriminant == 0) {
            x1 = (-b) / (2 * a);
            System.out.println("Уровнение имеет один корень. " + x1);
        } else if (Discriminant < 0) {
            System.out.println("Уровнение не имеет корней. Дискреминант < 0.");

        }

    }
}
