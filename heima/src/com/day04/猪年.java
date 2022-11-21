package com.day04;
/*已知2019年是猪年，请在控制台输出从1949年到2019年中所有是猪年的年份。*/
public class 猪年 {
    public static void main(String[] args) {
        int star =2019,end=1949;
        while (star>1949){
            star=star-12;
            System.out.println("猪年:"+star);
        }
    }
}
