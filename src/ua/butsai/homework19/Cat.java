package ua.butsai.homework19;

public class Cat extends Animal {
    /**
     * Дочерный класс Cat унаследован от Animal
     * @param name
     */
    public Cat(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Я кот. Зовут меня - " + super.getName();
    }
}
