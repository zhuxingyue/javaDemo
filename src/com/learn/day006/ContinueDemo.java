package com.learn.day006;

public class ContinueDemo {
    //continue结束一次循环进行下次循环
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i==3)
                continue;
            System.out.print(i);
        }
    }
}
