package com.inspur.jdk8_15;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Administrator on 2019/4/7.
 */
public class StreamTest2 {

    public static void main(String[] args){
        Stream<Integer> stream = Stream.of(new Integer[]{1, 3, 5, 7, 9});
        stream.forEach(System.out::println);
        System.out.println("-------------------------------------------------");

        IntStream.range(3, 8).forEach(System.out::println);

        System.out.println("-------------------------------------------------");

        IntStream.rangeClosed(3, 8).forEach(System.out::println);
    }

}
