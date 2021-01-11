package ua.butsai.homework21;

public class Peony extends Flowers {

    public Peony() {
        super("Пеон", 25);
    }

    @Override
    public void display() {
        System.out.println(getName() + " (" + getCost() + ")");
    }
}
