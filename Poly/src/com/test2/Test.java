package com.test2;

public class Test {
    static void main(String[] args) {
        person p=new person("张三","男",19);
        bicycle b=new bicycle("神秘",200.0);
        car c=new car("劳斯莱斯",999.0);
        p.drive(c);
    }
}
