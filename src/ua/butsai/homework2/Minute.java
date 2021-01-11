package ua.butsai.homework2;
/**
 * Задание 2.
 * Напишите программу для преобразования минут в количество лет и дней.
 *
 * Ожидаемый рузльтат в консоли:
 * Введите количество минут: 3456789
 * 3456789 минут - это примерно 6 лет и 210 дней
 */

import java.util.Scanner;

public class Minute {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество минут: ");
        int number = scan.nextInt();

        int a = 60*24*365;             // получаем количество минут в году( не высокосный год)
        int b = number / a;            // вводные минуты делим на кол.мин. в году, получаем кол. лет
        int c = number / (60*24);      // вводные минуты делим на кол.мин. в день, получаем кол. дней
        int d = c - b * 365;           // от кол.мин в день отнимаем кол.мин. в году умноженое на дни, получаем остаток дней

        System.out.println(Integer.toString(number) + " минут - это примерно " + b + " лет " + " и " + d + " дней");
    }
}
