package ua.butsai.homework11;

/**
 * Задание 3. Подсчет всех слов в строке.
 * Напишите программу для подсчета всех слов в строке. Логику подсчета количества слов в строке вынесите в отдельный метод.
 */
public class CountAllWordsInAString {
    public static void main(String[] args) {

        String string = "Быстрая коричневая лиса перепрыгивает через ленивую собаку.";
        System.out.println(string);

        countAllWordsInAString(string);

    }

    public static void countAllWordsInAString(String string) {

        int count = 0;
        if (string.length() != 0) {
            count++;
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        System.out.println("Количество слов в строке: " + count);
    }
}
