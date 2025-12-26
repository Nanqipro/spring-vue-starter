package com.goodlab.exception;

public class Exceptiondemo3 {
    public static void main(String[] args) {
        System.out.println("程序开始执行");

        try {
            checkAge(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    // 收到的年龄小于1 或者 大于100 就表示异常
    public static void checkAge(int age){
        if (age < 1 || age > 100){
            throw new GoodLabIllegalRuntimeException("年龄异常");
        }else{
            System.out.println("年龄正常");
        }
    }

}
