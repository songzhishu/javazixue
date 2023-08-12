package com.day18;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        //创建对象
        Map<String, String> m = new HashMap<>();
        //添加元素
        /*1,添加数据--如果建不存在,那么直接把键值对对象存入到map集合中,返回值是null
         * 如果键是存在的,那么就会把原有的键值对对象覆盖,并且返回覆盖的值*/
        System.out.println(m.put("1", "2"));
        m.put("2", "2");
        m.put("3", "2");
        m.put("4", "6");
        System.out.println(m);
        //打印集合
        System.out.println(m.put("2", "5"));//返回值是2
        System.out.println(m);

        //删除操作
        System.out.println(m.remove("2"));//返回删除的值
        System.out.println(m);

        /*//清空集合
        m.clear();
        System.out.println(m);*/

        //判断键是否存在----返回Boolean
        System.out.println(m.containsKey("3"));

        //判断值是否存在-----返回Boolean
        System.out.println(m.containsValue("6"));

        //判断集合是不是空----返回值是Boolean
        System.out.println(m.isEmpty());
        //获取键值对的个数--->int
        System.out.println(m.size());
    }

}
