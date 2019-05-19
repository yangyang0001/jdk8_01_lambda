package com.inspur.jdk8_08;

import java.util.function.Predicate;

/**
 * Created by Administrator on 2019/4/6.
 */
public class PredicateTest {
    
    public static void main(String[] args){
        Predicate<String> predicate = str -> str.length() > 5;
        System.out.println(predicate.test("hello"));

        Predicate<Integer> predicate01 = num -> num > 5;
    }


}
