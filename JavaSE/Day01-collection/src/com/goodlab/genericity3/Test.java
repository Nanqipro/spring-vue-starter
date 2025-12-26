package com.goodlab.genericity3;


import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // 打印任意数组内容
        String [] arr = {"张三", "王五", "赵六"};
        printArray(arr);
        Student [] students = {new Student(), new Student(), new Student()};
        printArray(students);
        Student max = getMax(students);
        String maxName = getMax(arr);

        // 泛型和集合不支持基本数据类型，只能支持对象类型（引用数据类型）
//        ArrayList<int> list = new ArrayList<>();
        // 泛型擦除：泛型工作在编译阶段，等编译后，泛型就没用了，所以泛型在编译后都会被擦除。所有的类型会恢复成Object类型
        // 为了让泛型和集合支持基本数据类型，使用包装类对象将基本数据类型变成包装类对象
        // 手工包装
        // Integer i = new Integer(10); // 过时
        Integer it1 = Integer.valueOf(10);

        // 自动包装
        Integer it2 = 10;

        // 自动拆包装
        int i = it2;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(it1);
        list.add(it2);
        int rs = list.get(0);
        System.out.println("-------------------------");

        //包装类新增的功能
        // 1. 把基本数据类型的数据转换成字符串
        int j = 21;
        String s = Integer.toString(j);
        System.out.println(s + 1);
        Integer i2 = j;
        String rs2 = i2.toString();
        System.out.println(rs2 + 1);

        System.out.println("-------------------------");
        // 2. 把字符串转换成基本数据类型
        String s1 = "123";
//        int i3 = Integer.parseInt(s1);
        int i3 = Integer.valueOf(s1);
        System.out.println(i3 + 1);

        String s2 = "123.5";
//        double d = Double.parseDouble(s2);
        double d = Double.valueOf(s2);
        System.out.println(d + 1);

    }
    public static <T> void printArray(T[] arr){
        for (T t : arr) {
            System.out.println(t);
        }
    }
    public static <T> T getMax(T[] names){
        return null;

    }

}
