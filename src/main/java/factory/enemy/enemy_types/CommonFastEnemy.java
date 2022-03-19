package factory.enemy.enemy_types;

import factory.enemy.rarity_gradation.Common;
import lombok.ToString;

@ToString(callSuper = true)
public class CommonFastEnemy extends Common {
    public CommonFastEnemy(int attack, int hp) {
        super(attack, hp);
    }

}
