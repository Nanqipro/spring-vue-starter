package com.goodlab.javabean;

public class studentOperator {
    // 目的：打印学生的总成绩和平均成绩
    private student s;
    public studentOperator(student s){
        this.s = s;
    }

    public studentOperator() {
    }

    public void print(){
        System.out.println("总成绩：" + (s.getMath() + s.getChinese()));
        System.out.println("平均成绩：" + (s.getMath() + s.getChinese())/ 2);
    }
}
