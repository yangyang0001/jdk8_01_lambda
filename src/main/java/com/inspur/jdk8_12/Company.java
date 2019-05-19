package com.inspur.jdk8_12;

import java.util.List;

/**
 * Created by Administrator on 2019/4/7.
 */
public class Company {

    private String name;

    List<Employee> employees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
