package com.inspur.jdk8_11;

import java.util.function.Supplier;

/**
 * Created by Administrator on 2019/4/6.
 */
public class SupplierTest {
    
    public static void main(String[] args){
        Supplier<String> supplier = () -> "hello world supplier";
        System.out.println(supplier.get());

        System.out.println("------------------------------------------------");

        Supplier<Student> supplier1 = () -> new Student("lisi",100);
        System.out.println(supplier1.get().getName());

        System.out.println("------------------------------------------------");
        //构造方法的应用:对函数式接口的实现
        Supplier<Student> supplier2 = Student::new;
        System.out.println(supplier2.get().getName());
        System.out.println("------------------------------------------------");
        //方法引用对函数式接口的实现
        Supplier<Student> supplier3 = Student::getStudent;
        System.out.println(supplier3.get().getName());

    }
}
