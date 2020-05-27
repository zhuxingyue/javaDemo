package com.learn.day005;

public class SwitchDemo {
    /*
    switch 语句演示
    switch 表达式：
        case 值：
        break；
        default：
        break；

    表达式可以是：
        基本类型：byte，short，int，char
        应用类型：String，Enum(枚举)
     */
    public static void main(String[] args) {
        int day = 1;
        switch (day){
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                break;
            default:
                System.out.println("erro");
                break;
        }

    }
}
