package com.learn.day008;
/*
写一个方法打印水仙花数
 */
public class MethodDemo3 {
    public static void main(String[] args) {
        printLover();
    }

    private static void printLover() {
        for (int i = 100; i < 1000 ; i++) {
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/100;
            if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i)
                System.out.println(i);
        }
    }
}
