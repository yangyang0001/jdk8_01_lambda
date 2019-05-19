package com.inspur.jdk8_08;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2019/4/6.
 */
public class PersonTest {

    public static void main(String[] args){
        Person person1 = new Person("zhangsan", 20);
        Person person2 = new Person("lisi", 40);
        Person person3 = new Person("wangwu", 60);

        List<Person> personList = Arrays.asList(person1, person2, person3);
//        personList.stream().filter(person -> person.getUsername().equals("zhangsan")).forEach(person -> System.out.println(person));

        PersonTest test = new PersonTest();
        List<Person> userNameList = test.getPersonListByUserName("lisi" , personList);
        userNameList.forEach(person -> System.out.println(person));

        System.out.println("-------------------------------------------------------------------------------------");

        List<Person> ageList = test.getPersonListByAge(45, personList);
        ageList.forEach(person -> System.out.println(person));

        System.out.println("-------------------------------------------------------------------------------------");

        BiFunction<Integer, List<Person>, List<Person>> biFunction = (age, sourceList) -> {
            return sourceList.stream().filter(person -> person.getAge() >= age).collect(Collectors.toList());
        };
        List<Person> targetList = test.getPersonListByAge2(35, personList, biFunction);
        targetList.forEach(person -> System.out.println(person));

    }


    public List<Person> getPersonListByUserName(String username, List<Person> personList){
        return personList.stream().filter(new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getUsername().equals(username);
            }
        }).collect(Collectors.toList());

    }

    public List<Person> getPersonListByAge(int age, List<Person> personList){
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (ageOfPerson, sourceList) -> {
            return sourceList.stream().filter(person -> person.getAge() >= ageOfPerson).collect(Collectors.toList());
        };
        return biFunction.apply(age, personList);
    }

    public List<Person> getPersonListByAge2(int age, List<Person> personList, BiFunction<Integer, List<Person>, List<Person>> biFunction){
        return biFunction.apply(age, personList);
    }


}
