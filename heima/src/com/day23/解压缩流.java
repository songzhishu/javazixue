package com.day23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class 解压缩流 {
    public static void main(String[] args) throws IOException {
        //解压缩流,解压 一般就是读出来数据属于输出流
        /*压缩包里的每一个对象其实是一个Zipentry对象,解压的本质是将每一个ZipEntry按照层级拷贝到本地的另一个文件夹中*/
        //压缩流,压缩 一般是将数据压缩到本地属于输入流

        //创建对象file表示要解压的压缩包
        File src=new File("D:\\a\\b\\c\\d\\e\\f\\g\\h\\c.zip");
        //创建要解压的目录
        File dest=new File("D:\\c");
        upzip(src,dest);

    }
    public static void upzip(File src,File dest) throws IOException {
        //创建一个压缩流来读取压缩包里面的数据
        ZipInputStream zip=new ZipInputStream(new FileInputStream(src));
        /*//获取zip流里面的每一个对象
        ZipEntry entry = zip.getNextEntry();
        System.out.println(entry);
        //我们发现运行一次就会出现一个文件对象,当运行完的时候会返回null*/

        //定义一个ZipEntry的对象
        ZipEntry entry;
        while ((entry=zip.getNextEntry())!=null){
            //得到对象
            //判断对象是什么
            if(entry.isDirectory()){
                //是文件夹--我们就创建文件夹呀entry是ZipEntry对象,所以我们要强制转换
                File file= new File(dest,entry.toString());
                file.mkdirs();
            }else{
                //是文件.那么就要写入这个文件到目标文文件---字节输出流
                FileOutputStream fos=new FileOutputStream(new File(dest,entry.toString()));
                //读取
                int b;
                while((b= zip.read())!=-1){
                    //写入
                    fos.write(b);
                }
                //写一个关一个
                fos.close();
                zip.closeEntry();
                //表示处理完一个对象--返回循环处理下一个
            }
        }
        //循环结束表示这个zip的压缩包处理完毕
        //关闭解压流
        zip.close();


    }
}
