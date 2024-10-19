package com.deepblue.example_001_list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 */
public class Main {


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer num) {
                System.out.println("num :" + num);
            }
        });

    }



}
