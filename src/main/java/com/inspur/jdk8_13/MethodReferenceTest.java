package com.inspur.jdk8_13;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * Created by Administrator on 2019/4/7.
 */
public class MethodReferenceTest {

    public String getString(Supplier<String> supplier){
        return supplier.get() + "constructor method references";
    }

    public String getString2(String str, Supplier<String> supplier){
        return supplier.get() + str;
    }


    public static void main(String[] args){

//        List<String> sourceList = Arrays.asList("123", "abc", "zhangsan", "hello");
//        sourceList.forEach(item -> System.out.println(item));
//        System.out.println("--------------------------------------------------------------");
//        //方法引用可以看做另外一个方法的指针
//        sourceList.forEach(System.out::println);

//        System.out.println("--------------------------------------------------------------");

        //方法引用的四种方式:
        /**
         * 1.类名::静态方法名称
         * 2.实例名::实例方法名
         * 3.类名::实例方法名
         */
        Student studnet0 = new Student("zhangsan", 80);
        Student studnet1 = new Student("lisi", 90);
        Student studnet2 = new Student("wangwu", 50);
        Student studnet3 = new Student("zhaoliu", 60);

        List<Student> studentList = Arrays.asList(studnet0, studnet1, studnet2, studnet3);

        //方法引用的第一种方式:类名::静态方法名
//        studentList.sort(Student::compareStudentByScore);
//        studentList.forEach(student -> System.out.println(student.getScore()));
//        System.out.println("--------------------------------------------------------------");
//        studentList.sort(Student::compareStudentByName);
//        studentList.forEach(student -> System.out.println(student.getName()));


//        System.out.println("--------------------------------------------------------------");
        //方法引用的第二种方式:对象名::对象方法名
//        StudentComparator comparator = new StudentComparator();
//        studentList.sort(comparator::compareStudentByScore);
//        studentList.forEach(student -> System.out.println(student.getScore()));
//
//        System.out.println("--------------------------------------------------------------");
//        studentList.sort(comparator::compareStudentByName);
//        studentList.forEach(student -> System.out.println(student.getName()));

//        System.out.println("--------------------------------------------------------------");
        //方法引用的第三种方式:类名::实例方法名
//        studentList.sort(Student::compareTo);
//        studentList.forEach(student -> System.out.println(student.getScore()));

//        studentList.sort(Student::compareStudentWithScore);
//        studentList.forEach(student -> System.out.println(student.getScore()));
//
//        System.out.println("--------------------------------------------------------------");
//        studentList.sort(Student::compareStudentWithName);
//        studentList.forEach(student -> System.out.println(student.getName()));

        System.out.println("--------------------------------------------------------------");
        //方法引用的第四种方式:类名::new属于构造方法的引用
        MethodReferenceTest test = new MethodReferenceTest();
        System.out.println(test.getString(String::new));
        System.out.println(test.getString2("构造方法引用", String::new));


    }


}
