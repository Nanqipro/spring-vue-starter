package com.goodlab.extendsConstructor;

public class students {
    private String name;
    private int age;
    private int id;
    private String className;

    public students(String name, int age, int id, String className) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.className = className;
    }
    public students(String name, int age, int id) {
        // this 调用兄弟构造器
        // 注意：super() this() 必须放在构造器的第一行，而且两者不能同时出现
        this(name, age,id,"1班");
    }

    public students() {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", className='" + className + '\'' +
                '}';
    }
}
