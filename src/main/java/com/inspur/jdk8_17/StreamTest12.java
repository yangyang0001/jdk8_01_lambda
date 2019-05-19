package com.inspur.jdk8_17;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2019/4/8.
 */
public class StreamTest12 {

    public static void main(String[] args){
        Student student1 = new Student("zhangsan", 100, 20);
        Student student2 = new Student("lisi", 90, 20);
        Student student3 = new Student("wangwu", 80, 21);
        Student student4 = new Student("zhangsan", 80, 22);
        List<Student> students = Arrays.asList(student1, student2, student3, student4);
        Map<Boolean, List<Student>> map = students.stream().collect(Collectors.partitioningBy(student -> student.getScore() >=90 ));
        System.out.println(map);
    }
}
