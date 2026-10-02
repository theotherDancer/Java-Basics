package com.oop.test3;

public class Dog {
    private String name;
    private  int age;
    //get/set语句

    public void setAge(int num) {
        if(num>=0&&num<=15)
            age=num;
        else System.out.println("输入的年龄不正确");
    }

    public int getAge() {
        return age;
    }

    public void setName(String mingzi) {
        name=mingzi;
    }

    public String getName() {
        return name;
    }
    public void eat(){
        System.out.println(age+"岁的"+name+"正在吃骨头");
    }
}
