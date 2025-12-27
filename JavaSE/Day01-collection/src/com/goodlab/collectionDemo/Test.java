package com.goodlab.collectionDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

        // List 家族
        List<String> ls  = new ArrayList<>();
        ls.add("java");
        ls.add("C++");
        ls.add("python");
        System.out.println(ls);
        String rs = ls.get(0);
        System.out.println(rs);
        // Set 家族
        Set<String> set = new HashSet<>();
        set.add("Go");
        set.add("C#");
        set.add("js");
        System.out.println(set);



    }
}
