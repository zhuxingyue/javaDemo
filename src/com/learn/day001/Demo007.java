package com.learn.day001;

import java.util.HashMap;

public class Demo007 {
    /*
    java 中的字典是集合类型的数据结构collection
     */
    public static void main(String[] args) {
        //Java中的字典：集合
        //Map集合

        HashMap<String,String> dic = new HashMap<>();
        dic.put("name","zhang");
        dic.put("age","20");

        System.out.println(dic.get("age"));

    }

}
