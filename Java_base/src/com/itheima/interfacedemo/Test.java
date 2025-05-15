package com.itheima.interfacedemo;

public class Test {
    public static void main(String[] args) {
        Student[] allstudents = new Student[10];
        allstudents[0] = new Student("张三",'男',100);
        allstudents[1] = new Student("李四",'女',90);
        allstudents[2] = new Student("王五",'男',80);
        allstudents[3] = new Student("赵六",'女',70);
        allstudents[4] = new Student("孙七",'男',60);
        allstudents[5] = new Student("钱八",'女',50);
        allstudents[6] = new Student("孙九",'男',40);
        allstudents[7] = new Student("王十",'女',30);
        allstudents[8] = new Student("赵十一",'男',20);
        allstudents[9] = new Student("孙十二",'女',10);


        ClassDataInter cdi = new ClassDataInterImpl2(allstudents);
        cdi.printStudentInfo();
        cdi.printStudentScore();

    }


}

