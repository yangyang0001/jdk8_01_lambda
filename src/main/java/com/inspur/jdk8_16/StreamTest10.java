package com.inspur.jdk8_16;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2019/4/8.
 */
public class StreamTest10 {

    public static void main(String[] args){
        List<String> list1 = Arrays.asList("Hi", "Hello", "你好");
        List<String> list2 = Arrays.asList("zhangsan", "lisi", "wangwu", "zhaoliu");
        list1.stream().forEach(item -> {
            list2.stream().forEach(name ->System.out.println(item + "----" + name));
        });

        System.out.println("-------------------------------------------------------------------------------------");
        //flatMap打平操作
        list1.stream().flatMap(item -> list2.stream().map(item1 -> item + " " + item1)).forEach(System.out::println);
    }
}
