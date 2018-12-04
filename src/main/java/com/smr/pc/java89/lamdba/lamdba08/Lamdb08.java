package com.smr.pc.java89.lamdba.lamdba08;


import java.util.ArrayList;
import java.util.List;

/**
 * 接口的默认方法
 * @author qinjian
 */
public class Lamdb08 {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.forEach(System.out::println);

    }
}
