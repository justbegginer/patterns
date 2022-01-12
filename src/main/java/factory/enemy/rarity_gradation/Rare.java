package factory.enemy.rarity_gradation;

public abstract class Rare extends Enemy {
    protected Rare(int attack, int hp) {
        super(attack, hp, 1.4);
        this.rarity = Rarity.RARE;
    }
}
