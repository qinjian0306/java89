package com.smr.pc.java89.lamdba.lamdba01;

/**
 * 基本语法:
 *      1. java8中引入了新的操作符”->”，称为箭头操作符或者lambda操作符，箭头操作符将lambda拆分为两部分，
 *         左侧：lambda表达式的参数列表，右侧：lambda表达式中的所需要执行的的功能(接口实现的功能代码)
 *      2. lambda表达式需要“函数式接口”的支持，接口中有且只有一个抽象方法的接口称为函数式接口，可以使用注解@FunctionalInterface检查接口是否是函数式接口
 *      3. lambda表达式的参数列表的数据类型可以省略不写，因为jvm编辑器可以通过上下文判断
 *
 *
 * 语法:
 *      (parameters) -> expression
 *      (parameters) -> { statements; }
 *
 * 组成：
 *      1. paramaters:
 *                     类似方法中的形参列表，这里的参数是函数式接口里的参数。这里的参数类型可以明确的声明也可不声明而由JVM隐含的推断1。
 *                     另外当只有一个推断类型时可以省略掉圆括号。
 *      2. ->:
 *                      可理解为“被用于”的意思
 *      3. 方法体:
 *                      可以是表达式也可以代码块，是函数式接口里方法的实现。
 *                      代码块可返回一个值或者什么都不反回，这里的代码块块等同于方法的方法体。如果是表达式，也可以返回一个值或者什么都不反回
 */
public class Lambda01 {

    public static void main(String[] args) {
        LambdaFn();
    }







    public static void LambdaFn() {

        /*
            //示例1：不需要接受参数，直接返回10
            ()->10

            //示例2：接受两个int类型的参数，并返回这两个参数相加的和
            (int x,int y)->x+y;

            //示例2：接受x,y两个参数，该参数的类型由JVM根据上下文推断出来，并返回两个参数的和
            (x,y)->x+y;

            //示例3：接受一个字符串，并将该字符串打印到控制到，不反回结果
            (String name)->System.out.println(name);

            //示例4：接受一个推断类型的参数name，并将该字符串打印到控制台
            name->System.out.println(name);

            //示例5：接受两个String类型参数，并分别输出，不反回
            (String name,String sex)->{System.out.println(name);System.out.println(sex)}

            //示例6：接受一个参数x，并返回该该参数的两倍

        */


        // 原写法
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("test 01");
            }
        }).start();


        // lambda表达式写法
        new Thread(() -> System.out.println("test 02")).start();



    }
}



