package ua.butsai.homework21;

import java.util.Random;
import java.util.Scanner;

/**
 * Домашнее задание 21
 * Стоимость букета
 * <p>
 * Необходимо реализовать иерархию цветов (для примера, пусть это будут розы, гвоздики, тюльпаны и... что-то на свой вкус).
 * В произвольном порядке необходимо создавать объекты-цветы.
 * Необходимо собрать букет с определением его стоимости.
 * В букет может входить несколько цветов одного типа.
 * <p>
 * Примеры вывода в консоль:
 * <p>
 * Введите желаемое кол-во цветов в букете: 3
 * Сформирован букет из 3 цветов:
 * #1 Тюльпан (20.0)
 * #2 Роза (45.0)
 * #3 Ромашка (15.0)
 * Стоимость букета - 80
 * <p>
 * Введите желаемое кол-во цветов в букете: 7
 * Сформирован букет из 7 цветов:
 * #1 Роза (45.0)
 * #2 Роза (45.0)
 * #3 Роза (45.0)
 * #4 Роза (45.0)
 * #5 Тюльпан (20.0)
 * #6 Ромашка (15.0)
 * #7 Ромашка (15.0)
 * Стоимость букета - 230
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите желаемое кол-во цветов в букете:");
        int numberOfFlower = sc.nextInt();
        System.out.println("Сформирован букет из " + numberOfFlower + " цветов:");

        FlowerFactory factory = new FlowerFactory();
        for (int i = 1; i <= numberOfFlower; i++) {
            System.out.print("#" + i + " ");
            flowersRandomFlower(factory);
        }

        System.out.println("Стоимость букета - " + factory.getCostFlowers());
    }

    public static void flowersRandomFlower(FlowerFactory factory) {
        Flower randomFlower = getRandomFlower(factory);
        randomFlower.display();
    }

    public static Flower getRandomFlower(FlowerFactory factory) {
        Random random = new Random();
        FlowerTypes type = FlowerTypes.values()[random.nextInt(FlowerTypes.values().length)];
        return (factory.getFlower(type));
    }
}
