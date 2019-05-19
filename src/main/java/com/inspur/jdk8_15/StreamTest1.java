package com.inspur.jdk8_15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 获得stream的常用的方式
 */
public class StreamTest1 {
    
    public static void main(String[] args){

        Stream<String> stream = Stream.of("hello", "world", "hello world");

        String[] strArray = new String[]{"hello", "world", "hello world"};
        Stream<String> stream1 = Stream.of(strArray);

        List<String> stringList = Arrays.asList(strArray);
        Stream<String> stream2 = stringList.stream();
    }
}
