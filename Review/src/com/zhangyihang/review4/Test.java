package com.zhangyihang.review4;

public class Test {
    public static void main(String[] args) {
        System.out.println("开始");

        try {
            System.out.println("准备转换");
            int number = Integer.parseInt("abc");
            System.out.println("转换结果：" + number);
        } catch (NumberFormatException e) {
            System.out.println("转换失败：请输入整数");
        }
//·····························································
        System.out.println("结束");
        printNumber("123");
        printNumber("abc");
        printNumber("456");
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        int[] ages = {20, -1, 150, 151};
        for (int i = 0; i < ages.length; i++) {
            try {
                checkAge(ages[i]);
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }



        }
    }
    public static void printNumber(String text) {
        // 尝试转换 text，成功就打印整数
        // 捕获 NumberFormatException，打印“请输入整数”
        try{
            int number = Integer.parseInt(text);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("请输入整数");
        }

    }

    public static void checkAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("年龄必须在0～150之间");
        }
        System.out.println("年龄有效：" + age);
    }


}
