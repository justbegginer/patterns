package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void singleton(){
        User singleton = User.getInstance(1323, "John", "Doe", 21);
        User theSame = User.getInstance(10000, "Jimmy", "MacCavern", 30);
        assertEquals(singleton.getAge(), theSame.getAge());
        assertEquals(singleton.getId(), theSame.getId());
        assertEquals(singleton.getNameFirst(), theSame.getNameFirst());
        assertEquals(singleton.getNameSecond(), theSame.getNameSecond());
        System.out.println("--->>SINGLETON<<---");
        System.out.println("==FIRST==");
        System.out.println(singleton);
        System.out.println("==SECOND==");
        System.out.println(theSame);
        System.out.println("--->>END<<--");
    }

}