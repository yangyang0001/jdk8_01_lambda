package com.inspur.jdk8_16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2019/4/8.
 */
public class StreamTest9 {

    public static void main(String[] args){

        //1.找到以下集合中的长度为5的第一个单词
//        List<String> list = Arrays.asList("aa", "hello1", "world", "helloworld");
//        list.stream().mapToInt(item -> {
//            System.out.println(item);
//            return item.length();
//        }).filter(item -> item == 5).findFirst().ifPresent(System.out::println);
        System.out.println("-----------------------------------------------------------------------");
        //2.找到以下集合中的所有的单词并且去重
        List<String> stringList = Arrays.asList("hello welcome", "hello world", "hello welcome", "welcome to jdk8");

        stringList.stream().map(item -> item.split(" ")).collect(Collectors.toList())
                  .stream().flatMap(item -> Arrays.asList(item).stream()).distinct().forEach(System.out::println);

    }

}
