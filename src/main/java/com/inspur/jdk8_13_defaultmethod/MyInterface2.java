package com.inspur.jdk8_13_defaultmethod;

/**
 * Created by Administrator on 2019/4/7.
 */
public interface MyInterface2 {

    default void myMethod(){
        System.out.println("MyInterface2");
    }
}
