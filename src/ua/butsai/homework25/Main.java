package ua.butsai.homework25;
/**
 * Домашнее задание 25
 * NumberFormatException
 * <p>
 * ЗАДАНИЕ
 * <p>
 * Напишите программу, которая должна считывать построчно строки из файла и вывести в консоль два значения:
 * 1) количество строк, которые содержат числовые значения
 * 2) количество строк, которые содержат нечисловые значения.
 * <p>
 * Например, если текстовый файл содержит следующие данные
 * <p>
 * Hello from file!
 * Good bye!
 * 12
 * 34
 * eee
 * dwdw
 * 2323
 * 545
 * 456
 * 445
 * 334
 * <p>
 * то результатом работы программы должен быть следующий вывод:
 * количество строк, содержащих числовые выражения = 7
 * количество строк, содержащих нечисловые выражения = 4
 * Для перевода строки в число необходимо использовать метод
 * Integer.parseInt()
 * Метод может выбрасывать непроверяемое исключение "NumberFormatException".
 *
 * @param args
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String FILE_NAME = "res//homework25.txt";

    public static void main(String[] args) {
        MyNumberFormatException myException = new MyNumberFormatException();

        File file = new File(FILE_NAME);
        BufferedReader br;
        List<Integer> integers = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String line = null;
            while ((line = br.readLine()) != null) {
                if (myException.isInteger(line)) {
                    integers.add(Integer.parseInt(line));
                } else {
                    strings.add(line);
                }
            }
            br.close();
            System.out.println("Количество строк, содержащих числовые выражения = " + integers.size());
            System.out.println("Количество строк, содержащих нечисловые выражения = " + strings.size());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
