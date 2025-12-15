package com.goodlab.capsulation;

public class student {
    String name;
    private int age;
    private double score;

    // set 方法
    public void setAge(int age){
        if (age < 0){
            System.out.println("输入的值非法！");
        }
        this.age = age;

    }
    // get 方法
    public int getAge(){
        return age;
    }
    public void setScore(double score){
        if (score < 0 || score > 100){
            System.out.println("输入的值非法！");
            return;
        }
        this.score = score;
    }
    public double getScore(){
        return score;
    }

}
