package com.yskye.work3.test9;

public class test9 {
    public static void main(String[] args) {
        worker zhang3=new worker("张三","工人",4000);
        worker li4=new worker("李四","服务员",3500);
        teacher wang5=new teacher("王五","教师",5000,100);
        scientist liu6=new scientist("刘六","科学家",7000,20000);
        zhang3.print();li4.print();wang5.print();liu6.print();
    }
}

class worker {
    String name,job;
    int salary;
    worker(String name,String job,int salary) {
        this.name=name;
        this.job=job;
        this.salary=salary;
    }
    void print() {
        System.out.println("姓名："+name+" 职业："+job+" 月薪："+salary+" 年收入："+(salary*12));
    }
}
class teacher extends worker {
    int classs;
    teacher(String name,String job,int salary,int classs) {
        super(name,job,salary);
        this.classs=classs;
    }
    void print() {
        System.out.println("姓名："+name+" 职业："+job+" 月薪："+salary + " 课时费：" + classs + " 年收入："+(salary*12+classs*200));
    }
}
class scientist extends worker {
    int science;
    scientist(String name,String job,int salary,int science) {
        super(name,job,salary);
        this.science=science;
    }
    void print() {
        System.out.println("姓名："+name+" 职业："+job+" 月薪："+salary +" 激励奖："+science +" 年收入："+(salary*12+science*4));
    }
}
