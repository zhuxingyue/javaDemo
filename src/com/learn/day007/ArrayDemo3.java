package com.learn.day007;

public class ArrayDemo3 {
    //数组常见的异常：
//        ArrayIndexOutOfBoundsException ：数组长度越界
//        NullPointException: 空指针
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(arr[2]);

        int[] arr1 = {1,2};
        arr1 = null;
        System.out.println(arr1[0]);
    }


}
