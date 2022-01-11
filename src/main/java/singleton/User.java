package singleton;

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


    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public String getNameSecond() {
        return nameSecond;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", nameFirst='" + nameFirst + '\'' +
                ", nameSecond='" + nameSecond + '\'' +
                '}';
    }
}
