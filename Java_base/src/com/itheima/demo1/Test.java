package com.itheima.demo1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //加油站支付小程序
        System.out.println("=====欢迎使用本加油站支付小程序=====");
        //创建金卡对象
        GoldCard goldCard = new GoldCard("G001","张三",1000,"13888888888");

        //创建银卡对象
        SilverCard silverCard = new SilverCard("S001","张三",1000,"13888888888");
    }
    //创建一个方法，用于模拟用户支付功能
    public static void pay(Card card){
        System.out.println("您当前使用的是消费卡");
        System.out.println("请输入您要支付的金额：");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        card.payMoney(money);

    }
}
