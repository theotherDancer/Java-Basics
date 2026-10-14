import java.io.File;

public class FileDemo5 {
    static void main(String[] args) {
        File f1=new File("C:\\Users\\lenovo\\Desktop\\abc.txt");
        boolean b=f1.delete();
        System.out.println(b);
    }
}
