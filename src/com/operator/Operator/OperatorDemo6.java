package com.operator.Operator;

public class OperatorDemo6
{
    static void main(String[] args) {
        //将大写英文字母转换为小写英文字母
        char a='A';
        char b=(char)(a+('a'-'A'));
        System.out.println("b的值是"+b);
        System.out.println("'A'-'a'的值是"+('A'-'a'));
    }
}
