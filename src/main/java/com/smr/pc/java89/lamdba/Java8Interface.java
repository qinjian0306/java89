package com.smr.pc.java89.lamdba;

/**
 * java8 接口
 *     接口新增了默认方法(default), 静态方法以及java9支持的私有方法
 */
@FunctionalInterface
public interface Java8Interface {
    /** 抽象方法 */
    void abstractMethod();
    /** 默认方法 */
    default void defaultMethod(){};
    /** 静态方法 */
    static void staticMethod(){};
}
