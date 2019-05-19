package com.inspur.jdk8_16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 这个是最重要的东西
 */
public class StreamTest4 {

    public static void main(String[] args){
//        Stream<String> stream = Stream.of("hello", "world", "helloworld");
//        String[] stringArray = stream.toArray(String[]::new);
//        Arrays.asList(stringArray).forEach(System.out::println);
//
//        System.out.println("---------------------------------------------------------------------------");


        String[] array = new String[]{"zhangsan", "lisi", "wangwu", "zhaoliu"};
        /**
         * 最核心的代码:
         */
//        Stream<String> stringStream = Stream.of(array);
//        List<String> list = stringStream.collect(() -> new ArrayList<String>(), (theList, item) -> theList.add(item),
//                (theList1, theList2) -> theList1.addAll(theList2));
//        list.forEach(System.out::println);
//
//        System.out.println("---------------------------------------------------------------------------");
//
        Stream<String> stringStream1 = Stream.of(array);
//        //通过Stream反向获取LinkedList的实现,观察stream.collect方法的实现
        List<String> linkedList = stringStream1.collect(LinkedList::new, LinkedList::add, LinkedList::addAll);
        linkedList.forEach(System.out::println);
//
//        System.out.println("---------------------------------------------------------------------------");
//
//        //通过Stream反向获取ArrayList的实现,观察collect方法的实现
//        Stream<String> stringStream2 = Stream.of(array);
//        List<String> arrayList = stringStream2.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
//        arrayList.forEach(System.out::println);

//        System.out.println("---------------------------------------------------------------------------");
        Stream<String> stringStream3 = Stream.of(array);
        List<String> myList = stringStream3.collect(Collectors.toCollection(ArrayList::new));
        myList.forEach(System.out::println);

//        System.out.println("---------------------------------------------------------------------------");
        /**
         * 下面是对Stream转换成不同的集合的演示
         */
//        Stream<String> stringStream4 = Stream.of(array);
////        Set<String> set =  stringStream4.collect(Collectors.toSet());
//        Set<String> treeSet = stringStream4.collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(treeSet.getClass());
//        treeSet.forEach(System.out::println);

        System.out.println("---------------------------------------------------------------------------");
        /**
         * 演示Stream拼接字符串
         */
        Stream<String> stringStream5 = Stream.of(array);
        String lastString = stringStream5.collect(Collectors.joining()).toString();
        System.out.println(lastString);

    }

}
