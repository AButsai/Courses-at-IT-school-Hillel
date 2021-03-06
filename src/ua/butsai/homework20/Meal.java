package ua.butsai.homework20;

public class Meal {

    private Menu menu;
    private Drinks drinks;

    public Meal(Menu menu, Drinks drinks) {
        this.menu = menu;
        this.drinks = drinks;
    }

    public int getPrice() {
        return drinks.getPrice() + menu.getPrice();
    }

    public Menu getMenu() {
        return menu;
    }

    public Drinks getDrinks() {
        return drinks;
    }

    @Override
    public String toString() {
        return "Meal{" + "menu=" + menu + ", drinks=" + drinks + '}';
    }
}
