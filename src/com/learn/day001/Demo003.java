package com.learn.day001;
/*
循环语句：for ，while，do while

循环输出1到10的数字：
 */
public class Demo003 {
    public static void main(String[] args) {

        //for 循环
        for(int i=1;i<=10;i++){
            System.out.print(i+"\t");
        }

        System.out.println("");
        //while 循环
        int a = 1;
        while(a <= 10){
            System.out.print(a+"\t");
            a++;
        }

        System.out.println("");
        // do while 循环
        int b = 1;
        do{
            System.out.print(b + "\t");
            b++;
        }while(b <= 10);
    }
}
