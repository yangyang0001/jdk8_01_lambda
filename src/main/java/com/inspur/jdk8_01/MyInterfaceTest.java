package com.inspur.jdk8_01;

/**
 * Created by Administrator on 2019/4/5.
 */
public class MyInterfaceTest {

    public static void main(String[] args){
        System.out.println(1);

        MyInterface myInterface  = () -> {
            System.out.println("test myinterface");
        };

        myInterface.test();

        System.out.println(2);
    }

}
