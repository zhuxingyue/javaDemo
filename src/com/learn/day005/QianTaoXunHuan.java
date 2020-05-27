package com.learn.day005;

public class QianTaoXunHuan {
    /*
    循环嵌套练习：
        输出99乘法表
     */

    public static void main(String[] args) {
        int row = 1;
        for(row=1;row<=9;row++){
            for(int col=1;col<=row;col++) {
                System.out.print(col + " * " + row + " = " + (col * row) + "\t");
            }
            System.out.println();
        }
    }
}
