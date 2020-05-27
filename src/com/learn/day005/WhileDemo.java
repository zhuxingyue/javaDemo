package com.learn.day005;

public class WhileDemo {
    /*
    while(){
        代码
    }
     */
    public static void main(String[] args) {
        //求1-100之和
        int i = 1;
        int sum = 0;
        while (i<=100){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
