package com.StringTest3;

public class Arrayutil {
    private Arrayutil() {
    }
//设计一个方法，将一个int数组中的所有元素拼接成为一个字符串
    public static String arrayToString(int[] arr) {
        String str = "[";

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                str += (arr[i] + ",");
            } else {
                str += (arr[i] + "]");
            }
        }
        return str;
    }
}
