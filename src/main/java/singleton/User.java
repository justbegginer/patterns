package singleton;

import lombok.Data;

@Data
public class User {
    private static User instance;
    private int id,age;
    private String nameFirst,nameSecond;
    private User(int id, String nameFirst, String nameSecond, int age){
        this.id = id;
        this.age = age;
        this.nameFirst = nameFirst;
        this.nameSecond = nameSecond;
    }

    public static User getInstance(int id, String nameFirst, String nameSecond, int age){
        if (instance == null){
            instance = new User(id, nameFirst, nameSecond, age);
        }
        return instance;
    }
}
