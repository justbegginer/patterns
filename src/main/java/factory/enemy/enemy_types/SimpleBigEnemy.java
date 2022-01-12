package factory.enemy.enemy_types;

import factory.enemy.rarity_gradation.Enemy;
import factory.enemy.rarity_gradation.Simple;

public class SimpleBigEnemy extends Simple {
    public SimpleBigEnemy() {
        super(5, 200);

    }

    @Override
    public String toString() {
        return "SimpleBigEnemy{" +
                "attack=" + attack +
                ", hp=" + hp +
                ", rarity=" + rarity +
                '}';
    }
}
