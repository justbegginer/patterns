package facade;

public class Developer {
    Post post;
    public Developer(Post post){
        this.post = post;
    }
    public int getProductivity(){
        switch (post){
            case Trainee:
                return 1;
            case Junior:
                return 2;
            case Middle:
                return 5;
            case Senior:
                return 7;
            default:
                return 0;
        }
    }
}
