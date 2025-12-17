package com.goodlab.polymorphsm1;

public class fish extends Animal {
    String name = "鱼";

    @Override
    public void run(){
        System.out.println("鱼会游");
    }
    public void drink(){
        System.out.println("鱼吃水母");
    }
}
