package com.learn.day002;

public class Demo008 {
    public static void main(String[] args) {
        test();

        test1();

        String re = test2();
        System.out.println(re);

        test3("java");

        String re1 = test4("java");
        System.out.println(re1);
    }

    private static String test4(String java) {
        System.out.println("java 有参有返回的函数！！");
        return "返回值：java";
    }

    private static void test3(String java) {
        System.out.println("Java 有参无返回的函数！！");
    }

    private static String test2() {
        System.out.println("java 无参有返回的函数！！");
        return "返回值：java";
    }

    private static void test1() {
        System.out.println("java 无参无返回的函数！！");
    }

    public static void test(){
        System.out.println("java 中的函数测试！！！！");
    }


}
