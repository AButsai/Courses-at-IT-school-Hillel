package ua.butsai.homework23;

import java.util.Objects;

public class Contacts {
    private String name;
    private long number;

    public Contacts() {
    }

    public Contacts(String name, long number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name = '" + name + '\'' +
                ", number = " + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacts contacts = (Contacts) o;
        return number == contacts.number &&
                name.equals(contacts.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }
}
