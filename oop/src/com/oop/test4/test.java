package com.oop.test4;

public class test {
    static void main(String[] args) {
        student a=new student();
        a.setAge(18);
        a.setHeight(167);
        a.setName("小张");
        a.setHeight(50);
        //调用要用get，set表示修改
        //并且在调用时要带上a.
        a.setAge(a.getAge()+1);
        System.out.println(a.getAge());
    }

}
