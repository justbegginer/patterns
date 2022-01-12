package factory.enemy.rarity_gradation;

public abstract class Legendary extends Enemy{
    protected Legendary(int attack, int hp) {
        super(attack, hp, 2.5);
        this.rarity = Rarity.LEGENDARY;
    }
}
