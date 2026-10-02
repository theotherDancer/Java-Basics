package com.test2;

public class bicycle extends Vehicle{
    public void ringBell(){
        System.out.println("自行车在响铃~~~~");
    }

    public bicycle() {
    }

    public bicycle(String brand, Double speed) {
        super(brand, speed);
    }

    @Override
    public void move() {
        System.out.println(getBrand()+"的自行车正在以"+getSpeed()+"的速度移动");
    }
}
