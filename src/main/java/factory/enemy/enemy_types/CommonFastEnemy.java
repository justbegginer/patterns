package factory.enemy.enemy_types;

import factory.enemy.rarity_gradation.Common;

public class CommonFastEnemy extends Common {
    protected CommonFastEnemy(int attack, int hp) {
        super(attack, hp);
    }

    @Override
    public String toString() {
        return "CommonFastEnemy{" +
                "attack=" + attack +
                ", hp=" + hp +
                ", rarity=" + rarity +
                '}';
    }
}
