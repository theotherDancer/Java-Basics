package com.test2;

public class car extends Vehicle{
    public void honk(){
        System.out.println("汽车在鸣笛");
    }

    @Override
    public void move() {
        System.out.println(getBrand()+"的汽车正在以"+getSpeed()+"的速度移动");
    }

    public car() {
    }

    public car(String brand, Double speed) {
        super(brand, speed);
    }
}
