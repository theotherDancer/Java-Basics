package com.oop.finaltest;



public class Circle {
    private double radii;
    private final double PI=3.14;
    //构造方法

    public Circle() {
    }

    public Circle(double radii) {
        this.radii = radii;
    }
    //GEt/SET

    public double getRadii() {
        return radii;
    }

    public void setRadii(double radii) {
        this.radii = radii;
    }


    //行为
    //计算圆的面积
    public double getArea(){
        return PI*radii*radii;
    }
    public double getLength(){
        return 2*PI*radii;
    }

}
