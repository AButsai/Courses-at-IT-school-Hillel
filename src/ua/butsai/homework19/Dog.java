package ua.butsai.homework19;

public class Dog extends Animal {
    /**
     * Дочерный класс Dog унаследован от Animal
     * @param name
     */

    public Dog(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Я собака. Зовут меня - " + super.getName();
    }
}
