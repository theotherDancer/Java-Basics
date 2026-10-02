package com.OopExtendTest1;

public class Student extends Person {
    //特有的内容，属性：年级
    String grade;
    //特有的行为：学习
    public void study(){
        System.out.println("学生在学习ing");
    }
}
