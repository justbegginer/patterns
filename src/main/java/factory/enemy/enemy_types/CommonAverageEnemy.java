package factory.enemy.enemy_types;

import factory.enemy.rarity_gradation.Common;

public class CommonAverageEnemy extends Common {
    public CommonAverageEnemy(int attack, int hp) {
        super(attack, hp);
    }

    @Override
    public String toString() {
        return "CommonAverageEnemy{" +
                "attack=" + attack +
                ", hp=" + hp +
                ", rarity=" + rarity +
                '}';
    }
}
