package seminar.JAVA_OOP_TASK7.items;

import seminar.JAVA_OOP_TASK7.shields.Shield;
import seminar.JAVA_OOP_TASK7.weapons.Sword;

public class SwordMan extends Warrior<Sword, Shield> {
    public SwordMan(String name, Sword weapon, Shield shield) {
        super(name, weapon, shield);
    }


    @Override
    public String toString() {
        return super.toString() + " Type = SwordMan";
    }
}
