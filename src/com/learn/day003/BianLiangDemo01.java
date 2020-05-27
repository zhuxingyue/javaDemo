package com.learn.day003;

/*
变量：
    使用前必须赋值：
    变量只能在所属区域内有效
    一行可以定义多个变量
 */
public class BianLiangDemo01 {

    public static void main(String[] args) {
        int c = 10;
        System.out.println(c);

        //代码块
        {
            int b = 10;
            System.out.println(b);
        }

        //一行上可以定义多个变量
        int m,n,o,p;
        m = 1;
        n = 2;
        o = 3;
        p = 4;
//        System.out.println(b);
    }
}
