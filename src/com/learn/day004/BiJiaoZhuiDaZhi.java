package com.learn.day004;

public class BiJiaoZhuiDaZhi {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        //获取3个数的最大值
        int f = (a>b)?a:b;
        int max = (f>c)?f:c;

        System.out.println(max);
    }
}
