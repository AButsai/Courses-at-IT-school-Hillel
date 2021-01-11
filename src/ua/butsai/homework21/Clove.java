package ua.butsai.homework21;

public class Clove extends Flowers {

    public Clove() {
        super("Гвоздика", 20);
    }

    @Override
    public void display() {
        System.out.println(getName() + " (" + getCost() + ")");
    }
}
