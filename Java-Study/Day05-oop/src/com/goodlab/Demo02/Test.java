package com.goodlab.Demo02;

import java.util.Scanner;

public class Test {
    // 加油站支付小程序
    // 1.创建卡片类，以便创建金卡或者银卡对象，封装车主的数据
    // 2.定义一个卡片父类：Card
    // 3. 定义一个金卡子类 金卡必须重写消费方法（8折优惠）
    // 4. 定义一个银卡子类 银卡必须重写消费方法（9折优惠）
    // 5. 办一张金卡，创建金卡对象，交给一个独立的业务（支付机）来完成：存款 消费
    // 6. 办一张银卡，创建银卡对象，交给一个独立的业务（支付机）来完成：存款 消费
    public static void main(String[] args) {
        Card goldCard = new GoldCard("赣A111111", "张三", "123456789", 1000);
        Card silverCard = new SilverCard("赣A222222", "张四", "123456789", 1000);
        pay(goldCard);
        pay(silverCard);
    }
    // 支付机
    public static void pay(Card card) {
        System.out.println("欢迎使用" + card.getCardName() + "卡");
        System.out.println("请输入金额");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        card.consumeMoney(money);
        System.out.println("支付成功，余额为" + card.getMoney());
    }

}
