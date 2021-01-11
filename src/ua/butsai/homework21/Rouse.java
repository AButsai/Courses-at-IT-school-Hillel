package ua.butsai.homework21;

public class Rouse extends Flowers {

    public Rouse() {
        super("Роза", 50);
    }

    @Override
    public void display() {
        System.out.println(getName() + " (" + getCost() + ")");
    }
}
