package com.day16.find;

public class 分块查找 {
    public static void main(String[] args) {
        /*分块的依据1:前一块中最大数据,小于后一块的中的所有数据
         * 2块数数量一般等于数字的个数开根号,比如16个数字一般分四块*/
        //定义数组
        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};
        System.out.println(arr.length);


        //遍历数组

        block b1 = new block(21, 0, 5);
        block b2 = new block(45, 6, 11);
        block b3 = new block(73, 12, 15);

        //存入对象//存储数据
        block[] block = {b1, b2, b3};

        //定义查找的数值
        int number = 30;

        int index = getindex(arr, block, number);
        System.out.println(index);

    }

    private static int getindex(int[] arr, block[] block, int number) {
        if (findbolckindex(block, number) == -1) {
            System.out.println("你要查找的数据不存在!");
            return -1;
        } else {
            int k = findbolckindex(block, number);
            //获取起始和结束的索引
            int endindex = block[k].getEndindex();
            int startindex = block[k].getStartindex();
            //遍历数组
            for (int i = startindex; i <= endindex; i++) {
                if (arr[i] == number) {
                    return i;
                }
            }

        }
        return -1;
    }

    //确定number在哪一块
    public static int findbolckindex(block[] blocks, int number) {
        //遍历block
        for (int i = 0; i < blocks.length; i++) {
            if (number <= blocks[i].getMax()) {
                return i;
            }
        }
        return -1;
    }

}

class block {
    public int startindex;
    public int endindex;
    private int max;

    public block() {
    }

    public block(int max, int startindex, int endindex) {
        this.max = max;
        this.startindex = startindex;
        this.endindex = endindex;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
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
}
