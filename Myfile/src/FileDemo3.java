import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo3 {
    static void main(String[] args) {
        File f1=new File("C:\\Users\\lenovo\\Desktop\\abc.txt");
        System.out.println(f1.length());
        //由上可知：数字占一个字节，英文分号占一个字节，中文分号占三个字节
        //注意;这个方法无法获取文件夹的大小，只能获取文件：测试：
        File f2=new File("C:\\Users\\lenovo\\Desktop");
        System.out.println(f2.length());
        //获取绝对路径：
        File f3=new File("Myfile\\a.txt");
        System.out.println(f3.getAbsolutePath());
        File f4=new File("a.txt");
        System.out.println(f4.getAbsolutePath());
        //getName
        System.out.println(f1.getName());//如果调用它的是文件，会返回文件的名字加后缀
        System.out.println(f2.getName());//如果调用的是文件夹，只会返回文件夹的名字

        System.out.println(f1.lastModified());
        long ms = f1.lastModified();
        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(ms));
        System.out.println(time);

    }
}
