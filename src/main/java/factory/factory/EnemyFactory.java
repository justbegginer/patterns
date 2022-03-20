package factory.factory;

import factory.enemy.rarity_gradation.Enemy;
import factory.enemy.rarity_gradation.Rarity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;


@AllArgsConstructor(access =  AccessLevel.PROTECTED)
public abstract class EnemyFactory {
    protected int hp, attack;
    public abstract Enemy create(Rarity rarity);
}
