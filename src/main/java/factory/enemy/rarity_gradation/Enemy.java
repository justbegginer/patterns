package factory.enemy.rarity_gradation;

import lombok.ToString;

@ToString
public abstract class Enemy implements Person {
    protected int attack, hp;
    protected double multiplier;
    protected Rarity rarity;
    protected Enemy(int attack, int hp, double multiplier){
        this.hp = hp;
        this.attack = attack;
        this.multiplier = multiplier;
        multiply();
    }
    private void multiply(){
        this.hp*=multiplier;
        this.attack*=multiplier;
    }

    @Override
    public void sayName() {
        System.out.println(this.getClass().getName());
    }
}
