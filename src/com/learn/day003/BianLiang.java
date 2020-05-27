package com.learn.day003;

public class BianLiang {
    /*
    变量：是内存中的一小段区域，在程序的执行过程中，其值可以在一定范围内进行改变
    组成：
        对区域要有限定：
            如何限定，用数据类型来限定
        必须对区域给一个名称
            变量名称
        区域内必须要有内容
            初始化变量
     */
    public static void main(String[] args) {
        String bianLiang1 = "变量";
        bianLiang1 = "变量1";
        System.out.println(bianLiang1);
    }
}
