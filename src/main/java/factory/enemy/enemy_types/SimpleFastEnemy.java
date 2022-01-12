package factory.enemy.enemy_types;

import factory.enemy.rarity_gradation.Enemy;
import factory.enemy.rarity_gradation.Simple;

public class SimpleFastEnemy extends Simple {
    public SimpleFastEnemy() {
        super(20, 50);
    }

    @Override
    public String toString() {
        return "SimpleFastEnemy{" +
                "attack=" + attack +
                ", hp=" + hp +
                ", rarity=" + rarity +
                '}';
    }
}
