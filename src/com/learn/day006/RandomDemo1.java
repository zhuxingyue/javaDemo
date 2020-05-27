package com.learn.day006;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo1 {
    /*
    猜数据游戏：系统产生随机数，玩家猜，判断是否正确
     */
    public static void main(String[] args) {
        Random random = new Random();
        int sys = random.nextInt(100) + 1;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入猜的数据：");
            int play = scanner.nextInt();
            if (play == sys) {
                System.out.println("猜对了！！");
                break;
            } else if (play > sys) {
                System.out.println("比这个数小");
            } else
                System.out.println("比这个数大");
        }
    }
}
