package factory.factory;

import factory.enemy.enemy_types.*;
import factory.enemy.rarity_gradation.Enemy;
import factory.enemy.rarity_gradation.Rarity;

public class BigEnemyFactory extends EnemyFactory {
    public BigEnemyFactory(){
        super(5, 100);
    }
    @Override
    public Enemy create(Rarity rarity) {
        switch (rarity){
            case SIMPLE:
                return new SimpleBigEnemy(attack, hp);
            case COMMON:
                return new CommonBigEnemy(attack, hp);
            case RARE:
                return new RareBigEnemy(attack, hp);
            case EPIC:
                return new EpicBigEnemy(attack, hp);
            case LEGENDARY:
                return new LegendaryBigEnemy(attack, hp);
            default:
                return null;
        }
    }
}
