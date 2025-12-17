package com.goodlab.Demo02;

public class SilverCard extends Card {
    public SilverCard(String cardId, String cardName, String phone, double money) {
        super(cardId, cardName, phone, money);
    }
    @Override
    public void consumeMoney(double money) {
        if(getMoney() < money * 0.9){
            System.out.println("余额不足");
            return;
        }

        // 金卡消费金额
        System.out.println("使用银卡消费了" + money + "元");

        System.out.println("优惠后的价格" + money * 0.9 + "元");

        // 更新金额
        setMoney(getMoney() - money * 0.9);

    }
}
