package ua.butsai.homework11;

/**
 * Задание 4. FizzBuzz
 *
 * Напишите программу, в которой с помощью System.out.println выводятся все числа
 * от 1 до 100 с двумя исключениями.
 * Для чисел, кратных 3, вместо числа выводится "Fizz",
 * а для чисел, кратных 5 (но не 3), - "Buzz".
 *
 * Когда это заработает, измените программу так, чтобы она печатала "FizzBuzz"
 * для чисел, которые делятся и на 3, и на 5 (и по-прежнему печатайте "Fizz"
 * или "Buzz" для чисел, кратных только одному из них).
 */
public class FizzBuzz {
    public static void main(String[] args) {

        System.out.println("FizzBuzz:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
