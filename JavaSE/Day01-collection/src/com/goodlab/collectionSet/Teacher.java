package com.goodlab.collectionSet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher implements Comparable<Teacher> {
    private String name;
    private int age;
    private int high;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", high=" + high +
                '}'+'\n';
    }


    // 比较规则
    // t2.compareTo(t1)
    // t2 == this 比较者
    // t1 == o 被比较者
    // 规定：如果你认为左边大于右边 请返回正整数
    // 规定：如果你认为左边小于右边 请返回负整数
    // 规定：如果两边相等 请返回0
    // 默认是升序
    @Override
    public int compareTo(Teacher o) {
        // 按照年龄
//        if(this.getAge()>o.getAge()) return 1;
//        if(this.getAge()<o.getAge()) return -1;
//        return 0;
        return o.getAge()-this.getAge();// 降序
    }
}
