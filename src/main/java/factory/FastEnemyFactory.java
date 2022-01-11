package factory;

public class FastEnemyFactory implements EnemyFactory{
    @Override
    public Enemy create() {
        return new FastEnemy();
    }
}
