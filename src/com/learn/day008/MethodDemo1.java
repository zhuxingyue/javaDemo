package com.learn.day008;

import java.util.Scanner;

public class MethodDemo1 {
    /*
    输入两个值，返回最大值
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个值：");
        int a = scanner.nextInt();
        System.out.print("请输入第二个值：");
        int b = scanner.nextInt();

        int c = getMax(a,b);
        System.out.println(c);
    }

    /**
     * @deprecated 两个数字求和
     * @param a
     * @param b
     * @return 求和结果
     */
    public static int getMax(int a,int b){
        if(a>b)
            return a;
        return b;
    }
}
