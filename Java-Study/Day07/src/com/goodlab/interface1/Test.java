package com.goodlab.interface1;

public class Test {
    public static void main(String[] args) {
        System.out.println(A.NUM);
        // 接口不能用来创建对象，接口是用来被类实现的
        D d = new D();
        d.drink();


    }
}
// D被称为实现类 同时实现多个接口
// 实现类实现多个接口，必须重写完全部的接口的全部抽象方法，否则这个类也必须定义成抽象类
class D implements A, B, C{

    @Override
    public void drink() {

    }
    @Override
    public void eat() {

    }
    @Override
    public void show() {

    }

}