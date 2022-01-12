package factory.enemy.enemy_types;

import factory.enemy.rarity_gradation.Common;

public class CommonBigEnemy extends Common {
    public CommonBigEnemy(int attack, int hp) {
        super(attack, hp);
    }

    @Override
    public String toString() {
        return "CommonBigEnemy{" +
                "attack=" + attack +
                ", hp=" + hp +
                ", rarity=" + rarity +
                '}';
    }
}
