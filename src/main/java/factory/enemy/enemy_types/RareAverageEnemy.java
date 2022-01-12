package factory.enemy.enemy_types;

import factory.enemy.rarity_gradation.Rare;

public class RareAverageEnemy extends Rare {

    public RareAverageEnemy(int attack, int hp) {
        super(attack, hp);
    }

    @Override
    public String toString() {
        return "RareAverageEnemy{" +
                "attack=" + attack +
                ", hp=" + hp +
                ", rarity=" + rarity +
                '}';
    }
}
