package com.array.array;

public class Demo1 {
    static void main(String[] args) {
    //定义一个数组记录五位同学的身高
        double array[]={1.1,1.2,1.3,1.4,1.5};
        String array1[]={"zhangsan","李四"};

        System.out.println(array[1]);
        array[1]=1.12;
        System.out.println(array[1]);
        for (int i = 0; i < array.length; i++) {
            System.out.println("数组的第"+(i+1)+"个元素是"+array[i]);

        }
//快速遍历数组的方式  数组名.fori
        for (int i = 0; i < array.length; i++) {
            System.out.println("数组的第"+(i+1)+"个元素为"+array1[i]);

        }
    }


}
