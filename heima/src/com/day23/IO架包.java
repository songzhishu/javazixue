package com.day23;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class IO架包 {
    public static void main(String[] args) throws IOException {
        //复制文件
        File src=new File("b.txt");
        File dest=new File("copy.txt");
        FileUtils.copyFile(src,dest);


        //复制文件夹
        File src1=new File("D:\\a\\b\\c\\d\\e\\f");
        File dest1=new File("D:\\c");
        //FileUtils.copyDirectory(src1,dest1);
        //这个是copy文件夹到指定目录(当文件夹的所有内容不包括当前文件夹)
        //FileUtils.copyToDirectory(src1,dest1);
        //这个是copy文件夹到指定目录(当文件夹的所有内容包括当前文件夹)

        //删除

    }
}
