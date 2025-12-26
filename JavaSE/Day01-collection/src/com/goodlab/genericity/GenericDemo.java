package com.goodlab.genericity;

import java.util.ArrayList;

public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        for (String s : list){
            System.out.println(s);
        }
    }
}
