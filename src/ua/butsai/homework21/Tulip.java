package ua.butsai.homework21;

public class Tulip extends Flowers {

    public Tulip() {
        super("Тюльпан", 30);
    }

    @Override
    public void display() {
        System.out.println(getName() + " (" + getCost() + ")");
    }
}
