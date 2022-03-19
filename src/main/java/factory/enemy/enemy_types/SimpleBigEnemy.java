package factory.enemy.enemy_types;

import factory.enemy.rarity_gradation.Enemy;
import factory.enemy.rarity_gradation.Simple;
import lombok.ToString;

@ToString(callSuper = true)
public class SimpleBigEnemy extends Simple {
    public SimpleBigEnemy(int attack, int hp) {
        super(attack, hp);

    }

}
