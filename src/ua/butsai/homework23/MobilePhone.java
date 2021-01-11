package ua.butsai.homework23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Программа должна уметь сохранять, изменять, удалять и производить поиск контакта по его имени.
 */
public class MobilePhone {
    static Scanner sc = new Scanner(System.in);
    Contacts contacts = new Contacts();
    List<Contacts> contact = new ArrayList<>();
    private String name;

    public MobilePhone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Additional contact.
     */
    public void addContact() {
        while (true) {
            System.out.println("Enter contact name");
            String contactName = sc.nextLine();
            if (!contactName.isEmpty()) {
                if (searchContact(contactName)) {
                    System.out.println("Such contact exists");
                } else {
                    System.out.println("Enter contact number");
                    int contactNumber = sc.nextInt();
                    sc.nextLine();
                    contact.add(new Contacts(contactName, contactNumber));
                }
            } else {
                break;
            }
        }
    }

    /**
     * Displaying existing contacts
     */
    public void allContacts() {
        for (Contacts c : contact) {
            System.out.println(c.toString());
        }
    }

    /**
     * Search to change the phone number by contact name.
     */
    public boolean searchContact(String name) {
        for (Contacts c : contact) {
            if (c.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Conclusion of found contact
     */
    public void conclusionOfFoundContact() {
        System.out.println("Enter a name to search for a contact");
        String name = sc.nextLine();
        for (Contacts c : contact) {
            if (c.getName().equals(name)) {
                System.out.println(c.toString());
            }
        }
    }

    /**
     * Remove a contact by their name.
     */
    public void deleteContact() {
        System.out.println("Enter the contact you want to delete");
        String name = sc.nextLine();
        contact.removeIf(c -> c.getName().equals(name));
        System.out.println("Updated contact list");
        allContacts();
    }

    /**
     * Change a contact by name
     */
    public void changeContact() {
        System.out.println("Enter a name to change the contact");
        String name = sc.nextLine();
        for (Contacts c : contact) {
            if (c.getName().equals(name)) {
                System.out.println("Enter new name");
                c.setName(sc.nextLine());
                System.out.println("Enter new number");
                c.setNumber(sc.nextInt());
                sc.nextLine();

                System.out.println("Updated contact list");
                allContacts();
            }
        }
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "name = '" + name + '\'' +
                '}';
    }
}
