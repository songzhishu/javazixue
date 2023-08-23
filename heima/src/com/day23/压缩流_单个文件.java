package com.day23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class 压缩流_单个文件 {
    public static void main(String[] args) throws IOException {
        //目标文件
        File src=new File("D:\\a\\出师表正确版.txt");
        //创建压缩包位置
        File dest=new File("D:\\a");
        tozip(src,dest);

    }
    public  static void tozip(File src,File dest) throws IOException {
        //创建压缩流
        ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(new File(dest,"出师表正确版.zip")));

        //压缩流对象
        ZipEntry entry=new ZipEntry("出师表正确版3.txt");
        //zipentry对象放到压缩包中
        zos.putNextEntry(entry);

        //写入数据---先读再写
        FileInputStream fis=new FileInputStream(src);
        int a;
        while((a= fis.read())!=-1){
            zos.write(a);
        }
        fis.close();

        zos.closeEntry();
        zos.close();
    }
}
