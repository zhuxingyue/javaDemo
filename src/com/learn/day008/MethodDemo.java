package com.learn.day008;

import javax.swing.*;

public class MethodDemo {
    /*
    方法：完成特定功能的代码块

    方法格式：
        修饰符：    public  static
        返回值类型
        方法名
        参数类型
        参数名称
        方法体
        return  结束方法并返回方法的返回值

      定义方法：
        明确方法返回值
        明确方法参数列表
     */
    public static void main(String[] args) {
        int a = sum(1,4);
        System.out.println(a);
    }

    public static int sum(int a,int b){
        return a+b;
    }
}
