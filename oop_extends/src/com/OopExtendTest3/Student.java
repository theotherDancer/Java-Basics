package com.OopExtendTest3;
    //继承中成员的构造方法
public class Student extends Person {
    String grade;
    public Student() {
        System.out.println("无参构造已完成~");
    }

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
        System.out.println("带全部参数的构造已完成");
    }


}
