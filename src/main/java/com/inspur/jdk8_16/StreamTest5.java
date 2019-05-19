package com.inspur.jdk8_16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Administrator on 2019/4/8.
 */
public class StreamTest5 {
    
    public static void main(String[] args){
//        //1.将集合中所有的元素转换成大写,然后输出
//        List<String> list = Arrays.asList("hello", "world", "helloworld");
//        list.stream().map(String::toUpperCase).forEach(System.out::println);
//        System.out.println("-----------------------------------------------------");
//
//        //2.求出以下集合中的平方然后打印出来
//        List<Integer> integerList = Arrays.asList(1, 3, 5, 6, 7);
//        integerList.stream().map(value -> value * value).forEach(System.out::println);

        System.out.println("-----------------------------------------------------");
        //3.使用flatMap
        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1), Arrays.asList(2, 3, 4, 5), Arrays.asList(6, 7, 8));
        stream.flatMap(theList -> theList.stream()).map(item -> item * item).forEach(System.out::println);
        stream.flatMap(theList -> theList.stream()).map(item -> item * item).forEach(System.out::println);

    }
}
