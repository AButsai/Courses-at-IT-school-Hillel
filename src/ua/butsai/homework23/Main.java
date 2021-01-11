package ua.butsai.homework23;

import java.util.List;
import java.util.Scanner;

/**
 * Домашнее задание 23
 * Имитация работы простого мобильного телефона
 * ЗАДАНИЕ:
 * <p>
 * Создайте программу, которая имитирует работу простого мобильного телефона со списком контактов.
 * Программа должна уметь сохранять, изменять, удалять и производить поиск контакта по его имени.
 * <p>
 * Создайте отдельный класс для контактов Contacts (имя и номер телефона).
 * Создайте класс (MobilePhone), содержащий ArrayList<Contacts> и имя владельца телефона.
 * В классе Main продемонстрируйте работу каждого действия.
 * <p>
 * При добавлении или обновлении обязательно проверьте, существует ли уже контакт.
 */
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        MobilePhone mobilePhone = new MobilePhone("Sasha");
        System.out.println(mobilePhone.toString());
        List<Contacts> contacts = mobilePhone.contact;

        mobilePhone.addContact();//add contact
        mobilePhone.allContacts();//view all contact
        mobilePhone.conclusionOfFoundContact();//view search contact
        mobilePhone.deleteContact();//delete contact by name
        mobilePhone.changeContact();//edit contact by name

    }
}
