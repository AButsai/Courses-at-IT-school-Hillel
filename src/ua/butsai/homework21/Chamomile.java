package ua.butsai.homework21;

public class Chamomile extends Flowers {

    public Chamomile() {
        super("Ромашка", 15);
    }

    @Override
    public void display() {
        System.out.println(getName() + " (" + getCost() + ")");
    }
}
