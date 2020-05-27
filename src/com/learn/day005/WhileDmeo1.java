package com.learn.day005;

public class WhileDmeo1 {
    /*
    while循环求水仙花数：
     */
    public static void main(String[] args) {
        int num = 100;
        while(num < 1000){
            int ge = num%10;
            int shi = num/10%10;
            int bai = num/100;
            if(ge*ge*ge + shi*shi*shi + bai*bai*bai == num)
                System.out.println(num);
            num++;
        }
    }


}
