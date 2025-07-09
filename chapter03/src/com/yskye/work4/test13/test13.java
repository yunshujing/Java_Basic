package com.yskye.work4.test13;
public class test13 {
    public static void main(String[] args) {
        Undergraduate u1=new Undergraduate("张三",20,"本科","计算机科学");
        Undergraduate u2=new Undergraduate("李四",21,"本科","物联网");
        Graduate g1=new Graduate("王五",25,"硕士","软件工程");
        Graduate g2=new Graduate("刘六",36,"博士","通信工程");
        u1.show();u2.show();g1.show();g2.show();
    }
}
abstract class Student {
    String name,degree;
    int age;
    Student(String name,int age,String degree) {
        this.name=name;
        this.age=age;
        this.degree=degree;
    }
    abstract void show();
}
class Undergraduate extends Student {
    String specialty;
    Undergraduate(String name,int age,String degree,String specialty) {
        super(name,age,degree);
        this.specialty=specialty;
    }
    void show() {
        System.out.println(name+":"+age+","+degree+","+specialty);
    }
}
class Graduate extends Student {
    String direction;
    Graduate(String name,int age,String degree,String direction) {
        super(name,age,degree);
        this.direction=direction;
    }
    void show() {
        System.out.println(name+":"+age+","+degree+","+direction);
    }
}

