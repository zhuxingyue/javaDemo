package com.learn.day002;

public class Demo009 {
    //java 中的代码快

    //静态代码块
    static {
        System.out.println("静态构造代码块运行！！");
    }


    //这种代码块没有意义执行不到
    {
        System.out.println("非静态代码块！！");
    }

    public static void main(String[] args) {
        System.out.println("Java 中的代码块");

        //非静态代码块
        {
            System.out.println("非静态代码块！！");
        }
    }
}
