package com.day17;

import java.util.LinkedList;

public class LinkeList_test {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        //添加
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        linkedList.add("5");
        linkedList.add("6");

        /*addFirst(E e)--------->在列表的开头插入指定元素
         * addLast(E e)---------->在列表的末尾插入指定元素
         * getFirst()------------>返回列表的第一个元素
         * getLast()------------->返回列表的的最后一个元素
         * removeFirst()--------->删除并返回第一个元素
         *removeLast()----------->删除并返回最后一个元素*/

        linkedList.addFirst("0");
        linkedList.addLast("7");
        System.out.println(linkedList);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);
    }
}


