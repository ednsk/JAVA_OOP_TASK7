package seminar.JAVA_OOP_TASK7.weapons;

public class Sword implements Weapon {
    @Override
    public int damage() {
        return 80;
    }

    @Override
    public String toString() {
        return "Damage sword= " + damage();
    }
}
