package com.Interface;

public class Fork extends Animal implements swim {
    @Override
    public void eat() {
        System.out.println("青蛙吃虫子~~~");
    }

    @Override
    public void swim() {
        System.out.println("青蛙在蛙泳~~~");
    }

    public Fork(String name, String color) {
        super(name, color);
    }

    public Fork() {
    }
}
