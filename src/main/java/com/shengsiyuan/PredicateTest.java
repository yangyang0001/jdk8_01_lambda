package com.shengsiyuan;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2019/4/7.
 */
public class PredicateTest {

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 10);
        list.stream().filter(item -> item % 2 == 0).forEach(item -> System.out.println(item));
    }

}
