package com.goodlab.arraylist;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // arraylist 集合的增删改查
        // 创建一个ArrayList对象
        ArrayList<String> list = new ArrayList<>(); // 泛型定义集合
        // 添加数据
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("java2");
        System.out.println(list);
        // 查看数据
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        // 遍历数据
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //删除数据
        list.remove(0);
        System.out.println(list);
        list.remove("java2");
        System.out.println(list);

        // 修改数据
        list.set(0, "hello world");
        System.out.println(list);
    }
}
