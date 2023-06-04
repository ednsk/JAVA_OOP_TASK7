package seminar.JAVA_OOP_TASK7.items;

import seminar.JAVA_OOP_TASK7.shields.Shield;
import seminar.JAVA_OOP_TASK7.weapons.Bow;

public class Archer extends Warrior<Bow, Shield> implements DistanceAttacker {
    private int distance;

    public Archer(String name, Bow weapon, Shield shield) {
        super(name, weapon, shield);

        distance = weapon.getDistance() + rnd.nextInt(10);
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return super.toString() + " Type = Archer{" +
                "distance=" + distance +
                '}';
    }
}
