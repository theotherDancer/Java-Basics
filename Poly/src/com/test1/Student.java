package com.test1;

public class Student extends Person{
    public Student() {
    }

    public Student(String name, String ID, String pass) {
        super(name, ID, pass);
    }

    @Override
    public void work() {
        System.out.println("学生需要学习");
    }
}
