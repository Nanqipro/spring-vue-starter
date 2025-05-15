package com.itheima.interfacedemo;

public class ClassDataInterImpl2 implements ClassDataInter{
    private Student[] students;
    public ClassDataInterImpl2() {
    }
    public ClassDataInterImpl2(Student[] students) {
        this.students = students;
    }
    @Override
    public void printStudentInfo() {
        //打印学生男女人数
        int manCount = 0;
        int womanCount = 0;
        for (int i = 0; i < students.length; i++) {
            if(students[i].getSex()=='男'){
                manCount++;
            }else{
                womanCount++;
            }
        }
        System.out.println("男生人数：" + manCount);
        System.out.println("女生人数：" + womanCount);

    }

    @Override
    public void printStudentScore() {
        //打印学生的平均分
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getScore();
        }
        System.out.println("平均分：" + sum / students.length);
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            System.out.println(student.getName() + " " + student.getSex() + " " + student.getScore());
        }
    }
}
