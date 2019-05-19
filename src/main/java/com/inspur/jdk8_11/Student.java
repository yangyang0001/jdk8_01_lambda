package com.inspur.jdk8_11;

/**
 * Created by Administrator on 2019/4/6.
 */
public class Student {

    private String name = "zhangsan";

    private int age = 10;

    public Student(){}

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Student getStudent(){
        return new Student("Yang",20);
    }
}
