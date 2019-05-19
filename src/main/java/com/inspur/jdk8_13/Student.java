package com.inspur.jdk8_13;

/**
 * Created by Administrator on 2019/4/7.
 */
public class Student implements Comparable<Student>{

    private String name;

    private int score;

    public Student(){}

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    //第一种方法引用的方式:类名::静态方法名
    public static int compareStudentByScore(Student student1, Student student2){
        return student1.getScore() - student2.getScore();
    }
    public static int compareStudentByName(Student student1, Student student2){
        return student1.getName().compareTo(student2.getName());
    }

    //当时自定义的方式(属于第三种方法引用的方式,也能够实现)
    @Override
    public int compareTo(Student o) {
        return this.getScore() - o.getScore();
    }

    //第三种方法引用的方式:类名::实例方法名
    public int compareStudentWithScore(Student student){
        return this.getScore() - student.getScore();
    }
    public int compareStudentWithName(Student student){
        return this.getName().compareTo(student.getName());
    }
}
