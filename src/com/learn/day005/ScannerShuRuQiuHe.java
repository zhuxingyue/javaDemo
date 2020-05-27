package com.learn.day005;

import java.util.Scanner;

public class ScannerShuRuQiuHe {
    public static void main(String[] args) {
        /*
        1.键盘录入两个数据，并对两个数据求和，输出其结果
        2。键盘录入两个数据，比较两个数据是否相等
        3。键盘录入3个数据，求最大值
         */

        Scanner scanner = new Scanner(System.in);

        // 输入两个数据，求和
        System.out.print("请输入第一数：");
        int i = scanner.nextInt();

        System.out.print("请输入第二数：");
        int j = scanner.nextInt();

        System.out.println("两数之和是："+(i+j));

        // 比较两个数是否相等
        System.out.println("两数是否相等："+(j==i));

        //比较三个数中最大值
        System.out.print("请输入第三数：");
        int m = scanner.nextInt();

        int n = (((i<j)?j:i)<m)?m:((i<j)?j:i);
        System.out.println("三个数最大的是："+n);


    }
}
