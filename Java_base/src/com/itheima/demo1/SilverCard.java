package com.itheima.demo1;

public class SilverCard extends Card{
    public SilverCard(String ID, String name, int money, String phone) {
        super(ID, name, money, phone);
    }

    //重写消费方法
    @Override
    public void payMoney(double money) {
        System.out.println("您当前消费了"+money);
        System.out.println("优惠后的价格为：" +  money*0.9);
        //更新银卡的账户余额
        //判断金额够不够
        if (getCardMoney()<money*0.8){
            System.out.println("余额不足");
            return;
        }
        setCardMoney(getCardMoney()-money*0.9);

    }

}
