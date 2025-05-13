package com.itheima.demo1;


public class GoldCard extends Card{
    public GoldCard(String ID, String name, int money, String phone) {
        super(ID, name, money, phone);
    }
    // 无参构造方法
    public GoldCard(){

    }

    @Override
    public void payMoney(double money){
        System.out.println("您的当前消费：" + money);
        System.out.println("优惠后的价格是" + money*0.8);
        //判断金额够不够
        if (getCardMoney()<money*0.8){
            System.out.println("余额不足");
            return;
        }
        //更新金卡的账户余额
        setCardMoney(getCardMoney()-money*0.8);
        // 判断消费如果大于200，打印洗车票
        if (money * 0.8>200){
            printTicket();
        }else{
            System.out.println("您没有消费200元，无需打印洗车票");
        }

    }
    // 判断消费如果大于200，打印洗车票
    public void printTicket(){
        System.out.println("您消费了200元，请打印洗车票");
    }



}
