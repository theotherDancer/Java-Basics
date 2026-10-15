import java.io.File;

public class FileDemo6 {
    static void main(String[] args) {
        File f1=new File("C:\\Users\\lenovo\\Desktop");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);

        }

    }
}
