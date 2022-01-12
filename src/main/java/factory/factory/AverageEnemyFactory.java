package factory.factory;

import factory.enemy.enemy_types.*;
import factory.enemy.rarity_gradation.Enemy;
import factory.enemy.rarity_gradation.Rarity;

public class AverageEnemyFactory extends EnemyFactory {

    public AverageEnemyFactory() {
        super(10, 50);
    }


    @Override
    public Enemy create(Rarity rarity) {
        switch (rarity){
            case SIMPLE:
                return new SimpleAverageEnemy(attack, hp);
            case COMMON:
                return new CommonAverageEnemy(attack, hp);
            case RARE:
                return new RareAverageEnemy(attack, hp);
            case EPIC:
                return new EpicAverageEnemy(attack, hp);
            case LEGENDARY:
                return new LegendaryAverageEnemy(attack, hp);
            default:
                return null;

        }
    }
}
