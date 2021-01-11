package ua.butsai.homework5;

/**
 * Объявите и проинициализируйте переменные типа char разными значениями.
 * Выведите в консоль результат работы методов класа оболочки Character для каждой переменной.
 *
 * isLetter()
 * isDigit()
 * isWhitespace()
 * isUpperCase()
 * isLowerCase()
 * toUpperCase()
 * toLowerCase()
 * toString()
 * Разобраться что делают эти методы.
 */
public class ShellCharacter {
    public static void main(String[] args){
        char a = 'a';
        char b = '7';
        char c = ' ';
        char d = 'D';
        char e = 'e';
        char f = 'f';
        char j = 'J';
        char h = 'h';

        System.out.println(Character.isLetter(a));    // Возвращает значение true, если переданный символ буква.
        System.out.println(Character.isDigit(b));     // определяет, является ли указанное значение типа char цифрой.
        System.out.println(Character.isWhitespace(c));// возвращает значение true, если переданный символ пустое пространство.
        System.out.println(Character.isUpperCase(d)); //  возвращает значение true, если переданный символ в верхнем регистре.
        System.out.println(Character.isLowerCase(e)); //  возвращает значение true, если переданный символ в нижнем регистре.
        System.out.println(Character.toUpperCase(f)); // возвращает указанное значение в верхнем регистре.
        System.out.println(Character.toLowerCase(j)); //  возвращает указанное значение в нижнем регистре.
        System.out.println(Character.toString(h));    // возвращает строковый объект.
    }
}
