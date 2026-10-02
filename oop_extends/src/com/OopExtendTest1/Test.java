package com.OopExtendTest1;

public class Test {
    static void main(String[] args) {
        //创建对象
        Student S=new Student();
        S.age=18;
        S.grade="三年级";
        S.name="张三";
        System.out.println(S.name);
        Teacher T=new Teacher();
        T.subject="数学";
        T.age=25;
        T.teach();
    }
}
