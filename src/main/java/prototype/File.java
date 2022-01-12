package prototype;

public class File implements Cloneable{
    private String status, name;
    public File(String status, String name){
        this.status = status;
        this.name = name;
    }

    public File(File another){
        this.name = another.name;
        this.status = another.status;
    }

    @Override
    public File clone() {
        return new File(this);
    }

    @Override
    public String toString() {
        return "File{" +
                "status='" + status + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
