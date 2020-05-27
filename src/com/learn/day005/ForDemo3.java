package com.learn.day005;

public class ForDemo3 {
    /*
    求所有水仙花数：
        水仙花数：一个三位数，其各位数字的立方和等于数本身
        例：153 = 1^3+5^3+3^3
     */

    public static void main(String[] args) {
        //定义三位数：
        /*
        每个位置数字 0-9
         */
        for (int i = 0; i <=9 ; i++) {
            for (int j = 0; j <=9 ; j++) {
                for (int k = 1; k <=9 ; k++) {
                    if(i*i*i+j*j*j+k*k*k == k*100+j*10+i){
                        System.out.println(k*100+j*10+i);
                    }
                }
            }
        }


        //统计水仙花数的个数
        /*
        求各位数字：
            153 = 1*100 + 5*10 + 3


        */
        int count = 0;
        for (int i = 100; i < 1000 ; i++) {
            int bai = i/100;
            int shi = i%100/10;
            int ge = i%10;

            if(ge*ge*ge+shi*shi*shi+bai*bai*bai == i){
                count++;
            }
        }
        System.out.println(count);
    }
}
