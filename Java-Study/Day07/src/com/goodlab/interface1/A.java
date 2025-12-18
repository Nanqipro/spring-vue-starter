package com.goodlab.interface1;

public interface A {
    // JDK 8 之前，接口中只能定义常量和抽象方法
    // 1. 接口中定义常量
    public static final int NUM = 10; // 可以省略 public static final
    // 2. 接口中定义抽象方法
    public abstract void show(); // 可以省略 public abstract

}
