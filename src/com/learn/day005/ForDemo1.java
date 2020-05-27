package com.learn.day005;

public class ForDemo1 {
    //求1到5的和
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <= 5 ; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
