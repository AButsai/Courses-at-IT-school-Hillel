package ua.butsai.homework19;

import java.util.Scanner;

/**
 * Домашнее задание 19
 *
 * AnimalFactory
 * 
 * Создать родительский класс Animal и дочерние классы Dog и Cat.
 * В классе Animal объявить поле name. Создать конструктор, который проинициализирует поле name.
 * Создать метод getName(), который будет возвращать значение поля name.
 * В классах Dog и Cat необходимо также создать конструктор и переопределить метод getName().
 * Для класса Dog метод getName() должен возвращать строку "Я собака. Зовут меня - ". К строке добавить
 * вызов метода getName() суперкласса (класса Animal).
 * Для класса Cat метод getName() должен возвращать строку "Я кот. Зовут меня - ". К строке добавить
 * вызов метода getName() суперкласса (класса Animal).
 *
 * Создать класс AnimalFactory, в котором объявить статический метод getAnimalByKey,
 * Метод getAnimalByKey принимает один строковый параметр key и возвращает тип Animal.
 * В методе getAnimalByKey класса AnimalFactory производим анализ переданного значения.
 * Если значение не равно "da" или "db" или "dc" или "ca" или "cb" или "cc" возвращаем null.
 *
 * Если значение равно:
 *   "da" - возвращаем экземляр класса Dog с именем "Арамис"
 *   "db" - возвращаем экземляр класса Dog с именем "Блек"
 *   "dc" - возвращаем экземляр класса Dog с именем "Спайки"
 *   "ca" - возвращаем экземляр класса Cat с именем "Амадей"
 *   "cb" - возвращаем экземляр класса Cat с именем "Баксик"
 *   "cc" - возвращаем экземляр класса Cat с именем "Снежок"
 *
 * СОЗДАТЬ ПРИЛОЖЕНИЕ, КОТОРОЕ БУДЕТ СЧИТЫВАТЬ С КОНСОЛИ СТРОКУ.
 * Введенное пользователем значение передаем параметром в статический метод getAnimalByKey класса AnimalFactory.
 * Если метод getAnimalByKey возвращает null, необходимо вывести в консоль строку "Не могу создать Animal"
 * и попросить пользователя ввести следующую строку (т.е. не выходим из программы).
 * Иначе необходимо вывести в консоль результат переопределееного метода getName() в классах Dog и Cat и выйти из программы.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Введите значение: ");
        enterValue();
    }

    public static void enterValue() {
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        if (AnimalFactory.getAnimalByKey(key) == null) {
            System.out.println("Не могу создать Animal!\nВведите следующее значение:");
            enterValue();
        } else {
            Animal animal = AnimalFactory.getAnimalByKey(key);
            System.out.println(animal.getName());
        }
    }
}
