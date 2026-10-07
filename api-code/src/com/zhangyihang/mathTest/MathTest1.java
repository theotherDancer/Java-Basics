package com.zhangyihang.mathTest;

public class MathTest1 {
    static void main(String[] args) {
        //不能创建Math类的对象，Math类是静态的
        //用abs获取参数绝对值
        Double num1=-10.1;
        System.out.println(Math.abs(num1));
        //ceil向上取整（进一法）
        Double num2=5.2;
        System.out.println(Math.ceil(num2));
        //floor向下取整
        System.out.println(Math.floor(num2));
        //round四舍五入：规则返回与参数最接近的整数，如果有多个，则返回正无穷大的方向，eg：-10.5，则返回-10
        System.out.println(Math.round(num2));
        //pow返回a的b次幂的值
        System.out.println(Math.pow(2,100));
        //平方根
        System.out.println(Math.sqrt(4));
        //立方根
        System.out.println(Math.cbrt(27));
        //random获取一个【0,1）的随机数
        System.out.println(Math.random());
    }
}
