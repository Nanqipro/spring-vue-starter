package com.goodlab.polymorphsm1;

public class horse extends Animal{
    String name = "马";

    @Override
    public void run(){
        System.out.println("马会跑");
    }

    public void eat(){
        System.out.println("马会吃草");
    }
}
