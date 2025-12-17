package com.goodlab.extendsModifier;

public class father {
    // public: 任何类中都可以访问
    public void publicMethod(){
        System.out.println("publicMethod");
    }

    // protected: 当前类，同包下的其他类，子孙类中可以访问
    protected void protectedMethod(){
        System.out.println("protectedMethod");
    }

    // 缺省： 只能在当前类中，同一包下的其他类中访问
    void defaultMethod(){
        System.out.println("defaultMethod");
    }

    // private: 仅在当前类中访问
    private void privateMethod(){
        System.out.println("privateMethod");
    }
}
