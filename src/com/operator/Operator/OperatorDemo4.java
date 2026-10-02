package com.operator.Operator;

public class OperatorDemo4 {
    static void main(String[] args) {
        //关于；类型转换，当遇到byte，short类型的变量，java会自动将其转换为int类型
        //这是为了方便进行算术运算
        //例如，byte a=10;
        //int b=a+10;
        //b的值是20，而不是10
        byte a=10;
        byte b=10;
        System.out.println("a+b的值是"+(a+b));
    }
}
