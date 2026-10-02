package com.oop.Enumtest;

/*public class Orderstate {
    private  String name;

    public Orderstate() {
    }

    public Orderstate(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}*/

public enum Orderstate {
    //枚举的第一行要写这个类所有的有限对象

    PENGING_PAYMENT("待支付"),PROCESSING("处理中");

    private  String name;


    //灰色字体在idea中表示可以不写
    //即：private可以不写，虚拟机可以自动帮我们加上
    private Orderstate(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



}
