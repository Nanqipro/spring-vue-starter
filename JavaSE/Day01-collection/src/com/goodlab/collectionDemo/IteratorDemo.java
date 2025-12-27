package com.goodlab.collectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        // 1 迭代器遍历方法
        Collection<String> names = new ArrayList<>();
        names.add("xiaomi");
        names.add("xiaopeng");
        names.add("lixiang");
        names.add("tesla");
        System.out.println(names);
        //得到这个集合的迭代器对象
        Iterator<String> it = names.iterator();
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());

        while(it.hasNext()){
            String name = it.next();
            System.out.println(name);
        }

        // 2 增强的for 循环遍历
        for(String s : names){
            System.out.println(s);
        }
        // 还可以遍历数组
        int[] n = new int[]{1,2,3,4,5};
        for(int a : n){
            System.out.println(a);
        }

        // 3 lambda 方式遍历
        names.forEach(System.out::println);


    }
}
