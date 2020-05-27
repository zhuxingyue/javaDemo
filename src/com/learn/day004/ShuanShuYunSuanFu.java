package com.learn.day004;

public class ShuanShuYunSuanFu {
    public static void main(String[] args) {
        /*
        ++ , --
        运算符
         */

        int a = 10;
        int b = 10;

        a++;
        ++b;
        System.out.println(a);
        System.out.println(b);

        int c;
        c = a++;
        System.out.println(c);
        c = ++b;
        System.out.println(c);
    }
}
