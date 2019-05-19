package com.inspur.jdk8_07;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by Administrator on 2019/4/6.
 */
public class FunctionTest2 {

    public static void main(String[] args){
        FunctionTest2 test = new FunctionTest2();
//        System.out.println(test.compute(2, value -> value * 3, value -> value * value));      //12
//        System.out.println(test.compute2(2, value -> value * 3, value -> value * value));     //36

//        System.out.println(test.compute3(1,2,(a, b) -> a+b));
//        System.out.println(test.compute3(1,2,(a, b) -> a-b));
//        System.out.println(test.compute3(1,2,(a, b) -> a*b));
//        System.out.println(test.compute3(1,2,(a, b) -> a/b));


        System.out.println(test.compute4(1,3,(value1, value2) -> value1 + value2, value1 -> value1 * value1));//16


    }

    //Function函数式接口中的方法:compose(Function<T,R>)
    public int compute(Integer num, Function<Integer, Integer> function1, Function<Integer, Integer> function2){
        return function1.compose(function2).apply(num);
    }
    //Function函数式接口中的方法:andThen(Function<T,R>)
    public int compute2(Integer num, Function<Integer, Integer> function1, Function<Integer, Integer> function2){
        return function1.andThen(function2).apply(num);
    }

    //BiFunction函数式接口中的apply(T1,T2)
    public int compute3(int a, int b, BiFunction<Integer, Integer, Integer> biFunction){
        return biFunction.apply(a, b);
    }
    //BiFunction函数式接口中的andThen(Function<T,R>)
    public int compute4(int a, int b, BiFunction<Integer, Integer, Integer> biFunction, Function<Integer, Integer> function){
        return biFunction.andThen(function).apply(a,b);
    }


}
