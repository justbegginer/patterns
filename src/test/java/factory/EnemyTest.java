package factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {
    @Test
    void factory(){
        EnemyFactory enemyFactory = new FastEnemyFactory();
        Enemy enemy = enemyFactory.create();
        System.out.println("Must be FAST enemy");
        System.out.println(enemy);
        enemyFactory = new AverageEnemyFactory();
        enemy = enemyFactory.create();
        System.out.println("Must be AVERAGE enemy");
        System.out.println(enemy);
        enemyFactory = new BigEnemyFactory();
        enemy = enemyFactory.create();
        System.out.println("Must be BIG enemy");
        System.out.println(enemy);
    }
}