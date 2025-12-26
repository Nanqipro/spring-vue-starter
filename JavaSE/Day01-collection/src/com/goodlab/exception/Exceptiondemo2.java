package com.goodlab.exception;

public class Exceptiondemo2 {
    public static void main(String[] args) {
        System.out.println("程序开始执行");
        try {
            checkAge(1000);
            System.out.println("年龄正常");
        } catch (GoodLabIllegalException e) {
            e.printStackTrace();
            System.out.println("年龄异常");
        }

    }
    // 收到的年龄小于1 或者 大于100 就表示异常
    public static void checkAge(int age) throws GoodLabIllegalException{
        if (age < 1 || age > 100){
            throw new GoodLabIllegalException("年龄异常");
        }else{
            System.out.println("年龄正常");
        }
    }

}
