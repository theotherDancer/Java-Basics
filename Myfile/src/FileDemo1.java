import java.io.File;

public class FileDemo1 {
    static void main(String[] args) {
        String str="C:\\Users\\lenovo\\Desktop\\abc.txt";
        File fi=new File(str);
        System.out.println(fi);
        String str1="aaa.txt";
        //这里用了拼接
        File f2=new File(str,str1);
        System.out.println(f2);
    }
}
