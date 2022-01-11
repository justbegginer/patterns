package factory;

public class BigEnemy extends Enemy{
    public BigEnemy() {
        super(5, 200);
    }

    @Override
    public void attack() {
        System.out.println("slow attack");
    }

    @Override
    public void move() {
        System.out.println("slow move");
    }

    @Override
    public String toString() {
        return "BigEnemy{" +
                "attack=" + attack +
                ", hp=" + hp +
                '}';
    }
}
