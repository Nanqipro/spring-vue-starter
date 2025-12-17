package com.goodlab.Demo02;


// lombok 技术可以实现为类自动添加getter setter toString方法 无参构造器


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private String cardId;
    private String cardName;
    private String phone;
    private double money;

    // 预存金额

//    public Card(String cardId, String cardName, String phone, double money) {
//        this.cardId = cardId;
//        this.cardName = cardName;
//        this.phone = phone;
//        this.money = money;
//    }
//
//    public Card() {
//    }

    public void saveMoney(double money) {
        this.money += money;
    }

    // 消费金额
    public void consumeMoney(double money) {
        this.money -= money;
    }

}
