package factory.enemy.enemy_types;

import factory.enemy.rarity_gradation.Legendary;

public class LegendaryFastEnemy extends Legendary {
    public LegendaryFastEnemy(int attack, int hp) {
        super(attack, hp);
    }

    @Override
    public String toString() {
        return "LegendaryFastEnemy{" +
                "attack=" + attack +
                ", hp=" + hp +
                ", rarity=" + rarity +
                '}';
    }
}
