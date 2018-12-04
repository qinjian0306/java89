package com.smr.pc.java89.lamdba.lamdba03;

/**
 * @description
 * @author:         qj
 * @date:           2018/12/4
 */
public class Lamdba03 {

    /**
     * 一个输入参数，无返回值
     *  只需要一个参数的时候，”->”左边的括号可以省略
     * @param args
     */
    public static void main(String[] args) {

        // 原始方法
        MyInterface myInterface = new MyInterface() {
            @Override
            public void print(String str) {
                System.out.println(str);
            }
        };

        myInterface.print("原始");


        // lamdba  只需要一个参数的时候，”->”左边的括号可以省略
        // 当”->”右边需要执行的代码只有一条语句，return和大括号都可以省略不写
        MyInterface myInterface1 = str-> System.out.println(str);
        myInterface1.print("lamdba");


        // 简化
        MyInterface myInterface2 = System.out::println;
        myInterface2.print("lamdba2");

    }

}
