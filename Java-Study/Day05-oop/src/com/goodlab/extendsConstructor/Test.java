package com.goodlab.extendsConstructor;

public class Test {
    public static void main(String[] args) {
        // 认识子类构造器的特点

        son s1 = new son("liu");
        students s = new students("张三", 18,1002);
        System.out.println(s.toString());

    }


}

class father{
    public father(){
        System.out.println("父类无参构造器");
    }
    public father(String name){
        System.out.println("父类有参构造器");
    }
}

class son extends father{
    public son(){
        // super();// 所有的子类构造器都有
        super("liu"); // 调用父类的有参构造器
        System.out.println("子类无参构造器");
    }
    public son(String name){
        System.out.println("子类有参构造器");
    }
}
