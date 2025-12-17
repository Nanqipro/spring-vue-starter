package com.goodlab.polymorphsm1;

public class Test {
    public static void main(String[] args) {
        // 多态代码
        // 对象多态，行为多态
        Animal a1 = new horse();
        a1.run();// 方法：编译看左边，运行看右边
        System.out.println(a1.name);// 成员变量：编译看左边，运行也看左边
        Animal a2 = new fish();
        a2.run();// 方法：编译看左边，运行看右边
        System.out.println(a2.name);// 成员变量：编译看左边，运行也看左边
        System.out.println("================");
        // 多态的好处1: 右边对象是解耦合的
        // 多态的好处2: 父类类型的变量作为参数，可以接收一个子类对象
        Animal a3 = new horse();
        show(a3);

        Animal a4 = new fish();
        show(a4);
        System.out.println("======");
        horse h = (horse) a3;
        h.eat();
        show(h);
        fish f = (fish) a4;
        f.drink();
        show(f);


        // 多态的弊端：无法调用子类特有方法


    }
    public  static void show(Animal a){
        a.run();
//        a.eat(); // 多态下不能调用子类特有的功能

        if(a instanceof horse){
            horse h = (horse) a;
            h.eat();
        }else if(a instanceof fish){
            fish f = (fish) a;
            f.drink();
        }
    }
}
