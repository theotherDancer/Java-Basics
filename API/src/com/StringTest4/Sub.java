package com.StringTest4;

public class Sub {
    static void main(String[] args) {

       /* String S="afhuihvn";
        String T=S.substring(3);
        System.out.println(T);//从第三个字符开始，但是不包括第三个字符
        String Y=S.substring(3,5);
        System.out.println(Y);//从第三个字符开始截取，到第五个字符，不包括第三个。但是包括第五个
        System.out.println(S);//注意：截取的结果只会上传到返回值，但是字符串本身不会发生改变*/
        //题目：只保留用户的第一个字符，剩下的用***代替
        String name="1234";
        //第一种方法
        //错误示范，这里涉及到强制类型转换String n=name.charAt(0);
        //正确方法
        char c = name.charAt(0);
        String name_=c+"***";
        System.out.println(name_);
        //第二种方法，使用截取
        String name__ = name.substring(0, 1);
        System.out.println(name__);//注意，截取里面输入的数字不是数组的索引，而是实在的第几个字符
        name__+="***";
        System.out.println(name__);

    }
}
