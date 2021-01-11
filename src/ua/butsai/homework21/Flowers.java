package ua.butsai.homework21;

public abstract class Flowers implements Flower {

    private String name;
    private double cost;

    public Flowers(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
