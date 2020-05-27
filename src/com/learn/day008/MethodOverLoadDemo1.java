package com.learn.day008;

/*
方法名相同参数列表不同，通过类型强转确定调用的方法
 */

public class MethodOverLoadDemo1 {
    public static void main(String[] args) {
        boolean a = compare(1,2);
        boolean b =compare((byte)1,(byte)2);
        boolean c =compare((short)1,(short) 2);
        boolean d =compare((long)1,2);

    }

    public static boolean compare(byte a, byte b) {
        return a == b;
    }

    public static boolean compare(short a, short b) {
        return a == b;
    }

    public static boolean compare(int a, int b) {
        return a == b;
    }

    public static boolean compare(long a, long b) {
        return a == b;
    }
}
