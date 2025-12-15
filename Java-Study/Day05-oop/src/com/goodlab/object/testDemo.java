package com.goodlab.object;

public class testDemo {
    public static void main(String[] args) {
        star s = new star();
        s.name = "张三";
        s.age = 18;
        s.sex = "男";
        s.birth = "2000-01-01";
        s.birthplace = "上海";

        System.out.println(s.name);
        System.out.println(s.age);

        student s1 = new student();
        s1.name = "张三";
        s1.age = 18;
        s1.score = 100;
        s1.show();
        s1.printscore();

    }
}
