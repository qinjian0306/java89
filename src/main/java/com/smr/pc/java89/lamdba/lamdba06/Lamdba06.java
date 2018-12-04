package com.smr.pc.java89.lamdba.lamdba06;

/**
 * @description
 * @author:         qj
 * @date:           2018/12/4
 */
public class Lamdba06 {

    /**
     * 静态方法引用
     * @param args
     */
    public static void main(String[] args) {


        // 原始方法
        MyInterface myInterface = new MyInterface() {
            @Override
            public int parse(String age) {
                return Integer.parseInt(age);
            }
        };
        int age = myInterface.parse("18");
        System.out.println(age);


        // lamdba
        MyInterface myInterface1 = Integer::parseInt;
        int age2 = myInterface1.parse("19");
        System.out.println(age2);

    }

}
