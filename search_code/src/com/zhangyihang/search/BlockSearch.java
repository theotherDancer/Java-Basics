package com.zhangyihang.search;
//以下演示 分块查找 的拓展版本
//PS:这期纯手搓，加AI修改，完成度非常高了
public class BlockSearch {
    static void main(String[] args) {
        int[] arr = {27, 22, 30, 40, 36, 13, 19, 16, 20, 7, 10, 43, 50, 48};
        //我们可以把数据分成四块：
        //27···36   13···20   7···10   43···48

        //1.分组：创建block的对象
        block b1 = new block(22, 40, 0, 4);
        block b2 = new block(13, 20, 5, 8);
        block b3 = new block(7, 10, 9, 10);
        block b4 = new block(43, 50, 11, 13);
        //2.将小组存放到数组中：创建数组用来存放四块的对象（即索引表）
        block[] blockArr = {b1, b2, b3, b4};
        //3.定义一个变量记录要查找的元素：
        int number = 27;
        //4.调用方法，传递索引表，数组，要查找的元素
        int index = getIndex(blockArr, arr, number);
    }

    //定义一个方法：用来查找元素在哪一个块中,直接返回那一块
    public static block findBlock(block[] blockArr, int number) {
        for (int i = 0; i < blockArr.length; i++) {
            if (number >= blockArr[i].getMin() && number <= blockArr[i].getMax())
                return blockArr[i];
        }
        return null;
    }

    //定义一个方法，在返回的块中进行遍历，看看能否找到我们需要的元素
    public static int getIndex(block[] blockArr, int[] arr, int number) {
        block b = findBlock(blockArr, number);
        if (b == null) {
            System.out.println("这里并没有你要查找的元素");
            return -1;
        } else {
            for (int i = b.getStartIndex(); i <= b.getEndIndex(); i++) {
                if (number == arr[i]) {
                    System.out.println("您查找的元素在索引" + i);
                    return i;
                }
            }
            System.out.println("这里没有你要查找的元素");
            return -1;
        }
    }


}
    class block{
    private int min;
    private int max;
    private int startIndex;

    public block() {
    }

    private int endIndex;

    public block(int min, int max, int startIndex, int endIndex) {
        this.min = min;
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}
