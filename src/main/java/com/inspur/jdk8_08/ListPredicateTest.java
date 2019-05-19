package com.inspur.jdk8_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2019/4/6.
 */
public class ListPredicateTest {

    public static void main(String[] args){

        List<Integer> firstList = Arrays.asList(1,2,3,4,5);
        List<Integer> seconList = Arrays.asList(2,3,6,7,8);

        List<Integer> firstListCopy = new ArrayList<Integer>(firstList);

        firstListCopy.removeAll(seconList);
        firstListCopy.addAll(seconList);

        Collections.sort(firstListCopy);
        firstListCopy.forEach(item -> System.out.println(item));

    }
}
