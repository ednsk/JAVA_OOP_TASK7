package seminar.JAVA_OOP_TASK7.weapons;

public class Bow implements Weapon {

    private int distance = 30;

    public int getDistance() {
        return distance;
    }

    @Override
    public int damage() {
        return 50;
    }

    @Override
    public String toString() {
        return "Bow{ " +
                "distance=" + distance +
                " damage= " + damage() +
                '}';
    }
}
