package com.learn.day005;

public class XuanZheJieGou {
    /*
    选择结构：
        if语句：
            if
            if else
            if else if  else
        switch语句：
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if(a==b){
            System.out.println("相等！");
        }

        if(a>b){
            System.out.println("a大");
        }else{
            System.out.println("b大");
        }

        if(a>b){
            System.out.println("a大");
        }else if(a==b){
            System.out.println("相等");
        }else{
            System.out.println("b大");
        }
    }
}
