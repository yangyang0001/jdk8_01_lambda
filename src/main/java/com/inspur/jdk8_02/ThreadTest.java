package com.inspur.jdk8_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2019/4/5.
 */
public class ThreadTest {

    public static void main(String[] args){
        //lambda表达式实现Thread中Runnable的方式
//        new Thread(() -> {System.out.println("Hello World");}).start();


        //使用lambda表达式把集合中的字符串全部大写输出
        List<String> list = Arrays.asList("aaa","bbb","hello world","lambda");
        list.forEach((str) -> {System.out.println(str.toUpperCase());});

        System.out.println("-----------------------------------------------------------");
        //把list中的元素转换成大写放入到第二个集合中
        List<String> newList = new ArrayList<String>();
        list.forEach((str) -> {newList.add(str.toUpperCase());});
        newList.forEach((str) -> {System.out.println(str);});

        System.out.println("lambda 实现-----------------------------------------------------------");
        //这种方式是通过map的方式,这里只做介绍
        list.stream().map(str -> str.toUpperCase()).forEach(str -> System.out.println(str));
        System.out.println("method references -----------------------------------------------------------");
        //这是通过方法引用的方式对函数式接口实例的实现
        list.stream().map(String::toUpperCase).forEach(str -> System.out.println(str));

    }
}
