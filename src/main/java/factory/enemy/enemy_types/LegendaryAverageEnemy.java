package factory.enemy.enemy_types;

import factory.enemy.rarity_gradation.Legendary;
import lombok.ToString;

@ToString(callSuper = true)
public class LegendaryAverageEnemy extends Legendary {
    public LegendaryAverageEnemy(int attack, int hp) {
        super(attack, hp);
    }

}
