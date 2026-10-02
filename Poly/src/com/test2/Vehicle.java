package com.test2;

public class Vehicle {
    private String brand;
    private Double speed;

    public Vehicle() {
    }

    public Vehicle(String brand, Double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public void move(){
        //什么牌子的交通工具在行驶
        System.out.println(brand+"品牌的交通工具在行驶~~~");

    }
}
