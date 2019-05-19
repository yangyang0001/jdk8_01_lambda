package com.inspur.jdk8_03;

import java.util.*;
import java.util.function.Function;

/**
 * Created by Administrator on 2019/4/5.
 */
public class FunctionTest {
    
    public static void main(String[] args){
        //倒序排列
        List<String> strList = Arrays.asList("11","22","33","55","99");
        Collections.sort(strList, (o1, o2) -> o2.compareTo(o1));
        strList.forEach(str -> System.out.println(str));

        System.out.println("-------------------------------------------------------");
        FunctionTest test = new FunctionTest();

        System.out.println(test.compute(1, value -> {return value + 1;}));
        System.out.println(test.compute(2, value -> 2 * value));
        System.out.println(test.compute(3, value -> value * value));

        System.out.println(test.convert(4, value -> {return value + "helloworld";}));
    }

    public int compute(int num, Function<Integer, Integer> function){
        return function.apply(num);
    }

    public String convert(int num, Function<Integer, String> function){
        return function.apply(num);
    }

}
