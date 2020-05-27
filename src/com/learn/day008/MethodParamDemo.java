package com.learn.day008;

/*
    如果参数是基本数据类型：
        形式参数改变，不会影响实际参数的改变
 */
public class MethodParamDemo {
    public static void main(String[] args) {
        //实参
        int a = 10;
        int b = 20;

        System.out.println("a = "+a+"\tb = "+b);
        change(a,b);
        System.out.println("a = "+a+"\tb = "+b);
    }

    private static void change(int a, int b) {
        //形参
        System.out.println("a = "+a+"\tb = "+b);
        a = b;
        b = a+b;
        System.out.println("a = "+a+"\tb = "+b);
    }
}
