package com.day20;

import java.util.*;
import java.util.stream.Collectors;

public class stream流 {
    public static void main(String[] args) {
        //单列集合----获取Stream流
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        list.add("eee");
        list.add("aeee");
        list.add("eeeee");
        list.add("ceee");
        list.add("fff");
        /* *//* //获取stream流
        Stream<String> stream = list.stream();
        //遍历
        stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*//*

        //结合Lambda简化
        list.stream().forEach(s -> System.out.println(s));
        System.out.println("-------------------------------");



        //双列集合
        HashMap<String ,Integer> hm =new HashMap<>();
        //添加数据
        hm.put("zhangsan",11);
        hm.put("lisi",12);
        hm.put("wangwu",13);
        hm.put("zhaoliu",14);

        //注意由于双列集合无法直接使用stream流

        //方式一:  keySet
        hm.keySet().stream().forEach(s -> System.out.println(s));
        System.out.println("-------------------------------");

        //第二种方式 eentrySet()
        hm.entrySet().stream().forEach( s -> System.out.println(s));
        System.out.println("-------------------------------");



        //数组获取Strame流
        //基本数据类型
        int [] arr={1,2,3,4,5,6,7,8,9};
        //引用数据类型
        String [] arr2={"a","b","c","d","e","f","g"};
        //获取stream流
        Arrays.stream(arr).forEach(s-> System.out.println(s));
        System.out.println("-------------------------------");
        Arrays.stream(arr2).forEach(s-> System.out.println(s));



        System.out.println("-------------------------------");
        //一堆零散的数据--------->数据的类型一致
        Stream.of("aaaa","sdad","你好").forEach( s-> System.out.println(s));*/
        /*//其他方法
        //filter  过滤数据
        list.stream().filter(s -> s.startsWith("a")).filter(s -> s.length()>3).forEach(s -> System.out.println(s));


        System.out.println("----------------------------------");

        //修改流中的数不会影响原来的数据

        //获取前几个
        list.stream().limit(3).forEach(s -> System.out.println(s));//获取三个

        System.out.println("----------------------------------");


        //skip  跳过元素
        list.stream().skip(4).forEach(s -> System.out.println(s));//跳过前四个

        System.out.println("----------------------------------");

        //小综合
        list.stream().skip(5).limit(3).forEach(s -> System.out.println(s));

        System.out.println("----------------------------------");
        //去重--如果是自定义的数据类型要重写equals方法
        list.stream().distinct().forEach(s -> System.out.println(s));*/

        /*//终结操作

        //遍历---------------后面不可以再调用其他操作
        list.stream().forEach(s -> System.out.println(s));

        //统计
        System.out.println(list.stream().count());

        //toArray-----将流里面的数据收集起来存入数组
        Object[] array = list.stream().toArray();//调用空参
        System.out.println(array.toString());

        //指定参数
        String[] array1 = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(array1));

        //lambda表达式
        Object[] objects = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(objects));*/

        //collect   收集到list set map集合中   键是不可以重复
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "张无忌-男-15", "周芷若-女-14", "赵敏-女-13", "张强-男-20", "张三封-男-100", "张存善-男-40", "张良-男-35",
                "王二麻子-男-37", "谢广坤-男-41");


        //过滤数据  --list
        List<String> newlist = list2.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toList());
        System.out.println(newlist);

        //set去重
        Set<String> newlist1 = list2.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toSet());
        System.out.println(newlist1);


        /*//map 规定键和值 键姓名 值年龄
        Map<String, Integer> collect = list2.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toMap(new Function<String, String>() {

                                                                                                                            @Override
                                                                                                                            public String apply(String s) {
                                                                                                                                return s.split("-")[0];
                                                                                                                            }
                                                                                                                        },
                new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }
        ));
        System.out.println(collect);*/


        Map<String, Integer> collect = list2.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toMap(
                s -> s.split("-")[0],
                s -> Integer.parseInt(s.split("-")[2])));
        System.out.println(collect);
    }
}
