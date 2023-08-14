package com.day22;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

public class 文件练习 {
    public static void main(String[] args) throws IOException {
        /*//对文件进行判断
        File f1=new File("D:\\a\\b\\a.txt");
        System.out.println(f1.isDirectory());//判断是不是文件夹
        System.out.println(f1.isFile());//判断是不是文件
        System.out.println(f1.exists());//判断文件是不是存在
        System.out.println("----------------------------------");


        //对文件夹进行判断
        File f2=new File("D:\\a\\b\\e");
        System.out.println(f2.isDirectory());//判断是不是文件夹
        System.out.println(f2.isFile());//判断是不是文件
        System.out.println(f2.exists());//判断文件是不是存在
        System.out.println("----------------------------------");

        //对于不存在的路径进行判断
        File f3=new File("D:\\a\\b\\e\\f.txt");
        System.out.println(f3.isDirectory());//判断是不是文件夹
        System.out.println(f3.isFile());//判断是不是文件
        System.out.println(f3.exists());//判断文件是不是存在
        System.out.println("----------------------------------");*/



        /*//获取
        //length     返回文件的大小(字节数量)
        File f1=new File("D:\\a\\b\\a.txt");
        System.out.println(f1.length());
        //文件夹调用的时候会返回一个0(只能获取文件的大小)

        //getAbsolutePath   获取文件的绝对路径
        File f2 =new File("ab.txt");
        System.out.println(f2.getAbsolutePath());

        //getpath 返回文件在定义的时候的路径
        File f3 =new File("ab.txt");
        System.out.println(f3.getPath());//相对路径

        //getname  获取名字   如果是文件夹那么返回的就是文件夹的名字
        File f4=new File("D:\\a\\b\\抖音.mp4");
        System.out.println(f4.getName());

        //lastModified()获取文件的最后修改事件
        File f5=new File("D:\\a\\b\\a.txt");
        System.out.println(f4.lastModified());*/

        //创建

        //创建文件
        //File f1=new File("D:\\a\\b\\c.txt");
        //System.out.println(f1.createNewFile());//返回值boolean
        //这时候已经有c.txt,我们在运行一下就会返回false,
        //如果我们指定的文件夹是不存在的会报异常的

        //File f2=new File("D:\\a\\b\\cd");
        //这时候我们没有指定文件的后缀名,那么这时候会不会出错呐,是创建文件还是文件夹啊
        //System.out.println(f2.createNewFile());
        //运行以后发现返回值是true,也就是创建成功只不过文件没有后缀名,但是还是文件滴!


      /*  //mkdir 目录就是文件夹----只能创建单个目录
        File f3=new File("D:\\a\\b\\e\\f");
        System.out.println(f3.mkdir());

        //mkdirs 创建文件夹多级文件夹----也可以创建单级
        File f4=new File("D:\\a\\b\\e\\f\\g\\h\\i\\j");
        System.out.println(f4.mkdirs());*/


       /* //删除 ---直接删除不会将删除的文件放入回收站
        File f1=new File("D:\\a\\b\\cd");
        System.out.println(f1.delete());
        //删除文件夹,如果是空的直接就可直接删除,如果不是空的是删除失败!*/


        /*//获取并遍历 listfiles获取文件夹的所有内容并且放在一个数组中返回(显示路径)
        File f1=new File("D:\\a");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);

        }*/
        /*当路径不存在的时候，返回null
         * 当路径是一个文件的是时候返回null
         * 当路经是一个空的文件夹的时候，返回一个长度为0的数组
         * 当路径正确并且是一个有内容的文件夹的时候才会将文件夹中的文件和文件夹的路径放在File数组中*/

       /* //listRoots 获取系统中所有的盘符
        File []arr= File.listRoots();
        System.out.println(Arrays.toString(arr));

        //list 获取当前路径下的所有内容（显示名字）
        File f1=new File("D:\\a");
        String[] list = f1.list();
        for (String s : list) {
            System.out.println(s);
        }*/

        //list(FilenameFilter,filer) 利用文件名过滤器获取当前该路径下的所有内容
        File f2 = new File("D:\\a\\b");
        String[] list1 = f2.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                //路径和文件名拼接
                File src = new File(dir, name);
                //判断是不是文件并且是不是以".txt"结尾的
                /*if (src.isFile()&&name.endsWith(".txt"))
                {
                    return true;
                }else {
                    return false;
                }*/
                return src.isFile() && name.endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(list1));


    }
}
