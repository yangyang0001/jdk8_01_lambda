package com.inspur.jdk8_12;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Created by Administrator on 2019/4/7.
 */
public class OptionalTest {
    
    public static void main(String[] args){

        Optional<String> optional = Optional.of("hello");
//        Optional<String> optional = Optional.empty();

        //这种方式是传统的方式的编程,不推荐使用
//        if(optional.isPresent()){
//            System.out.println(optional.get());
//        }
        //这种风格才是我们推荐的方式,通过函数式接口的方式来实现
        optional.ifPresent(item -> System.out.println(item));

        System.out.println("-------------------------------------------------");
        System.out.println(optional.orElse("zhangsan"));
        System.out.println("-------------------------------------------------");
        System.out.println(optional.orElseGet(() -> "supplier"));
        System.out.println("-------------------------------------------------");

        //第二个例子:一对多的关系Employee, Company对象
        Employee employee0 = new Employee();
        employee0.setName("zhangsan");
        Employee employee1 = new Employee();
        employee1.setName("lisi");
        Employee employee2 = new Employee();
        employee2.setName("wangwu");

        List<Employee> employees = Arrays.asList(employee0, employee1, employee2);

        Company company = new Company();
        company.setName("inspur");
//        company.setEmployees(employees);//配合下面的map()的应用

        Optional<Company> companyOptional = Optional.ofNullable(company);

        //这种方式就是对Optional的应用
        System.out.println(companyOptional.map(theCompany -> theCompany.getEmployees()).orElse(Collections.EMPTY_LIST));




    }
}
