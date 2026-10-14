import java.io.File;

public class FileDemo2 {
    static void main(String[] args) {
        File f1=new File("C:\\Users\\lenovo\\Desktop\\abc.txt");
        System.out.println(f1.isDirectory());//判断这个是不是文件夹
        System.out.println(f1.isFile());//判断是不是个文件
        System.out.println(f1.exists());//判断这个文件是否存在
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        File f2=new File("C:\\Users\\lenovo\\Desktop");
        System.out.println(f2.isDirectory());//判断这个是不是文件夹
        System.out.println(f2.isFile());//判断是不是个文件
        System.out.println(f2.exists());//判断这个文件是否存在
        //假设文件不存在，那么上述的三个问题都是false！！！
    }
}
