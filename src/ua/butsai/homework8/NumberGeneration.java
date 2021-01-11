package ua.butsai.homework8;

/**
 * Напишите программу, которая случайным образом генерирует числа в диапазоне от 1 до 100.
 * Определить равно ли число 50.
 * Если да, то вывести на экран фразу о равности случайного числа 50 и завершить работу программы.
 * В программу добавьте метод, который определяет число больше, либо меньше 50.
 * Метод должен принимать один параметр (сгенерированное число) и возвращать тип boolean.
 * В методе main обработайте результат выполнения этого метода и напечатайте в консоль текстовою строку:
 * "Число > 50" или "Число < 50" в зависимости от значения числа.
 */
public class NumberGeneration {
    public static void main(String[] args) {

        int random = 1 + (int) (Math.random() * (100 + 1));
        System.out.println(random);

        if (random == 50) {
            System.out.println(random + " Это число = 50");
        } else if (moreLess(random)) {
            System.out.println(random + " число > 50");
        } else if (!moreLess(random)) {
            System.out.println(random + " число < 50");
        }
    }

    public static boolean moreLess(int ran) {
        return ran > 50;
    }
}
