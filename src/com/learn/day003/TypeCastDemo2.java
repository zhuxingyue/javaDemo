package com.learn.day003;

/*
数据做运算，是什么类型就用什么类型来接受数据，不建议强制转换容易损失精度
 */
public class TypeCastDemo2 {
    public static void main(String[] args) {
        int a = 10;
        byte b = 20;

        //强制转换
        byte c = (byte) (a + b);
        System.out.println(c);

    }
}
