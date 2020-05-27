package com.learn.day004;

public class BiaoDaShiDemo1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + b);

        char c = 'a';
        System.out.println(a + c);//字符参与运算，是按照acss码运算

        String d = "hello";
        System.out.println(a + d);

        //运算方式是从左到右的，字符串在前在后结果不同
        System.out.println(a+b+d);
        System.out.println(d+a+b);
    }
}
