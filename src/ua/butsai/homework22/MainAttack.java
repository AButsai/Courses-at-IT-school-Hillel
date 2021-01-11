package ua.butsai.homework22;

/**
 * Программирование приключенческой игры.
 * Запрограммировать решение головоломки,
 * которая размещена на последней странице прикрепленного материала.
 * <p>
 * Материал в папке res//Паттерн_Стратегия.pdf
 */

public class MainAttack {

    public static void main(String[] args) {
        Character character = new King("Artur");
        attack(character);
        character = new Troll("Goal Eater");
        attack(character);
        character = new Knight("Lancelot");
        attack(character);
        character = new Queen("Guinevere");
        attack(character);
    }

    public static void attack(Character character) {
        character.fight();
        switch (character.getName()) {
            case "Artur":
                character.setWeaponBehavior(new SwordBehavior());
                character.performWeapon();
                break;
            case "Guinevere":
                character.setWeaponBehavior(new KnifeBehavior());
                character.performWeapon();
                break;
            case "Lancelot":
                character.setWeaponBehavior(new BowAndArrowBehavior());
                character.performWeapon();
                break;
            default:
                character.setProtection(new ProtectionBehavior());
                character.performProtection();
                character.setWeaponBehavior(new AxeBehavior());
                character.performWeapon();
                break;
        }
    }
}
