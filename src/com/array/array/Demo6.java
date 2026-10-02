package com.array.array;

public class Demo6 {
    static void main(String[] args) {
        //快慢指针
        //快慢指针：用于在单调数组之中，去除重复元素
        //定义快慢指针：快指针默认索引1，慢指针默认索引0；
        //将快指针向前移动，当快慢指针所指相等，舍弃快指针所指，并继续向前移动；
        // 并且循环结束的标志是快指针移动到最后一位
        //当快慢指针所指不同，将快指针所指存入慢指针的索引之地；
        //最后遍历输出，以慢指针为边界
        int arr[]={1,1,2,2,3,3,3,4,5};
        int slow=0;
        int fast=1;
        while(fast< arr.length){
            if(arr[fast]!=arr[slow]){
                slow++;
                arr[slow]=arr[fast];
            }
            fast++;
        }
        for (int i = 0; i <=slow; i++) {
            System.out.print(arr[i]+" ");


        }
    }
}
