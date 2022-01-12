package factory.enemy.rarity_gradation;

public abstract class Simple extends Enemy {
    protected Simple(int attack, int hp) {
        super(attack, hp, 1.1);
        this.rarity = Rarity.SIMPLE;
    }

}
