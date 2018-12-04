package com.smr.pc.java89.lamdba.lamdba02;

/**
 * @description
 * @author:         qj
 * @date:           2018/12/4
 */
public class Lamdba02 {

    /**
     * 两个输入参数，有返回值
     * @param args
     */
    public static void main(String[] args) {

        // 原始方法
        MyInterface myInterface = new MyInterface() {
            @Override
            public int sum(int num1, int num2) {
                return num1 + num2;
            }
        };

        int sum = 0;
        sum = myInterface.sum(10,90);


        // lamdba
        MyInterface myInterface1 = (num1,num2)-> num1+num2;
        sum = myInterface1.sum(10, 90);

        System.out.println(sum);

    }

}
