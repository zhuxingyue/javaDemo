package com.learn.day008;

/*
    如果参数是引用数据类型：
        形式参数改变，会影响实际参数的改变
 */
public class MethodParamDemo1 {
    public static void main(String[] args) {
        //实参
        int[] a = {1,2,3,4,5};
        for(int b: a)
            System.out.print("b = "+b+";");

        change(a);

        System.out.println();
        for(int b: a)
            System.out.print("b = "+b+";");
    }

    private static void change(int[] a) {
        //形参
        for (int i = 0; i < a.length ; i++) {
            if(a[i]%2 == 0)
                a[i] *= 2;
        }
    }
}
