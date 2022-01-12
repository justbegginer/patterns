package factory.enemy.enemy_types;

import factory.enemy.rarity_gradation.Rare;

public class RareFastEnemy extends Rare {

    public RareFastEnemy(int attack, int hp) {
        super(attack, hp);
    }

    @Override
    public String toString() {
        return "RareFastEnemy{" +
                "attack=" + attack +
                ", hp=" + hp +
                ", rarity=" + rarity +
                '}';
    }
}
