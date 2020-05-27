package com.learn.day008;
/*
方法重栽：
    方法名相同，参数列表不同，与返回值无关
 */
public class MethodOverLoadDemo {
    public static void main(String[] args) {
        int result = sum(1,5);
        System.out.println(result);

        result = sum(1,3,6);
        System.out.println(result);
    }

    private static int sum(int i, int i1, int i2) {
        return i+i1+i2;
    }

    private static int sum(int i, int i1) {
        return i+i1;
    }
}
