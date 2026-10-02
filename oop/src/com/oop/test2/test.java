package com.oop.test2;

public class test {
    static void main(String[] args) {
        Teacher t=new Teacher();
        t.age=24;
        t.name="xiaoai";
        System.out.println(t.age);
        System.out.println(t.name);
        t.eat();
        t.teach();
    }
}
