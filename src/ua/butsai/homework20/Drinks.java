package ua.butsai.homework20;

public enum Drinks {

    YES(1, "Напитки", 50),
    NO(2, "Без напитка", 0);
    private int var;
    private String description;
    private int prise;

    Drinks(int var, String description, int prise) {
        this.var = var;
        this.description = description;
        this.prise = prise;
    }

    public int getVar() {
        return var;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return prise;
    }

    @Override
    public String toString() {
        return "Drinks{" + "var=" + var + ", description='" + description + '\'' + ", prise=" + prise + '}';
    }
}
