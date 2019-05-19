package com.inspur.jdk8_08;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 主要讲解predicate函数式接口中的东西
 */
public class PredicateTest2 {

    public static void main(String[] args){
        List<Integer> sourceList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        //1.找到集合中的所有奇数
//        sourceList.stream().filter(value -> value%2 != 0).forEach(value -> System.out.println(value));
//        System.out.println("-------------------------------------------------------------------------");
//        //2.找到集合中的所有偶数
//        sourceList.stream().filter(value -> value%2 == 0).forEach(value -> System.out.println(value));
//        System.out.println("-------------------------------------------------------------------------");
//        //3.找到集合中的所有>5的数
//        sourceList.stream().filter(value -> value > 5).forEach(value -> System.out.println(value));
//        System.out.println("-------------------------------------------------------------------------");
//        //4.找到集合中的所有<3的数
//        sourceList.stream().filter(value -> value < 3).forEach(value -> System.out.println(value));

        System.out.println("-----------------------------------------------------------------------");
        //5.要求找出集合中所有>5的并且是偶数的数字
        PredicateTest2 test = new PredicateTest2();
        test.conditionFilter(sourceList, item -> item > 5, item -> item % 2 == 0);


    }



    public void conditionFilter(List<Integer> sourceList, Predicate<Integer> predicate, Predicate<Integer> predicate2){
        for(Integer item : sourceList){
            if(predicate.and(predicate2).test(item)){
                System.out.println(item);
            }
        }
    }

    public void conditionFilter2(){

    }



}
