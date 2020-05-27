package com.learn.day007;

public class ArrayDemo4 {
    /*
    求数组最大值：
     */
    public static void main(String[] args) {
        int[] arr = {1,5,9,4,3};

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
                max = arr[i];
        }

        System.out.println(max);
    }
}
