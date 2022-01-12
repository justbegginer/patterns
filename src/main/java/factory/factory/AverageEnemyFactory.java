package factory.factory;

import factory.enemy.enemy_types.SimpleAverageEnemy;
import factory.enemy.rarity_gradation.Enemy;
import factory.enemy.rarity_gradation.Rarity;

public class AverageEnemyFactory implements EnemyFactory {

    @Override
    public Enemy create(Rarity rarity) {
        return null;
    }
}
