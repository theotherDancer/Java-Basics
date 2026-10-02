package com.oop.test1;

public class Test {
    static void main(String[] args) {
        Dog d1=new Dog();//创建了一个对象，去管理第一只小狗的信息
        d1.age=10;
        d1.color="白色";
        d1.name="bark";
        d1.weight=6.5;
        //获取第一只狗的信息
        System.out.println(d1.name);
        System.out.println(d1.color);
        System.out.println(d1.weight);
        System.out.println(d1.age);
    }
}
