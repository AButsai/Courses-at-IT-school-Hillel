package ua.butsai.homework5;
/**
 * Напишите программу, в которой пользователю нужно ввести один символ из алфавита.
 * В зависимости от ввода пользователя, выведите в консоль: "Гласная буква" или "Согласная буква".
 * Если пользовательский ввод не является буквой (между а и я или А и Я) или является строкой длиной > 1, выведите сообщение об ошибке.
 * Проверку является ли введенный символ буквой (между а и я или А и Я) осуществить с помощью проверки кодов Юникоде.
 * Обратите внимание, что символы Ё и ё не входят в диапазон А-я.
 *
 * Таблица Unicode для русских букв
 * https://mikhail.krivyy.com/2004/10/09/unicode-russian/
 */

import java.io.IOException;
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String vow = "\u0410\u0423\u041e\u0418\u042d\u042f\u042e\u0401\u0415\u0430\u0443\u043e\u044b\u0438\u044d\u044f\u044e\u0451\u0435";
        String con = "\u0411\u0412\u0413\u0414\u0416\u0417\u0419\u041a\u041b\u041c\u041d\u041f\u0420\u0421\u0422\u0424\u0425\u0426\u0427\u0428\u0429\u0431\u0432\u0433\u0434\u0436\u0437\u0439\u043a\u043b\u043c\u043d\u043f\u0440\u0441\u0442\u0444\u0445\u0446\u0447\u0448\u0449";


        boolean indexS = vow.contains(s);
        boolean indexS1 = con.contains(s);

        if (indexS && s.length() <= 1) {
            System.out.println("Гласная буква");
        } else if (indexS1 && s.length() <= 1) {
            System.out.println("Согласная буква");
        } else {
            System.out.println("Ошибка. Вы ввели не допустимый символ!");
        }




    }
}
