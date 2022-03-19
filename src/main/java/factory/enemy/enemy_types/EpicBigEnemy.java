package factory.enemy.enemy_types;

import factory.enemy.rarity_gradation.Epic;
import lombok.ToString;

@ToString(callSuper = true)
public class EpicBigEnemy extends Epic {
    public EpicBigEnemy(int attack, int hp) {
        super(attack, hp);
    }

}
