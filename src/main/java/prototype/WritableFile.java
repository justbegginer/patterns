package prototype;

import lombok.ToString;

@ToString(callSuper = true)
public class WritableFile extends File implements Writable{

    public WritableFile(String status, String name) {
        super(status, name);
    }

    public WritableFile(File another) {
        super(another);
    }

    @Override
    public File clone() {
        return new WritableFile(this);
    }

    @Override
    public void write() {
        System.out.println("sout");
    }
}
