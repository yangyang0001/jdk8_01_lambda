package com.inspur.jdk8_17;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * groupingBy分组,类似与SQL语句中的语法,举例:collect(Collectors.groupingBy(),Collectors.counting())
 */
public class StreamTest11 {

    public static void main(String[] args){
        Student student1 = new Student("zhangsan", 100, 20);
        Student student2 = new Student("lisi", 90, 20);
        Student student3 = new Student("wangwu", 80, 21);
        Student student4 = new Student("zhangsan", 80, 22);

        List<Student> students = Arrays.asList(student1, student2, student3, student4);

        //通过一个规则进行分组:根据名字进行分组
//        Map<String, List<Student>> map = students.stream().collect(Collectors.groupingBy(Student::getName));
//        map.forEach((key, value) -> {
//            System.out.println("key -------------------------:" + key);
//            value.forEach(student -> System.out.println("name--------------------" + student.getName() + ",score----" + student.getScore() + ",age----" + student.getAge()));
//        });
        //通过一个规则进行分组:根据分数进行分组
//        Map<Integer,List<Student>> scoreMap = students.stream().collect(Collectors.groupingBy(Student::getScore));
//        scoreMap.forEach((key, value) -> {
//            System.out.println("key -------------------------:" + key);
//            value.forEach(student -> System.out.println("name--------------------" + student.getName() + ",score----" + student.getScore() + ",age----" + student.getAge()));
//        });

        //根据student的name进行分组,返回名字,个数




















        //类似与select name, count(*) from student group by name;
//        Map<String, Long> targetMap = students.stream().collect(Collectors.groupingBy(Student::getName, Collectors.counting()));
//        System.out.println(targetMap);

        //select avg(score),name from student group by name,score;
        Map<String, Double> scoreAvgMap = students.stream()
                .collect(Collectors.groupingBy(Student::getName,Collectors.averagingDouble(Student::getScore)));
        System.out.println(scoreAvgMap);


    }


}
