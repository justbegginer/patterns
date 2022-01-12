package factory.enemy.rarity_gradation;

public abstract class Epic extends Enemy{
    protected Epic(int attack, int hp) {
        super(attack, hp, 1.8);
        this.rarity = Rarity.EPIC;
    }

}
