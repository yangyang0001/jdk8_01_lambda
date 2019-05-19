package com.shengsiyuan;

import java.util.function.BinaryOperator;

/**
 * Created by Administrator on 2019/4/7.
 */
public class BinaryOperatorTest {

    public static void main(String[] args){

        BinaryOperatorTest test = new BinaryOperatorTest();
        System.out.println(test.compute(1, 3, (value1, value2) -> value1 + value2));
        System.out.println(test.compute(1, 3, (value1, value2) -> value1 - value2));
        System.out.println(test.compute(1, 3, (value1, value2) -> value1 * value2));
        System.out.println(test.compute(1, 3, (value1, value2) -> value1 / value2));
    }

    public int compute(int a, int b, BinaryOperator<Integer> binaryOperator){
        return binaryOperator.apply(a, b);
    }

}


