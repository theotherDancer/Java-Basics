package com.oop.toolclasstest;

public class Test {
    static void main(String[] args) {
       int array[]={10,20,30,40,50};
        //接下来进行遍历
        //注意使用工具包需要带上自变量
        Arrayutil.printarray(array);
        System.out.println(Arrayutil.avg(array));
    }
}
