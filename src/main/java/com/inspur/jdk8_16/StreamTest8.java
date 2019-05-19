package com.inspur.jdk8_16;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 测试串行流和并行流
 */
public class StreamTest8 {

    public static void main(String[] args){

        List<String> list = new ArrayList<String>(5000000);

        for(int i = 0; i < 5000000; i++){
            list.add(UUID.randomUUID().toString());
        }

        long startTime = System.currentTimeMillis();
//        list.stream().sorted().count();           //总共执行毫秒-----------------:7306
        list.parallelStream().sorted().count();     //总共执行毫秒-----------------:4107
        long endTime = System.currentTimeMillis();

        System.out.println("总共执行毫秒-----------------:" + (endTime - startTime));

    }
}
