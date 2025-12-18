package com.goodlab.interface3;

public class ClassDataInterImpl1 implements ClassDataInter{
    private student[] students;

    public ClassDataInterImpl1(student[] students) {
        this.students = students;
    }

    public ClassDataInterImpl1() {
    }
    @Override
    public void printAllStudentsInfo() {
        int maleCount = 0;
        int femaleCount = 0;
        for (int i = 0; i < students.length; i++) {
            if ("男".equals(students[i].getSex())){
                maleCount++;
            }else {
                femaleCount++;
            }
        }
        System.out.println("男性学生数量："+maleCount);
        System.out.println("女性学生数量："+femaleCount);

    }

    @Override
    public void printAverageScore() {
        // 打印去掉最高分和最低分的平均分
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getScore();
        }
        System.out.println("去掉最高分和最低分的平均分："+(sum-students[0].getScore()-students[students.length-1].getScore())/(students.length-2));
    }
}
