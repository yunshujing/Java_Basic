package com.yskye.work2.test7;
// 设计一个学生类Student，其数据成员有name(姓名)、age(年龄)和degree(学位)。
// 每个类都有show()方法，用于输出数据成员信息。
public class Student {
    private String name;
    private int age;
    private String degree;

    public Student() {}
    public Student(String name, int age, String degree) {
        this.name = name;
        this.age = age;
        this.degree = degree;
    }

    public void show() {
        System.out.print("姓名：" + name + "\t" + "年龄：" + age + "\t"+ "\t" +"学位：" + degree+"\t");
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

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
