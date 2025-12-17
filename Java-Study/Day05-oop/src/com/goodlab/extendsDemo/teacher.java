package com.goodlab.extendsDemo;

public class teacher extends People {
    private String skill;
    private int TeacherID;

    public teacher() {
    }

    public teacher(String skill, int teacherID) {
        this.skill = skill;
        TeacherID = teacherID;
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
}
