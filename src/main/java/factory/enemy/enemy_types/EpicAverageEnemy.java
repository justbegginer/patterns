package factory.enemy.enemy_types;

import factory.enemy.rarity_gradation.Epic;
import lombok.ToString;

@ToString(callSuper = true)
public class EpicAverageEnemy extends Epic {
    public EpicAverageEnemy(int attack, int hp) {
        super(attack, hp);
    }
}
