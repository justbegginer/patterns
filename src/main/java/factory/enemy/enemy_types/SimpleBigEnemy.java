package factory.enemy.enemy_types;

import factory.enemy.rarity_gradation.Enemy;
import factory.enemy.rarity_gradation.Simple;

public class SimpleBigEnemy extends Simple {
    public SimpleBigEnemy(int attack, int hp) {
        super(attack, hp);

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
