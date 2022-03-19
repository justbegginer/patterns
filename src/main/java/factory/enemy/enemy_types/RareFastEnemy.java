package factory.enemy.enemy_types;

import factory.enemy.rarity_gradation.Rare;
import lombok.ToString;

@ToString(callSuper = true)
public class RareFastEnemy extends Rare {

    public RareFastEnemy(int attack, int hp) {
        super(attack, hp);
    }

}
