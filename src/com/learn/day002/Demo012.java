package com.learn.day002;

import java.util.*;

public class Demo012 {
    /*
    java 中的集合框架：
        collection：list ， set ， Map

        list中实现类：ArrayList，LinkedList，vector
        set中实现类：HashSet，TreeSet
        Map中的实现类：HashMap，TreeMap

     */

    public static void main(String[] args) {
        arraylist();
        linkedList();
        vector();
        hashSet();
        treeSet();
        hashMap();
        treeMap();

    }

    private static void treeMap() {
        TreeMap<String,String> treemap = new TreeMap<>();
        treemap.put("姓名：","张三");
        treemap.put("年龄：","29");
        System.out.println(treemap.get("姓名："));
    }

    private static void hashMap() {
        HashMap<String,String> hashmap = new HashMap<>();
        hashmap.put("电影","《夏洛特烦恼》");
        hashmap.put("时间","2017年");
        System.out.println(hashmap.get("电影"));
    }

    private static void treeSet() {
        TreeSet<String> treeset = new TreeSet<>();
        treeset.add("旅游");
        treeset.add("景区");
        System.out.println(treeset.first());
    }

    private static void hashSet() {
        HashSet<String> hashset = new HashSet<>();
        hashset.add("朋友");
        hashset.add("家人");
        System.out.println(hashset.toArray()[0]);
    }

    private static void vector() {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        System.out.println(vector.get(0));
    }

    private static void linkedList() {
        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(0,7);
        linkedlist.add(1,9);
        System.out.println(linkedlist.get(1));
    }

    private static void arraylist() {
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(2);
        arraylist.add(4);
        System.out.println(arraylist.get(1));
    }


}
