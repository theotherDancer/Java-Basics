package com.Method;

public class MethodDemo2 {
    //定义一个九九乘法表的方法
    public static void chengfabiao(){
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t");

            }
            System.out.println();

        }
    }

    static void main() {
        chengfabiao();
    }
}
