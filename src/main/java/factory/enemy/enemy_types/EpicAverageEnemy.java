package factory.enemy.enemy_types;

import factory.enemy.rarity_gradation.Epic;

public class EpicAverageEnemy extends Epic {
    public EpicAverageEnemy(int attack, int hp) {
        super(attack, hp);
    }

    @Override
    public String toString() {
        return "EpicAverageEnemy{" +
                "attack=" + attack +
                ", hp=" + hp +
                ", rarity=" + rarity +
                '}';
    }
}
