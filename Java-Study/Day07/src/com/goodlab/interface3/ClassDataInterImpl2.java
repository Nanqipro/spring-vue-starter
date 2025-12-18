package com.goodlab.interface3;

public class ClassDataInterImpl2 implements ClassDataInter{
    private student[] students;

    public ClassDataInterImpl2(student[] students) {
        this.students = students;
    }

    public ClassDataInterImpl2() {
    }

    @Override
    public void printAllStudentsInfo() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName()+"\t"+students[i].getSex()+"\t"+students[i].getScore());
        }

    }

    @Override
    public void printAverageScore() {
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getScore();
        }
        System.out.println("平均分是："+sum/students.length);

    }
}
