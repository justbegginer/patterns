package factory.enemy.enemy_types;

import factory.enemy.rarity_gradation.Common;
import lombok.ToString;

@ToString(callSuper = true)
public class CommonBigEnemy extends Common {
    public CommonBigEnemy(int attack, int hp) {
        super(attack, hp);
    }

}
