package ua.butsai.homework26;
/**
 * Домашнее задание 26
 * База данных о продажах интернет-магазина.
 * Дана база данных (пока в текстовом виде в файле, работу с БД будете изучать на следующем курсе) о продажах некоторого интернет-магазина.
 * <p>
 * Каждая строка входного текстового файла представляет собой запись вида
 * Покупатель товар количество
 * <p>
 * где Покупатель — имя покупателя (строка без пробелов),
 * товар — название товара (строка без пробелов),
 * количество — количество приобретенных единиц товара.
 * <p>
 * Создайте список всех покупателей, а для каждого покупателя подсчитайте количество приобретенных им единиц каждого вида товаров.
 * Выведите список всех покупателей в алфавитном порядке, после имени каждого покупателя выведите двоеточие,
 * затем выведите список названий всех приобретенных данным покупателем товаров в алфавитном порядке,
 * после названия каждого товара выведите количество единиц товара, приобретенных данным покупателем.
 * Информация о каждом товаре выводится в отдельной строке.
 * В программе использовать TreeMap, где в качестве ключа будет покупатель, а в качестве значения другая карта,
 * которая будет хранить в качестве ключа название товара, а в качестве значения — его количество.
 *
 * Пример входных данных res//homework26.txt
 * Пример выходных данных  res//homeworkOut26.txt
 * @param args
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        
        TreeMap<String, TreeMap<String, Integer>> clients = new TreeMap<>();

        File file = new File("res//homework26.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            String[] parts = sc.nextLine().split(" ");

            String name = parts[0];
            String productName = parts[1];
            Integer count = Integer.parseInt(parts[2]);

            if (!clients.containsKey(name))
                clients.put(name, new TreeMap<>());

            TreeMap<String, Integer> temp = clients.get(name);

            if (!temp.containsKey(productName))
                temp.put(productName, 0);

            Integer oldCount = temp.get(productName);

            temp.put(productName, oldCount + count);
        }

        for (Map.Entry<String, TreeMap<String, Integer>> entry : clients.entrySet()) {
            String key = entry.getKey();
            TreeMap<String, Integer> value = entry.getValue();
            System.out.println(key + ":");

            for (Map.Entry<String, Integer> product : value.entrySet()) {
                String keyProduct = product.getKey();
                Integer valueProduct = product.getValue();
                System.out.println(keyProduct + " " + valueProduct);
            }
        }
    }
}
