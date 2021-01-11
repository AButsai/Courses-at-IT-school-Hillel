package ua.butsai.homework20;

public class Baggage {

    private int amount;
    private int customsFee;

    public Baggage(int amount, int customsFee) {
        this.amount = amount;
        this.customsFee = customsFee;
    }

    public int getFee() {
        return this.amount * this.customsFee;
    }

    @Override
    public String toString() {
        return "Baggage{" + "amount=" + amount + ", customsFee=" + customsFee + '}';
    }
}
