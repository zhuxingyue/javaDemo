package com.learn.day005;

public class DoWhileDemo {
    /*
    do{
    }while();
    语句
     */
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        do {
            sum += i;
            i++;
        }while (i<=100);
        System.out.println(sum);
    }
}
