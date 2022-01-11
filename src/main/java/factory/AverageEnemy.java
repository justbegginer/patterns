package factory;

public class AverageEnemy extends Enemy{
    public AverageEnemy() {
        super(10, 100);
    }

    @Override
    public void attack() {
        System.out.println("attack");
    }

    @Override
    public void move() {
        System.out.println("move");
    }

    @Override
    public String toString() {
        return "AverageEnemy{" +
                "attack=" + attack +
                ", hp=" + hp +
                '}';
    }
}
