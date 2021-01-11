package ua.butsai.homework5;
/**
 *  Напишите программу, которая принимает два числа в качестве
 *  входных данных с помощью класса Scanner и отображает произведение двух чисел.
 *
 * Ожидаемый вывод в консоле:
 *  Введите первое число: 25
 *  Введите второе число: 5
 *  Произведение числел 25 x 5 = 125
 */

import java.util.Scanner;

public class ProductOfTwoNumbers {
// Задание 2
     public static void main(String[] args){
         Scanner scan = new Scanner(System.in);

         System.out.println("Введите первое число:");
         int i = scan.nextInt();
         System.out.println("Введите второе число:");
         int a = scan.nextInt();

         int r = i * a;
         System.out.println("Произведение числел " + i + " х " + a + " = " + r);
     }
}
