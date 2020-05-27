package com.learn.day005;

import java.util.Scanner;
/*
键盘录入输入Scanner类
Scanner 类中有一些获取输入的方法；有int String类型的
 */

public class ScannerJanPanShuRu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数据：");

        int i = scanner.nextInt();

        System.out.println(i);

        String j = scanner.next();
        System.out.println(j);
    }
}
