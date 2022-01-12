package factory.factory;

import factory.enemy.enemy_types.*;
import factory.enemy.rarity_gradation.Enemy;
import factory.enemy.rarity_gradation.Rarity;

public class FastEnemyFactory extends EnemyFactory {
    protected FastEnemyFactory(int attack, int hp) {
        super(20, 25);
    }

    @Override
    public Enemy create(Rarity rarity) {
        switch (rarity){
            case SIMPLE:
                return new SimpleFastEnemy(attack, hp);
            case COMMON:
                return new CommonFastEnemy(attack, hp);
            case RARE:
                return new RareFastEnemy(attack, hp);
            case EPIC:
                return new EpicFastEnemy(attack, hp);
            case LEGENDARY:
                return new LegendaryFastEnemy(attack, hp);
            default:
                return null;
        }
    }
}
