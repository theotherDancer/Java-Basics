package com.zhangyihang.search;

public class BasicSearch1 {
    static void main(String[] args) {
        // 基本查找：从0索引开始挨个往后查找
        int[] arr = {15, 15, 14, 16, 49, 65, 5};

        boolean found = basicSearch(arr, 15);
        System.out.println(found);   // true
    }

    // 参数1：数组  参数2：要查找的元素
    public static boolean basicSearch(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}