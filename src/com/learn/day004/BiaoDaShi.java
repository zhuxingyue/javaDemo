package com.learn.day004;
/*
表达式：
    运算符连接的常量或变量称为表达式
    运算符：
        算数运算符：
        赋值运算符：
        关系运算符：
        逻辑运算符：
        三元运算符：

        算术运算符：
            + - * / % ++ --

        赋值运算符：
            =，+=,-=,*=,/=,%=

        关系运算符：
            ==  >=  >   <   <=  !=

        逻辑运算符：
            &   ｜   ^   !   &&  ｜｜

        三元运算符：
            a>b？ a：b
 */
public class BiaoDaShi {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        System.out.println(a - b);
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a / (float)b);//两个整数相除结果还是整数，要获取小数必须要有浮点数参与运算
        System.out.println(a % b);
    }
}
