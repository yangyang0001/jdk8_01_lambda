package com.shengsiyuan;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2019/4/7.
 */
public class ConsumerTest {

    public static void main(String[] args){
        List<Integer> sourceList = Arrays.asList(1, 2, 3, 4, 5, 6, 8, 80);
        sourceList.forEach(item -> System.out.println(item));
    }

}
