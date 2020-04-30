package com.learn.day001;

public class Demo005 {
    //  选择判断语句switch case

    public static void main(String[] args) {
        // 判断四季包含的月份

        String weather = "春季";
        switch(weather){
            case "春季":
                System.out.println("春季包含：3，4，5月");
                break;
            case "夏季":
                System.out.println("夏季包含：6，7，8月");
                break;
            case "秋季":
                System.out.println("秋季包含：9，10，11月");
                break;
            case "冬季":
                System.out.println("冬季包含：12，1，2月");
                break;
            default:
                System.out.println("没有这个季节！！！");
                break;

        }
    }

}
