package com.zhangyihang.mysort;

public class a03_InsertSort {
    static void main(String[] args) {
        //下面演示插入排序
        int[] arr = {6, 15, 12, 45, 14, 21, 12, 89};
        //1.首先找出数组开始无序的索引,打印出第一个要插入的索引
        int StartIndex = -1;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println(i + 1+"\n");
                StartIndex = i + 1;
                break;
            }
        }
        //2.外循环：插入的索引
        for (int i = StartIndex; i < arr.length; i++) {
            int j=i;//设计第二个变量是因为需要不断修改j，这样可以隔绝内外循环变量的相互影响
            //3.内循环 ：找到插入的地方并进行交换
            while(j>0&&(arr[j]<arr[j-1])){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;//由于前面的数据都是有序的，所以只要碰壁一次，目前就都有序了
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }


}
