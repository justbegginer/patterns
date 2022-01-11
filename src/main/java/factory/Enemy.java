package factory;

public abstract class Enemy implements Person{
    protected int attack, hp;
    protected Enemy(int attack, int hp){
        this.hp = hp;
        this.attack = attack;
    }
}
