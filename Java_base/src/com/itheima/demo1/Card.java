package com.itheima.demo1;


public class Card {  //父类
    private String cardId;
    private String cardName;
    private double cardMoney;
    private String phone;

    //生成有参构造方法
    public Card(String cardId, String cardName, double cardMoney, String phone) {
        this.cardId = cardId;
        this.cardName = cardName;
        this.cardMoney = cardMoney;
        this.phone = phone;
    }
    //生成无参构造方法
    public Card() {
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public double getCardMoney() {
        return cardMoney;
    }

    public void setCardMoney(double cardMoney) {
        this.cardMoney = cardMoney;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //重新toString方法
    @Override
    public String toString() {
        return "cardID"+ this.cardId + "cardName"+ this.cardName + "cardMoney"+ this.cardMoney + "phone"+ this.phone;
    }

    //预存金额
    public void saveMoney(double money) {
        this.cardMoney += money;
    }

    //消费金额
    public void payMoney(double money) {
        this.cardMoney -= money;
    }

}
