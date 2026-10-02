package com.InnerClass;

public class Test {
    static void main(String[] args) {
        Swim swim = new Swim() {
            @Override
            public void swim() {
                System.out.println("游泳了~~");
            }
        };
        swim.swim();
        //可以看出，我们并没有去新建一个类去实现接口，而是直接在Test之中新建内部类
        //这样可以少创建一个类，如果说那个类只是使用这么一次
    }
}
