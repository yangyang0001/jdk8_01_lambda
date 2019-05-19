package com.inspur.jdk8_02;

/**
 * Created by Administrator on 2019/4/5.
 */
//lambda表达式的实现(实现的是哪个函数式接口的实例)要根据上下文来看的!
public class TheInterfaceTest {

    public static void main(String[] args){
        TheInterface theInterface = () -> {};
        System.out.println(theInterface.getClass().getInterfaces()[0]);
        TheInterface2 theInterface2 = () -> {};
        System.out.println(theInterface2.getClass().getInterfaces()[0]);
    }
}
