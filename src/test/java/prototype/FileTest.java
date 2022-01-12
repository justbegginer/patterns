package prototype;

import org.junit.jupiter.api.Test;

public class FileTest {

    void task(File file){
        System.out.println(file);
        File file1 = file.clone();
        System.out.println(file1);
        File file2 = file.clone();
        System.out.println(file2);
    }
    @Test
    void prototype(){
        File file = new ReadableFile("find", "200");
        task(file);
        file = new WritableFile("not find", "404");
        //file = (WritableFile)file.clone();
        task(file);
        file = new File("find", "200");
        task(file);
    }
}
