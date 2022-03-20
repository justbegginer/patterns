package prototype;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class File implements Cloneable{
    private String status, name;

    public File(File another){
        this.name = another.name;
        this.status = another.status;
    }

    @Override
    public File clone() {
        return new File(this);
    }

}
