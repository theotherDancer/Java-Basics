package com.test1;

public class Teacher extends Person{
    public Teacher() {
    }

    public Teacher(String name, String ID, String pass) {
        super(name, ID, pass);
    }

    @Override
    public void work() {
        System.out.println("老师要教学");
    }
}
