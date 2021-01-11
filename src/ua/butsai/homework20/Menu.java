package ua.butsai.homework20;

public enum Menu {

    SOUP(1, "Суп", 70),
    VEGETABLES(2, "Овощи", 50),
    MEAT(3, "Мясо", 500),
    DESSERT(4, "Десерт", 100);

    private int var;
    private String description;
    private int price;

    Menu(int var, String description, int price) {
        this.var = var;
        this.description = description;
        this.price = price;
    }

    public int getVar() {
        return var;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Menu{" + "var=" + var + ", description='" + description + '\'' + ", prise=" + price + '}';
    }
}
