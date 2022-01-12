package factory.enemy.rarity_gradation;

public abstract class Common extends Enemy{
    protected Common(int attack, int hp) {
        super(attack, hp, 1.2);
        this.rarity = Rarity.COMMON;
    }
}
