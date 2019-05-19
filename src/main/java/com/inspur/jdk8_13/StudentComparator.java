package com.inspur.jdk8_13;

/**
 * Created by Administrator on 2019/4/7.
 */
public class StudentComparator {

    public int compareStudentByScore(Student student1, Student student2){
        return student1.getScore() - student2.getScore();
    }

    public int compareStudentByName(Student student1, Student student2){
        return student1.getName().compareTo(student2.getName());
    }

}
