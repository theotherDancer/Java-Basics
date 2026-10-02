package com.operator.Operator;

public class OperatorDemo5
{
    static void main(String[] args) {
        //关于数据类型的强制转换
        //强制转换是指将一个数据类型转换为另一个数据类型
        //例如，将int类型转换为byte类型
        //byte a=(byte)10;
        //a的值是10，而不是255
        int a=10;
        byte b=(byte)a;
        System.out.println("b的值是"+b);

        byte c=100;
        short d=200;
        double e=300.0;
        double result=c+d+e;
        System.out.println("result的值是"+result);
        //说说在这个过程中数据类型的转换
        //对于byte，short，先转换为int类型，再进行算术运算
        //由于有Double类型，所以int需要做强制转换成Double类型，再进行算术运算
    }
}
