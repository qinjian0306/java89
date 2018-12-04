package com.smr.pc.java89.lamdba.lamdba05;

/**
 * @description
 * @author:         qj
 * @date:           2018/12/4
 */
public class Lamdba05 {

    /**
     * 构造方法引用
     * @param args
     */
    public static void main(String[] args) {

        // 原始方法
        MyInterface myInterface = new MyInterface() {
            @Override
            public Person createPerson(String username, Integer age) {
                return new Person(username,age);
            }
        };

        Person qinjian = myInterface.createPerson("qinjian", 18);
        System.out.println(qinjian);


        // lamdba
        MyInterface myInterface1 = Person::new;
        Person qinjian1 = myInterface1.createPerson("qinjian", 19);
        System.out.println(qinjian1);

    }

}
