package com.Interface;

public class Test {
    static void main(String[] args) {
        Fork F=new Fork("青蛙王子","绿色");
        F.eat();
        F.swim();
        System.out.println("青蛙的颜色是"+F.getColor());
    }
    //可以看出，当父类中的方法子类并不是全部都需要时候，我们可以将部分的方法转移到接口，
    //这样，需要对应方法的子类直接实现接口就可以，这样不需要对应方法的子类就不用重写方法了（毕竟在父类中的抽象类需要重写）；

}

