package com.OopExtendTest1;

public class Teacher extends Person {
    //特有的内容
    String subject;
    //特有的行为：教学
    public void teach(){
        System.out.println("老师在教书");
    }

}
