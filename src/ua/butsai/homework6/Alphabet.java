package ua.butsai.homework6;
/**
 * Переписать задачу определения гласная или согласная введенная буква.
 *
 * В програме использовать if-else оператор
 *     if (длина символов > 1) {
 *       // Выводим ошибку
 *     } else if (введенный символ не в диапазоне от А до я и не равен ё или Ё) {
 *       // Ошибка: Вы ввели некорректный символ
 *     } else {
 *       // основная логика
 *       // В русском языке 10 гласных букв (а, у, о, ы, и, э, я, ю, ё, е)
 *       // Приводим символ к нужному регистру
 *       // Определяем является ли введенный символ гласной или согласной буквой
 *     }
 */

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char symbol = s.charAt(0);

        if (s.length() > 1) {
            System.out.println("Ошибка!");
        } else if ((symbol < '\u0410' || symbol > '\u044F') && symbol != '\u0401' && symbol != '\u0451') {
            System.out.println("Ошибка. Вы ввели не допустимый символ!");
        } else {
//            String lowCase = Character.toString(symbol).toLowerCase();
//            symbol = lowCase.charAt(0);
            symbol = Character.toLowerCase(symbol); // Понял. Исправил. Спасибо. 
            if (symbol == 'а' || symbol == 'е'
                    || symbol == 'ё' || symbol == 'и'
                    || symbol == 'о' || symbol == 'у'
                    || symbol == 'ы' || symbol == 'э'
                    || symbol == 'ю' || symbol == 'я') {
                System.out.println("Гласная буква");
            } else {
                System.out.println("Согласная буква");
            }
        }
    }
}