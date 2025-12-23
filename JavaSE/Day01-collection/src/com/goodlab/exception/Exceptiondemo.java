package com.goodlab.exception;

public class Exceptiondemo {
    public static void main(String[] args) {
        // 认识异常的作用
        System.out.println("程序开始执行");
        try {
            System.out.println(div(10, 0));
            System.out.println("底层方法执行成功了");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("底层方法执行失败了");
        }
        System.out.println("程序结束");


    }
    public static int div(int a, int b) throws Exception{
        if (b == 0){
            System.out.println("除数不能为0");
            // 可以返回一个异常给上层调用者，返回的异常还能告知上层底层是执行成功了还是执行失败了
            throw new Exception("除数不能为0");
        }
        return a / b;
    }



}
