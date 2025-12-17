package com.goodlab.Demo02;

public class GoldCard extends Card{

    public GoldCard(String cardId, String cardName, String phone, double money) {
        super(cardId, cardName, phone, money);
    }

    @Override
    public void consumeMoney(double money) {
        if(getMoney()< money*0.8){
            System.out.println("余额不足");
            return;
        }

        // 金卡消费金额
        System.out.println("使用金卡消费了" + money + "元");

        System.out.println("优惠后的价格" + money * 0.8 + "元");

        // 更新金额
        setMoney(getMoney() - money * 0.8);
        // 消费超过200 打印洗车票
        if(money >= 200) {
//            System.out.println("请洗车");
            printTicket();
        }
        else{
            System.out.println("消费不满200，无法打印系车票");
        }
    }

    public void printTicket() {
        System.out.println("请洗车");
    }
}
