package com.goodlab.extendsModifier;

public class Test {
    // 认识四种权限修饰符的修饰范围

    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.show();

    }

}


class Fu {
    String name = "父类";
    public void show(){
        System.out.println(name);
    }
    public void run(){
        System.out.println("父类的run方法");
    }

}

class Zi extends Fu {
    String name = "子类";
    public void show(){
        String name = "子类方法";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
        run();
        super.run();
    }



    public void run(){
        System.out.println("子类的run方法");
    }



}