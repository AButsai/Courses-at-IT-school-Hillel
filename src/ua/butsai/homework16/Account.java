package ua.butsai.homework16;

public class Account {
    private int number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(int deposit) {
        if (deposit <= 0) {
            System.out.println("Не вернаяя сумма для внесения на депозит!");
        } else {
            System.out.println("Сумма внесения на дипозит: " + deposit + "\nОстаток на счету: " + (this.balance += deposit));
        }

    }

    public void withdrawal(int withdrawal) {
        if (withdrawal > this.balance) {
            System.out.println("Нет средств на счету!\n");
        } else {
            System.out.println("Сумма для снятия: " + withdrawal + "\nОстаток средств на счету: " + (this.balance -= withdrawal) + "\n");
        }

    }
}
