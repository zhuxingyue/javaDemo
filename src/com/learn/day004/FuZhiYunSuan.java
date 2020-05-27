package com.learn.day004;

public class FuZhiYunSuan {
    /*
    =   +=  -=  *=  /=  %=
     */

    public static void main(String[] args) {
        int a = 2;
        short b = 1;

        //赋值运算自带有强制类型转换 b = b + a
        b += a;
        System.out.println(b);
        b -= a;
        System.out.println(b);
        b *= a;
        System.out.println(b);
        b /= a;
        System.out.println(b);
        b %= a;
        System.out.println(b);
    }
}
