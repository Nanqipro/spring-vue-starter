package com.goodlab.staticmethod;

public class student {
    private  double score;
    // 静态方法：有static 修饰，属于类持有
    public static void printhello(){
        System.out.println("helloword");
        System.out.println("helloword");
        System.out.println("helloword");

    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    // 实例方法：无static 修饰，属于对象持有
    public void printpass(){
        if(this.score >=60){
            System.out.println("通过");
        }else{
            System.out.println("未通过");
        }
    }
}
