package com.goodlab.collectionSet;

import java.util.*;

public class SetDemo {
    public static void main(String[] args){
        // 创建一个Set集合
        Set<String> set = new HashSet<>(); //无需 不重复 无索引
        set.add("huawei");
        set.add("红米");
        set.add("iphone");
        set.add("iphone");
        set.add("xiaomi");
        System.out.println(set);
        Set<String> set2 = new LinkedHashSet<>(); // 有序 不重复 无索引
        set2.add("huawei");
        set2.add("红米");
        set2.add("iphone");
        set2.add("iphone");
        set2.add("xiaomi");
        System.out.println(set2);
        Set<Double> set3 = new TreeSet<>(); //排序 默认是升序排序 不重复 无索引
        set3.add(1.0);
        set3.add(1.1);
        set3.add(3.0);
        set3.add(8.0);
        set3.add(3.0);
        System.out.println(set3);
        System.out.println("_______________________");
        // HashSet集合的去重操作
        Set<Student> students = new HashSet<>();
        students.add(new Student("小王", 18,100));
        students.add(new Student("小王", 18,100));
        students.add(new Student("小美", 19,101));
        students.add(new Student("小丽", 18,120));
        System.out.println(students);
        // 如果希望Set集合认为两个内容相等的对象是重复的，那么必须满足两个条件：
        // 1.对象必须重写equals()方法 2.对象必须重写hashCode()方法

        System.out.println("_______________________");
        // TreeSet集合如何实现对于对象的自定义排序
//        Set<Teacher> teachers = new TreeSet<>(new Comparator<Teacher>() { // 优先用集合自带的规则
//            @Override
//            public int compare(Teacher o1, Teacher o2) {
//                return o1.getAge()-o2.getAge(); // 升序
//            }
//        });
        // 简化
        Set<Teacher> teachers = new TreeSet<>((o1,o2) -> o1.getAge()-o2.getAge());
        teachers.add(new Teacher("小王", 18,170));
        teachers.add(new Teacher("小刘", 20,171));
        teachers.add(new Teacher("小张", 19,172));
        teachers.add(new Teacher("小美", 18,170));
        System.out.println(teachers);
        System.out.println("_______________________");
        // TreeSet集合默认不能给自定义的对象排序，因为不知道大小规则，有如下两种方法：
        // 对象类实现一个 Comparable比较接口 ，重写compare()方法 指定比较规则
        // public TreeSet (comoarator c)集合自带比较器Comparator对象，指定比较规则




    }
}
