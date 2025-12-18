package com.goodlab.interface3;

public class Test {
    public static void main(String[] args) {
        student[] students = new student[10];
        students[0] = new student("张三", "男", 90.0);
        students[1] = new student("李四", "女", 80.0);
        students[2] = new student("王五", "男", 70.0);
        students[3] = new student("赵六", "女", 60.0);
        students[4] = new student("孙七", "男", 50.0);
        students[5] = new student("周八", "女", 40.0);
        students[6] = new student("吴九", "男", 30.0);
        students[7] = new student("郑十", "女", 20.0);
        students[8] = new student("王十一", "男", 10.0);
        students[9] = new student("张十二", "女", 0.0);

        ClassDataInter cdi = new ClassDataInterImpl2(students);
        cdi.printAverageScore();
        cdi.printAllStudentsInfo();


    }
}
