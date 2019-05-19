package com.inspur.jdk8_15;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2019/4/7.
 */
public class StreamTest3 {

    public static void main(String[] args){
        List<Integer> sourceList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(sourceList.stream().map(item -> item * 2).reduce(0, Integer::sum));
        System.out.println("--------------------------------------------------");
    }

}
