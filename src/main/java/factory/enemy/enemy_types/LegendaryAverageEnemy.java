package factory.enemy.enemy_types;

import factory.enemy.rarity_gradation.Legendary;

public class LegendaryAverageEnemy extends Legendary {
    public LegendaryAverageEnemy(int attack, int hp) {
        super(attack, hp);
    }

    @Override
    public String toString() {
        return "LegendaryAverageEnemy{" +
                "attack=" + attack +
                ", hp=" + hp +
                ", rarity=" + rarity +
                '}';
    }
}
