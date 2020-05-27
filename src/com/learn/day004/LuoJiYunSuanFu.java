package com.learn.day004;

public class LuoJiYunSuanFu {
    public static void main(String[] args) {
        // &    |   !   ^   &&  ||
        //逻辑运算结果同样只有两个true，false；它是连接两个关系表达式的符号
        //&& 有断路效果，& 没有

        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println((a>b) ^ (b>c));//false ^ false
        System.out.println((a<b) ^ (b<c));//true ^ true
        System.out.println((a>b) ^ (b<c));//false ^ true
        System.out.println((a<b) ^ (b>c));//true ^ false

    }
}
