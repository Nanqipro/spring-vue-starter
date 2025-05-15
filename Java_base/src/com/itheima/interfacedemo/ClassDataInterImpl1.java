package com.itheima.interfacedemo;

public class ClassDataInterImpl1 implements ClassDataInter{
    private Student[] students;
    //无参构造器
    public ClassDataInterImpl1() {}
    //有参构造器
    public ClassDataInterImpl1(Student[] students) {
        this.students = students;
    }
    @Override
    public void printStudentInfo() {
        System.out.println("姓名\t性别\t成绩");
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            System.out.println(student.getName() + " " + student.getSex() + " " + student.getScore());
        }

    }

    @Override
    public void printStudentScore() {
        System.out.println("姓名\t成绩");
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            System.out.println(student.getName() + " " + student.getScore());
        }



    }
}
