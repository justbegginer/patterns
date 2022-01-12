package factory.enemy.enemy_types;

import factory.enemy.rarity_gradation.Epic;

public class EpicBigEnemy extends Epic {
    public EpicBigEnemy(int attack, int hp) {
        super(attack, hp);
    }

    @Override
    public String toString() {
        return "EpicBigEnemy{" +
                "attack=" + attack +
                ", hp=" + hp +
                ", rarity=" + rarity +
                '}';
    }
}
