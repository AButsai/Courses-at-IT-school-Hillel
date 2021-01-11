package ua.butsai.homework5;
/**
 * Напишите программу, которая вычисляет и печатает в консоль площадь и периметр круга.
 * С помощью Scanner программа должна получать в качестве входных данных радиус.
 *
 * Например, для
 *  Radius = 7.5
 *
 * Ожидаемый вывод в консоле:
 *  Perimeter is = 47.12388980384689
 *  Area is = 176.71458676442586
 */

import java.util.Scanner;

public class AreaAndPerimeterOfACircle {
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);

      System.out.println("Введите радиус:");
      double r = scan.nextDouble();

      final double PI = 3.141592653589793;
      double perimeter = 2 * PI * r;
      double area = r * r * PI;

      System.out.println("Perimeter is = " + perimeter);
      System.out.println("Area is = " + area);

   }
}
