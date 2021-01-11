package ua.butsai.homework22;

public abstract class Character {

    private String name;
    private WeaponBehavior weapon;
    private ProtectionBehavior protection;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeaponBehavior(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void setProtection(ProtectionBehavior protection) {
        this.protection = protection;
    }

    public void performWeapon() {
        weapon.useWeapon();
    }

    public void performProtection() {
        protection.useProtection();
    }

    public void fight() {
        System.out.println(name + " attack troll");
    }

}
