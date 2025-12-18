package com.goodlab.interface4;

public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        A.show2();
    }
}

class B implements A{

}
