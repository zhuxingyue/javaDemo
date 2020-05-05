package com.learn.day002;

public class Demo011 {
    /*
    java 中的类与对象：
        类关键字 class 创建对象关键字new 函数关键字void
        Java中的本类属性关键字：this
     */

    private String name;
    private int age;
    private String sex;

    public Demo011(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void eat(){
        System.out.println("人吃饭！！");
    }

    public void getInfo(){
        System.out.println("我的名字：" + this.name);
        System.out.println("我的年龄：" + this.age);
        System.out.println("我的性别：" + this.sex);
    }

    public static void main(String[] args) {
        Demo011 demo011 = new Demo011("zhang",20,"男");
        demo011.getInfo();
    }

}
