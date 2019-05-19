package com.inspur.jdk8_16;

import java.util.stream.Stream;

/**
 * Created by Administrator on 2019/4/8.
 */
public class StreamTest6 {

    public static void main(String[] args){
//        Stream<String> stream = Stream.of(UUID.randomUUID().toString());
//        Stream<String> stream1 = Stream.generate(UUID.randomUUID()::toString);
//        stream1.findFirst().ifPresent(System.out::println);
//        System.out.println("----------------------------------------------------");
//        Stream.iterate(1, item -> item + 2).limit(6).forEach(System.out::println);
//        System.out.println("----------------------------------------------------");
//        Stream.iterate(1, item -> item + 2).limit(6).skip(2).forEach(System.out::println);
//        System.out.println("----------------------------------------------------");

        /**
         * 需求:将上面的流中元素进行如下操作
         * 1.首先满足元素>2的
         * 2.每个元素*2
         * 3.跳过前两个元素
         * 4.对流中满足上面要求的元素进行求和
         */

        //1,3,5,7,9,11
        //3,5,7,9,11
        //6,10,14,18,22
        //14,18,22
        Integer lastValue = Stream.iterate(1, item -> item + 2).limit(6)
                .filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).sum();
        System.out.println(lastValue);


        //对聚合函数的
        Stream<Integer> integerStream = Stream.of(1,2,3,4);
//        IntSummaryStatistics intSummaryStatistics = integerStream.mapToInt(item -> item).summaryStatistics();
//        System.out.println("getCou ------------------:" + intSummaryStatistics.getCount());
//        System.out.println("getMax ------------------:" + intSummaryStatistics.getMax());
//        System.out.println("getMin ------------------:" + intSummaryStatistics.getMin());
//        System.out.println("getSum ------------------:" + intSummaryStatistics.getSum());

        /**
         * 打印出的结果看出,所有的中间操作都被放置在一个容器中,然后对每个元素执行终止操作时串行执行
         */
        /**
         map ****-------
         map ++++-------
         mapToInt-------
         5
         map ****-------
         map ++++-------
         mapToInt-------
         7
         map ****-------
         map ++++-------
         mapToInt-------
         9
         map ****-------
         map ++++-------
         mapToInt-------
         11
         */
        integerStream.map(item -> {
            System.out.println("map ****-------");
            return item * 2;
        }).map(item -> {
            System.out.println("map ++++-------");
            return item + 3;
        }).mapToInt((item1) -> {
            System.out.println("mapToInt-------");
            return item1;
        }).forEach(System.out::println);



    }


}
