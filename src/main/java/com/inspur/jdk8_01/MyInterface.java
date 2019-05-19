package com.inspur.jdk8_01;

/**
 * 函数式接口规范:
 * 1.必须是一个接口
 * 2.有且只有一个自己实现的抽象方法
 * 3.使用的格式为:()->{}
 * 4.函数式接口的实现方式有三种:a.lambda表达式 2.method references 3.constructor method references
 */
@FunctionalInterface
public interface MyInterface {
    public void test();
}
