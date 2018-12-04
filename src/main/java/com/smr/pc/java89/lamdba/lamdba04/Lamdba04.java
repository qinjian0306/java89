package com.smr.pc.java89.lamdba.lamdba04;

/**
 * @description
 * @author:         qj
 * @date:           2018/12/4
 */
public class Lamdba04 {

    /**
     * 无参数，无返回值
     * @param args
     */
    public static void main(String[] args) {

        // 原始方法
        MyInterface myInterface = new MyInterface() {
            @Override
            public void print() {
                System.out.println("aaaa");
            }
        };

        myInterface.print();


        // lamdba
        MyInterface myInterface1 = ()-> {};
        myInterface1.print();


    }

}
