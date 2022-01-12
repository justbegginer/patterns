package factory;

import factory.enemy.rarity_gradation.Enemy;
import factory.enemy.rarity_gradation.Rarity;
import factory.factory.AverageEnemyFactory;
import factory.factory.BigEnemyFactory;
import factory.factory.EnemyFactory;

import factory.factory.FastEnemyFactory;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class EnemyTest {
    static class Task{
        public static void task(){
            forAllSpecification(Rarity.SIMPLE);
            forAllSpecification(Rarity.COMMON);
            forAllSpecification(Rarity.RARE);
            forAllSpecification(Rarity.EPIC);
            forAllSpecification(Rarity.LEGENDARY);

        }
        private static void forAllSpecification(Rarity rarity){
            EnemyFactory factory = new AverageEnemyFactory();
            System.out.println(factory.create(rarity));
            factory = new BigEnemyFactory();
            System.out.println(factory.create(rarity));
            factory = new FastEnemyFactory();
            System.out.println(factory.create(rarity));
        }
    }
    @Test
    void factory(){
        Task.task();
    }
}