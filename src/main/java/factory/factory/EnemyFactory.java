package factory.factory;

import factory.enemy.rarity_gradation.Enemy;
import factory.enemy.rarity_gradation.Rarity;


public abstract class EnemyFactory {
    protected int hp, attack;
    protected EnemyFactory(int attack, int hp){
        this.attack = attack;
        this.hp = hp;
    }
    public abstract Enemy create(Rarity rarity);
}
