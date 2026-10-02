package com.oop.test5;

public class student {

    private int age;
    private String name;
    private int height;
    //构造方法
    public student(int age,String name,int height){
        this.age=age;
        this.name=name;
        this.height=height;
    //以上是初始化的过程，但是以后可能还需要修改，因此：
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
