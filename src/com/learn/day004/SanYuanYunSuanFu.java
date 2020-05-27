package com.learn.day004;

public class SanYuanYunSuanFu {
    public static void main(String[] args) {
        //三元运算符

        int a = 10;
        int b = 20;

        int c = (a<b)? a:b;
        System.out.println(c);

        //比较两个数是否相等
        boolean d = (a==b)?true:false;
        System.out.println(d);

        //简写
        boolean m = (a==b);
        System.out.println(m);
    }
}
