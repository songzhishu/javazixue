package com.day16.find;

public class 无规律分块查找 {
    public static void main(String[] args) {
        //分类的标准就是每一块的最大值和最小值之间没有相互包含的
        //定义数组
        int[] arr = {27, 22, 30, 40, 36,
                13, 19, 16, 20,
                7, 10,
                43, 50, 48};
        int number = 20;
        //创建block数组的对象
        block2 b1 = new block2(0, 4, 40, 22);
        block2 b2 = new block2(5, 8, 20, 13);
        block2 b3 = new block2(9, 10, 10, 7);
        block2 b4 = new block2(11, 13, 40, 22);

        //创建block2数组
        block2[] block = {b1, b2, b3, b4};
        int index = findindex(arr, block, number);
        if (index == -1) {
            System.out.println("你要查找的数据不在!");
        } else {
            System.out.println(index);
        }

    }

    private static int findindex(int[] arr, block2[] block, int number) {
        //确定数据哪一块
        for (int i = 0; i < block.length; i++) {
            if ((block[i].getMin() <= number) && (number <= block[i].getMax())) {
                for (int j = block[i].getStartindex(); j <= block[i].getEndindex(); j++) {
                    if (arr[j] == number) {
                        return j;
                    }

                }
            }
        }
        return -1;
    }
}

class block2 {
    public int startindex;
    public int endindex;
    private int max;
    private int min;

    public block2(int startindex, int endindex, int max, int min) {
        this.startindex = startindex;
        this.endindex = endindex;
        this.max = max;
        this.min = min;
    }

    public int getStartindex() {
        return startindex;
    }

    public void setStartindex(int startindex) {
        this.startindex = startindex;
    }

    public int getEndindex() {
        return endindex;
    }

    public void setEndindex(int endindex) {
        this.endindex = endindex;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public block2() {
    }
}