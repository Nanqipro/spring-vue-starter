package com.goodlab.extendsOverride;



public class toStringOverride {
    public static void main(String[] args) {
        // 实现tostring 方法的重写
        teacher t1 = new teacher("java", 1001, "张三", 18);
        System.out.println(t1);
    }
}

class teacher {
    private String skill;
    private int TeacherID;
    private String name;
    private int age;

    public teacher(String skill, int teacherID, String name, int age) {
        this.skill = skill;
        TeacherID = teacherID;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "teacher{" +
                "skill='" + skill + '\'' +
                ", TeacherID=" + TeacherID +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public teacher() {
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getTeacherID() {
        return TeacherID;
    }

    public void setTeacherID(int teacherID) {
        TeacherID = teacherID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
