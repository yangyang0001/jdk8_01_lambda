package com.inspur.jdk8_16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Administrator on 2019/4/8.
 */
public class StreamTest7 {

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,4,6,8,44,66,8,22);
        List<Integer> otherList = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println("--------------------------------------------------------------------------------------------------");
        //获取相同的元素
        List<Integer> theSameList =
            list.stream().filter(item -> otherList.contains(item)).collect(Collectors.toList());
        theSameList.forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------------------------------------");
        Stream<List<Integer>> listStream = Stream.of(list, otherList);
        listStream.flatMap(theList -> theList.stream()).filter(item -> !theSameList.contains(item))
                .sorted((item1, item2) -> item1 - item2)
                .forEach(System.out::println);


    }
}
