package com.smr.pc.java89.lamdba.lamdba07;


import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * 对象引用::实例方法名
 * 类名::静态方法名
 * 类名::实例方法名
 *
 * 引用构造器
 * 引用数组
 *
 * @author qinjian
 */
public class Lamdb07 {

    public static void main(String[] args) {

        // 对象引用::实例方法名
        Consumer<String> consumer = System.out::println;
        consumer.accept("This is Major Tom");

        // 类名::静态方法名
        Function<Long, Long> f = Math::abs;
        Long result = f.apply(-3L);

        // 类名::实例方法名
        BiPredicate<String, String> b = String::equals;
        b.test("abc", "abcd");


        // 引用构造器
        Function<Integer, StringBuffer> fun = StringBuffer::new;
        StringBuffer buffer = fun.apply(10);

        // 引用数组
        Function<Integer, int[]> array = int[]::new;
        int[] arr = array.apply(10);

    }
}
