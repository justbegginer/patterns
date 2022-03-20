package facade;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Developer {
    Post post;
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
