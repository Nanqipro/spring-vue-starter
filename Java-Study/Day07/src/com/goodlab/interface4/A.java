package com.goodlab.interface4;

public interface A {
    // 1 默认方法（普通实例方法）
    default void show(){ // 默认public 修饰
        System.out.println("A.show()");
        print();
    }

    // 2 私有方法 只能通过接口中的其他实例方法调用
    private void print(){
        System.out.println("A.print()");
    }

    // 3 静态方法 默认public 修饰 只能使用接口名调用
    static void show2(){
        System.out.println("A.show2()");
    }
}
