package factory.enemy.enemy_types;

import factory.enemy.rarity_gradation.Legendary;

public class LegendaryBigEnemy extends Legendary {

    public LegendaryBigEnemy(int attack, int hp) {
        super(attack, hp);
    }

    @Override
    public String toString() {
        return "LegendaryBigEnemy{" +
                "attack=" + attack +
                ", hp=" + hp +
                ", rarity=" + rarity +
                '}';
    }
}
