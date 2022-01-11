package factory;

public class AverageEnemyFactory implements EnemyFactory{
    @Override
    public Enemy create() {
        return new AverageEnemy();
    }
}
