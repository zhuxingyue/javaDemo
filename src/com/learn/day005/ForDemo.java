package com.learn.day005;

public class ForDemo {
    /*
    for 循环语句：
    1.常规for
    for(int i=0;i<10;i++){
    }
    2.增强for
    for(int i : int[]){
    }
     */

    public static void main(String[] args) {
        int[] j = new int[9];

        for (int i=1;i<10;i++){
            j[i-1] = i;
            System.out.print(i);
        }

        System.out.println();
        for(int i: j){
            System.out.print(i);
        }

    }
}
