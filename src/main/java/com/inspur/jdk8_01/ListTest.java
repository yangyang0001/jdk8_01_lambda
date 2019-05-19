package com.inspur.jdk8_01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Administrator on 2019/4/5.
 */
public class ListTest {

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("interger ---------------:" + integer);
            }
        });

        System.out.println("------------------------------------------------");

        //1.lambda表达式的方式对函数式接口实例的实现
        list.forEach((i) -> System.out.println("i ----------------:" + i));

        System.out.println("------------------------------------------------");

        //2.method references的方式对函数式接口实例的实现
        list.forEach(System.out::println);

    }

}
