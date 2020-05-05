package com.learn.day002;
/*
Java 中的枚举定义的是类；创建枚举类
枚举类中创建枚举元素，再通过实例化枚举对象指向枚举中的元素

 */

//定义一个枚举类
enum Car {

    //枚举元素
    ligt(10),
    oil(50),
    color(100);

    private int price;

    Car(int price) {
        this.price = price;
    }

    int getPrice() {
        return price;
    }


}

public class Demo010 {
    public static void main(String[] args) {
        //创建枚举对象
        Car car = Car.oil;

        System.out.println(car + "需要：" + car.getPrice());

    }
}
