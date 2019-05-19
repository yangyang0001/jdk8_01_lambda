package com.shengsiyuan;

import java.util.function.Supplier;

/**
 * Created by Administrator on 2019/4/7.
 */
public class SupplierTest {

    public static void main(String[] args){
        Supplier<String> supplier = () -> "123";
        System.out.println(supplier.get());
    }

}
