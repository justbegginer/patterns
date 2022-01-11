package factory;

public class FastEnemy extends Enemy{
    public FastEnemy() {
        super(20, 50);
    }

    @Override
    public void attack() {
        System.out.println("Strong attack");
    }

    @Override
    public void move() {
        System.out.println("move fast");
    }

    @Override
    public String toString() {
        return "FastEnemy{" +
                "attack=" + attack +
                ", hp=" + hp +
                '}';
    }
}
