package com.learn.day003;
/*
类型转换：
    1。作运算的时候，要求参与运算的变量类型一致

    类型转换：
        隐式转换：
            byte，short，char --> int --> long --> float --> double
        强制转换：
 */
public class TypeCastDemo {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = a + b;
        System.out.println(c);

        int m = 1;
        byte n = 2;

        //隐式转换
        int l = m + n;
        System.out.println(l);

        //强制转换
        byte ll = (byte) (m + n);
        System.out.println(ll);
    }
}
