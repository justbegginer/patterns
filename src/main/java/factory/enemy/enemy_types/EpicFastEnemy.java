package factory.enemy.enemy_types;

import factory.enemy.rarity_gradation.Epic;

public class EpicFastEnemy extends Epic {
    public EpicFastEnemy(int attack, int hp) {
        super(attack, hp);
    }

    @Override
    public String toString() {
        return "EpicFastEnemy{" +
                "attack=" + attack +
                ", hp=" + hp +
                ", rarity=" + rarity +
                '}';
    }
}
