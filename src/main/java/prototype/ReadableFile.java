package prototype;

public class ReadableFile extends File implements Readable{
    public ReadableFile(String status, String name) {
        super(status, name);
    }

    public ReadableFile(File another) {
        super(another);
    }

    @Override
    public File clone() {
        return (new ReadableFile(this));
    }

    @Override
    public void read() {
        System.out.println("Reading");
    }

    @Override
    public String toString() {
        return "ReadableFile - >" + super.toString();
    }
}
