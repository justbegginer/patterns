package factory;

public class BigEnemyFactory implements EnemyFactory{
    @Override
    public Enemy create() {
        return new BigEnemy();
    }
}
