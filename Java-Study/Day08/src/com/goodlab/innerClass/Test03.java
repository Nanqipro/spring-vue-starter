package com.goodlab.innerClass;

import java.util.Arrays;
import java.util.Comparator;

public class Test03 {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("张三", 18, 1.71, '男');
        students[1] = new Student("李世", 12, 1.74, '男');
        students[2] = new Student("王五", 33, 1.75, '女');
        students[3] = new Student("赵六", 60, 1.70, '男');
        students[4] = new Student("孙七", 11, 1.79, '男');

        // 遍历输出学生对象
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        // 对学生按照年龄排序
        Arrays.sort(students, new Comparator<Student>() { //匿名内部类的使用场景
            // 指定排序规则
            // 如果你认为左边对象 大于 右边对象，那么返回正整数
            // 如果你认为左边对象 小于 右边对象，那么返回负整数
            // 如果你认为左边对象 等于 右边对象，那么返回0
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge(); // 按照年龄升序
                // return o2.getAge() - o1.getAge(); // 按照年龄降序
            }
        });
        System.out.println("排序后：=======");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }


    }
}
