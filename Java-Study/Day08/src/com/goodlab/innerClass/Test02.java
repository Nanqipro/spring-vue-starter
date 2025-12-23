package com.goodlab.innerClass;

public class Test02 {
    public static void main(String[] args) { //通常作为一个对象参数传输给方法使用
        Swim s1 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("学生开始游泳");
            }
        };
        start(s1);

        Swim s2 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("老师开始游泳");
            }
        };
        start(s2);

    }
    public static void start(Swim s) {
        System.out.println("开始");
        s.swimming();
        System.out.println("结束");
    }
}
interface Swim {
    public abstract void swimming();
}