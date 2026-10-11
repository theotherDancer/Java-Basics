package com.zhangyihang.TestLambda;

public class LambdaDemo1 {
    public static void main(String[] args) {
        /* method(new Swim() {
            @Override
            public void swimming() {
                System.out.println("正在游泳");
            }
        }); */

        //下面演示；lambda表达式
        method(() -> {
            System.out.println("正在游泳");
        });
    }

    public static void method(Swim s) {
        s.swimming();
    }
}


interface Swim {
    public abstract void swimming();
}
