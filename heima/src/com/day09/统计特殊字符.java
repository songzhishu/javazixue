package com.day09;

public class 统计特殊字符 {
    public static void main(String[] args) {
        String str = "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的";
        String tar = "Java";
        // 调用方法并输出
        System.out.println(search(str, tar));

    }

    // 返回值int表示次数，参数列表str表示在哪个字符串中查找，tar表示要查找的目标子串
    public static int search(String str, String tar) {
        // 定义统计变量表示次数
        int count = 0;
        // 定义索引变量，表示每次找到子串出现的索引
        int index = -1;
        // 定义循环，判断条件为在字符串中找到了目标子串
        while ((index = str.indexOf(tar)) != -1) { // 将找到的索引赋值给变量并判断
            // 次数累加
            count++;
            // 把查找过的部分剪切掉，从找到的索引+子串长度的位置开始截取。
            str = str.substring(index + tar.length());
        }
        return count;

    }
}
