package com.inspur.jdk8_11;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * Created by Administrator on 2019/4/6.
 */
public class BinaryOperatorTest {

    public static void main(String[] args){
        BinaryOperatorTest test = new BinaryOperatorTest();
        System.out.println(test.compute(1, 2, (value1,value2) -> value1 + value2));
        System.out.println(test.compute(1, 2, (value1,value2) -> value1 - value2));
        System.out.println(test.compute(1, 2, (value1,value2) -> value1 * value2));
        System.out.println(test.compute(1, 2, (value1,value2) -> value1 / value2));

        System.out.println("--------------------------------------------------------------------");
        System.out.println(test.compute2(10,20,(value1, value2) -> value1 - value2));
    }

    public int compute(int a, int b, BinaryOperator<Integer> binaryOperator){
        return binaryOperator.apply(a,b);
    }


    public int compute2(int a, int b, Comparator<Integer> comparator){
        return BinaryOperator.minBy(comparator).apply(a, b);
    }
}
