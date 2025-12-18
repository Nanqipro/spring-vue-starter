package com.goodlab.singleinstance;
// 懒汉式单例类型
public class B {
    private static B b;
    private B(){}
    public static B getInstance(){
        if(b == null){
            b = new B();
        }
        return b;
    }
}
