package com.day18;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        //创建集合
        HashMap<Student, String> hm = new HashMap<>();

        //创建学生对象
        Student s1 = new Student("zhangsan", 20);
        Student s2 = new Student("lisi", 21);
        Student s3 = new Student("wangwu", 22);
        Student s4 = new Student("zhaoliu", 23);
        Student s5 = new Student("zhaoliu", 23);


        //添加元素
        hm.put(s1, "江苏");
        hm.put(s2, "上海");
        hm.put(s3, "南京");
        hm.put(s4, "杭州");
        hm.put(s5, "郑州");

        //遍历

        /*//键找值
        Set<Student> keys = hm.keySet();

        //遍历set集合
        for (Student key : keys) {
            System.out.println(key+" "+hm.get(key));
        }
*/

        /*//键值对
        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }*/

        hm.forEach((student, s) -> System.out.println(student + " " + s));


    }
}
