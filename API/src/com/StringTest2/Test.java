package com.StringTest2;

public class Test {
    static void main(String[] args) {
        //第一种方法，直接赋值
        String str="hello";
        System.out.println(str);
        //第二种方法，使用构造方法创建，new加空参构造
        String str1=new String();
        System.out.println(str1);//什么都不写的话，输出的是空字符串
        //第三种方法，使用构造方法创建，new加有参构造
        String str2=new String("hello");
        System.out.println(str2);//或者小括号里面写str也可以
        //第四种方法，使用构造方法创建，new加有参构造，参数为char数组
        String str3=new String(new char[]{'h','e','l','l','o'});
        System.out.println(str3);
        //第五种方法，使用构造方法创建，new加有参构造，参数为byte数组
        String str4=new String(new byte[]{97,98,99,100,101});
        System.out.println(str4);
    }
}
