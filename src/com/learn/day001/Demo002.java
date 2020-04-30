package com.learn.day001;

public class Demo002 {
    public static void main(String[] args) {
        /*
            java 的判断语句；
                判断分数：80分以上优秀，60分以上及格，30分以上不及格，30分一下太差；
        */

        int learnSort = 20;

        if(learnSort >= 80)
            System.out.println("优秀！！");
        else if(learnSort >=60 && learnSort < 80)
            System.out.println("及格！！");
        else if(learnSort >=30 && learnSort < 60)
            System.out.println("不及格！！");
        else
            System.out.println("太差！！");
    }
}
