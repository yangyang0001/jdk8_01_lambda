package com.shengsiyuan;

import java.util.function.BiFunction;

/**
 * Created by Administrator on 2019/4/7.
 */
public class BiFunctionTest {

    public static void main(String[] args){

        BiFunctionTest test = new BiFunctionTest();
        System.out.println(test.compute(1, 3, (value1, value2) -> value1 + value2));
        System.out.println(test.compute(1, 3, (value1, value2) -> value1 - value2));
        System.out.println(test.compute(1, 3, (value1, value2) -> value1 * value2));
        System.out.println(test.compute(1, 3, (value1, value2) -> value1 / value2));

    }

    public int compute(int a, int b, BiFunction<Integer, Integer, Integer> biFunction){
        return biFunction.apply(a, b);
    }

}
