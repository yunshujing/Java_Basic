package com.yskye.work2.test7;
// 设计一个学生类Student，其数据成员有name(姓名)、age(年龄)和degree(学位)。
// 由Student类派生出本科生类Undergraduate和研究生类Graduate，本科生类Undergraduate增加成员specialty(专业)，研究生类增加成员direction(研究方向)。
// 每个类都有show()方法，用于输出数据成员信息。
//姓名：张三  年龄：20  学位本科  专业：通信
//姓名：李四  年龄：21  学位本科  专业：电子
//姓名：王五  年龄：25  学位硕士  研究方向：通信
//姓名：刘六  年龄：36  学位博士  研究方向：通信
public class test7 {
    public static void main(String[] args) {
        Undergraduate u1 = new Undergraduate("张三",20,"本科","通信");
        Undergraduate u2 = new Undergraduate("李四",21,"本科","电子");
        Graduate g1 = new Graduate("王五",25,"硕士","通信");
        Graduate g2 = new Graduate("刘六",36,"博士","通信");
        u1.show();
        u2.show();
        g1.show();
        g2.show();
    }
}
