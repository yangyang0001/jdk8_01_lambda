package com.shengsiyuan;

import java.util.Optional;

/**
 * Created by Administrator on 2019/4/7.
 */
public class OptionalTest {

    public static void main(String[] args){
        Optional<String> optionalStr = Optional.of("1234");
        System.out.println("isPresent -------------------:" + optionalStr.isPresent());
        System.out.println("get() -----------------------:" + optionalStr.get());
//        System.out.println("" + );
//        System.out.println("" + );

    }

}
