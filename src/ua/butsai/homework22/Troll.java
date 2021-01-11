package ua.butsai.homework22;

public class Troll extends Character {

    public Troll(String name) {
        super(name);
    }

    @Override
    public void fight() {
        System.out.println("Troll, " +  super.getName() + ", attack...");
    }
}
