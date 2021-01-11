package ua.butsai.homework16;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setNumber(1);
        account.setBalance(56);
        account.setCustomerName("Vasya");
        account.setCustomerEmailAddress("vasya@mail.net");
        account.setCustomerPhoneNumber("0500000001");
        System.out.println("Номер счета: " + account.getNumber() + "\nБаланс счета: " + account.getBalance() + "\nИмя клиента: " + account.getCustomerName() + "\nEmail клиента: " + account.getCustomerEmailAddress() + "\nНомер телефона клиента: " + account.getCustomerPhoneNumber());
        account.deposit(54);
        account.withdrawal(78);

        Account account1 = new Account();
        account1.setNumber(2);
        account1.setBalance(65);
        account1.setCustomerName("Petya");
        account1.setCustomerEmailAddress("petya@mail.net");
        account1.setCustomerPhoneNumber("0500000002");
        System.out.println("Номер счета: " + account1.getNumber() + "\nБаланс счета: " + account1.getBalance() + "\nИмя клиента: " + account1.getCustomerName() + "\nEmail клиента: " + account1.getCustomerEmailAddress() + "\nНомер телефона клиента: " + account1.getCustomerPhoneNumber());
        account1.deposit(69);
        account1.withdrawal(87);
    }
}
