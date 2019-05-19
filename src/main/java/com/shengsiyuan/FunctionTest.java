package com.shengsiyuan;

import java.util.function.Function;

/**
 * Created by Administrator on 2019/4/7.
 */
public class FunctionTest {

    public static void main(String[] args){

        FunctionTest test = new FunctionTest();

        System.out.println(test.compute(3, value -> value + 3));
        System.out.println(test.compute(3, value -> value - 3));
        System.out.println(test.compute(3, value -> value * 3));
        System.out.println(test.compute(3, value -> value / 3));

    }

    public int compute(int num, Function<Integer, Integer> function){
        return function.apply(num);
    }

}
