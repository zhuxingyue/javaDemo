package com.learn.day006;

import java.util.Random;

public class RandomDemo {
    /*
    Random 随机数
     */
    public static void main(String[] args) {
        Random num = new Random();

        int n = num.nextInt(100);

        System.out.println(n);

    }
}
