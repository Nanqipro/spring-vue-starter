package com.goodlab.abstract1;

// 一个类继承抽象类之后，必须重写完继承的全部抽象方法，否则这个类也必须定义成抽象类

public class B extends  A{


    @Override
    public void eat() {
        System.out.println("重写方法");
    }
}
