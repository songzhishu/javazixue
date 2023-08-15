package com.day23;

import java.io.*;

public class 软件运行次数 {
    public static void main(String[] args) throws IOException {
        //IO流随用随创建,不用就关


        //读
        BufferedReader br = new BufferedReader(new FileReader("f.txt"));

        //拿到数据啦
        String s = br.readLine();

        br.close();

        //转换成整数
        int anInt = Integer.parseInt(s);
        anInt++;
        if (anInt <= 3) {
            System.out.println("欢迎使用本软件,第" + anInt + "次使用");
        } else {
            System.out.println("本软件只能使用3次哦");
        }
        //将anInt写入本地文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("f.txt"));
        bw.write(Integer.toString(anInt));
        bw.close();

    }
}
