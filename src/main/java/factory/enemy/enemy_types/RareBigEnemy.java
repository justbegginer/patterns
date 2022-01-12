package factory.enemy.enemy_types;

import factory.enemy.rarity_gradation.Rare;

public class RareBigEnemy extends Rare {
    public RareBigEnemy(int attack, int hp) {
        super(attack, hp);
    }

    @Override
    public String toString() {
        return "RareBigEnemy{" +
                "attack=" + attack +
                ", hp=" + hp +
                ", rarity=" + rarity +
                '}';
    }
}
