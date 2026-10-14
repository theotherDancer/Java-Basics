import java.io.File;
import java.io.IOException;

public class FileDemo4 {
    static void main(String[] args) throws IOException {
        File f1=new File("C:\\Users\\lenovo\\Desktop\\abc.txt");
        f1.createNewFile();
        boolean b=f1.createNewFile();
        System.out.println(b);

        File f2=new File("C:\\Users\\lenovo\\Desktop\\d.txt");

        boolean c=f2.createNewFile();
        System.out.println(c);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       try {
          File f3 = new File("C:\\\\lenfrfoo\\Drfrefop\\d.txt");
           boolean d = f3.createNewFile();
           System.out.println(d);
       } catch (Exception e) {
           System.out.println("出错了，未找到对应的路径，但程序还是继续跑~~");
       }
        System.out.println("`````````````````````````");
        File f4=new File("C:\\Users\\lenovo\\Desktop\\frg");
        boolean e=f4.createNewFile();
        System.out.println(e);
        //创建文件夹
        //单集
        File f5=new File("C:\\Users\\lenovo\\Desktop\\gr");
        boolean bl=f5.mkdir();
        System.out.println(bl);
        //多集
        File f6=new File("C:\\Users\\lenovo\\Desktop\\fk\\cc\\xx");
        boolean bc=f6.mkdirs();
        System.out.println(bc);


    }
}
