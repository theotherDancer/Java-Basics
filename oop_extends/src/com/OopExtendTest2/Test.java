package com.OopExtendTest2;

public class Test {
    static void main(String[] args) {
        Android a=new Android();
        a.brand="小米";
        a.price=1999.0;
        a.NFC();
        System.out.println(a.brand);
        a.call();//安卓手机在这里进行了方法的重写//使用alt+insert
        Apple A=new Apple();
        A.call();
    }

}
