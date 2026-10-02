package com.oop.Enumtest;

public class test {

    static void main(String[] args) {
        Orderstate o1= Orderstate.PENGING_PAYMENT;
        //这里使用了自动补全，只要写出类名. 再用ctrl alt v就可以自动补全
        Orderstate processing = Orderstate.PROCESSING;
        System.out.println(o1.getName());
        Orderstate o2 = Orderstate.PENGING_PAYMENT;
        //思考：这里的o1和o2到底是什么
        System.out.println(o2.getName());
        System.out.println(Orderstate.PENGING_PAYMENT.getName());
    }
}
