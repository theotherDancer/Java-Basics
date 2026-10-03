package com.APITest1;
    //导包
// 使用本包中的类不需要导包，使用java.lang包中的类不需要导包
import java.util.Random;

public class Test {
    static void main(String[] args) {
        Random r=new Random();
        //调用方法获取一个随机的小数【0.0,1.0）
        double d=r.nextDouble();
        System.out.println(d);
        //获取一个随机的二位小数
        int i=r.nextInt(100);
        System.out.println(i/100.0);
       double d1=r.nextDouble(150.0);//获取一个从0.0到150.0之间的随机的小数
       System.out.println(d1);
       double d2=r.nextDouble(2.0,6.0);//获取一个从2.0到6.0之间的随机的小数
       System.out.println(d2);
    }
}
