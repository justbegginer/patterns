package factory.enemy.enemy_types;

import factory.enemy.rarity_gradation.Enemy;
import factory.enemy.rarity_gradation.Simple;

public class SimpleAverageEnemy extends Simple {
    public SimpleAverageEnemy() {
        super(10, 100);
    }



    @Override
    public String toString() {
        return "SimpleAverageEnemy{" +
                "attack=" + attack +
                ", hp=" + hp +
                ", rarity=" + rarity +
                '}';
    }
}
