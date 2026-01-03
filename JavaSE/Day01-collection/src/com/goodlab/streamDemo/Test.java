package com.goodlab.streamDemo;

import java.util.*;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        System.out.println("程序开始执行");
        // 目标是认识stream 流，掌握其基本的使用步骤。
        List< String> list = new ArrayList<>();
        list.add("张三风");
        list.add("张三");
        list.add("张翠翠");
        list.add("赵敏");
        list.add("小昭");

        // 先用传统的方式，找出姓张的且名字长度为3的，存入到一个新的集合中
        List<String> newList = new ArrayList<>();
        for (String name : list){
            if (name.startsWith("张") && name.length() == 3){
                newList.add(name);
            }
        }
        System.out.println(newList);

        // 使用stream流
        list.stream()
                .filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 3)
                .forEach(name -> System.out.println(name));

        // 1.获取集合的Stream 流，调用集合提供的stream()方法
        Collection<String> collection = new ArrayList<>();
        Stream<String> s1 = collection.stream();
        // 2.map集合的获取Stream 流，调用map集合提供的stream()方法
        Map<String, Integer> map = new HashMap<>();
        // 获取键流
        Stream<String> s2 = map.keySet().stream();
        // 获取值流
        Stream<Integer> s3 = map.values().stream();
        // 获取键值对流
        Stream<Map.Entry<String, Integer>> s4 = map.entrySet().stream();
        System.out.println(s4);
        // 获取数组的流
        String[] arr = {"张三", "张三风", "小昭", "小美", "小文"};
        Stream<String> s5 = Arrays.stream(arr);
        System.out.println(s5.count());
        Stream<String> s6 = Stream.of(arr);
        Stream<String> s7  = Stream.of("张三", "张三风", "小昭", "小美", "小文");
        // Stream流常用的中间方法，对流上的数据进行处理
        // 1. 过滤方法
        list.stream().filter(name -> name.startsWith("张") && name.length() == 3).forEach(System.out::println);

        // 2. 排序方法
        List<Double> ls = new ArrayList<>();
        ls.add(99.9);
        ls.add(101.12);
        ls.add(98.0);
        ls.add(70.6);
        ls.add(120.5);
        ls.stream().sorted().forEach(System.out::println); // 默认是升序的
        System.out.println("----------------------------------------------------------------");
        ls.stream().sorted((o1,o2) -> Double.compare(o2,o1)).forEach(System.out::println);// 降序排列
        System.out.println("----------------------------------------------------------------");
        ls.stream().sorted((o1,o2) -> Double.compare(o2,o1)).limit(2).forEach(System.out::println); // 取前两名
        ls.stream().sorted((o1,o2) -> Double.compare(o2,o1)).skip(2).forEach(System.out::println); // 跳过前两名
        System.out.println("----------------------------------------------------------------");
        ls.stream().sorted((o1,o2) -> Double.compare(o2,o1)).distinct().forEach(System.out::println); // 去重操作
        // 如果要求自定义对象能过去重操作，要重写对象的hashCode 和 equals方法
        // 映射/加工方法 把原来的数据拿出来变成新的数据又放到流上去
        ls.stream().map(s->"加10分"+(s+10)).forEach(System.out::println);

        // 合并流
        Stream<String> s8 = Stream.of("张三", "张三风", "小昭", "小美", "小文");
        Stream<Integer> s9 = Stream.of(1,2,3,4,5,6,7,8,9,10);
        Stream<Object> s10 = Stream.concat(s8,s9);
        System.out.println(s10.count());


        // Stream流常用的终止方法，对流上的数据进行处理
        System.out.println("----------------------------------------------------------------");
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("张三", 18, 9000));
        teachers.add(new Teacher("张三风", 19, 8050));
        teachers.add(new Teacher("小张", 20, 7000));
        teachers.add(new Teacher("小王", 18, 8000));

        teachers.stream().filter(t->t.getSalary()>8000).forEach(System.out::println);
        long count  = teachers.stream().filter(t->t.getAge() >19).count();
        System.out.println(count);
        // 获取薪水最高的老师对象
        Optional<Teacher> max = teachers.stream().max((o1, o2) -> Double.compare(o1.getSalary(),o2.getSalary()));
        Teacher maxTeacher = max.get(); // 获取Optional对象中的元素
        System.out.println(maxTeacher);


    }
}
