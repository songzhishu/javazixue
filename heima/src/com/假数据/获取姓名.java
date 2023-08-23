package com.假数据;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 获取姓名 {
    public static void main(String[] args) throws IOException {
        //姓氏:https://hanyu.baidu.com/shici/detail?from=aladdin&pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&showPinyin=1
        //男;http://www.haoming8.cn/baobao/10881.html
        //女:http://www.haoming8.cn/baobao/7641.html

        //定义变量记录网址
        String XingNet = "https://hanyu.baidu.com/shici/detail?from=aladdin&pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&showPinyin=1";
        String nanmingNet = "http://www.haoming8.cn/baobao/10881.html";
        String nvmingNet = "http://www.haoming8.cn/baobao/7641.html";


        //爬取数据所有数据拼成字符串----然后正则表达式切割
        String Xingstr = reptiles(XingNet);
        String nanmingstr = reptiles(nanmingNet);
        String nvmingstr = reptiles(nvmingNet);
        //System.out.println(nvmingstr);

        ArrayList<String> Xingdata = getData(Xingstr, "(.{4})(，|。)", 1);
        ArrayList<String> nanmingdata = getData(nanmingstr, "([\\u4E00-\\u9FA5]{2})(、|。)", 1);
        //System.out.println(nanmingdata);
        ArrayList<String> nvmingdata = getData(nvmingstr, "(.. ){4}..",0);
        //System.out.println(nvmingdata);
        //复制弯腰看看代码真服了！改了半天的正则表达式

        //处理数据
        //姓氏
        ArrayList<String> Xinglist=new ArrayList<>();
        for (String str : Xingdata) {
            //赵钱孙李 切割
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                Xinglist.add(c+"");
            }
        }
        //System.out.println(Xinglist);

        //男名去重
        ArrayList<String> nanlist=new ArrayList<>();
        for (String nanmingdatum : nanmingdata) {
           if(!(nanlist.contains(nanmingdatum))){
               nanlist.add(nanmingdatum);
           }
        }
        //System.out.println(nanlist);


        //女名字---彤舞 芊静 艾丝 惠蕙 语月---用空格切割
        ArrayList<String> nvlist=new ArrayList<>();

        for (String nvmingdatum : nvmingdata) {
            //切割每一个元素
            String[] strings = nvmingdatum.split(" ");
            for (String s : strings) {
                nvlist.add(s);
            }
        }
        //System.out.println(nvlist);


        //生成数据(姓名(唯一)-性别-年龄)
        ArrayList<String> list = getInfos(Xinglist, nanlist, nvlist, 50, 50);
        //System.out.println(list);


        //写出数据--写到本地文件  字符缓冲流
        BufferedWriter bw=new BufferedWriter(new FileWriter("假数据姓名.txt"));
        for (String s : list) {
            //写入
            bw.write(s);
            //换行
            bw.newLine();
        }
        bw.close();


    }

    public  static  ArrayList<String> getInfos(ArrayList<String> X,ArrayList<String> Y,ArrayList<String> G,int boynum,int girlnum){
        //生成不重复的男名字
        HashSet<String> boy=new HashSet<>();
        while (true){
            if (boy.size()==boynum){
                //表示现在生成的名字已经够啦!
                break;
            }
            //随机-----随机数  Collections打乱
            Collections.shuffle(X);
            Collections.shuffle(Y);
            //运行一次打乱一次,每次都抽第一个应该也是乱的吧
            boy.add(X.get(0)+Y.get(0));
        }
        //System.out.println(boy);
        //生成不重复的男名字
        HashSet<String> girl=new HashSet<>();
        while (true){
            if (girl.size()==girlnum){
                //表示现在生成的名字已经够啦!
                break;
            }
            //随机-----随机数  Collections打乱
            Collections.shuffle(X);
            Collections.shuffle(G);
            //运行一次打乱一次,每次都抽第一个应该也是乱的吧
            girl.add(X.get(0)+G.get(0));
        }
        //System.out.println(girl);

        /* 张三-男-23
            18------50
        * -18     0-32
        * 33       18*/

        ArrayList<String> list=new ArrayList<>();
        Random r=new Random();
        for (String s : boy) {
            int age = r.nextInt(33) + 18;
            list.add(s+"-男-"+age);

        }
        for (String s : girl) {
            int age = r.nextInt(18) + 18;
            list.add(s+"-女-"+age);

        }


        return list;
    }

    //正则表达式--存储
    private static ArrayList<String> getData(String str, String regex,int num) {
        //创建集合
        ArrayList<String> list =new ArrayList<>();

        //创建正则表达式对象调用规则
        Pattern pattern = Pattern.compile(regex);
        //按照规则去切割数据
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            String group = matcher.group(num);
            list.add(group);

        }
        return list;
    }

    //爬取
    public static String reptiles(String net) throws IOException {
        //存储数据的容器
        StringBuilder sb = new StringBuilder();
        URL url = new URL(net);
        //连接网址
        URLConnection urlConnection = url.openConnection();
        //读取  io流
        InputStream inputStream = urlConnection.getInputStream();//这他妈是字节流读中文报错乱码,所以转换流
        InputStreamReader isr = new InputStreamReader(inputStream);//嘿嘿嘿转成字符流就可以正常读

        int a;
        while ((a = isr.read()) != -1) {
            sb.append((char) a);
        }
        isr.close();
        return sb.toString();


    }

}
