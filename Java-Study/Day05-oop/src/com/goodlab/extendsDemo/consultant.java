package com.goodlab.extendsDemo;

public class consultant extends People {
    private String area;
    private int consumercount;

    public consultant() {
    }

    public consultant(String area, int consumercount) {
        this.area = area;
        this.consumercount = consumercount;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getConsumercount() {
        return consumercount;
    }

    public void setConsumercount(int consumercount) {
        this.consumercount = consumercount;
    }
}
