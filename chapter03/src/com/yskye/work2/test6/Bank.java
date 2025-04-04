package com.yskye.work2.test6;

public class Bank {
    private String id;
    private String name;
    private double balance;

    public Bank() {}

    public Bank(String id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
        System.out.println("用户："+name+"现在有"+balance + "元");
    }

    public void deposit(int i) {
        if (i<=0) {
            System.out.println("存款必须大于0");
            return;
        }
        System.out.println("用户："+name+"存入"+i+"元");
        balance += i;
        System.out.println("用户："+name+"现在有"+balance + "元");
    }

    public void withdraw(int i) {
        if (i<=0) {
            System.out.println("取款必须大于0");
            return;
        }
        if (balance < i) {
            System.out.println("用户："+name+"现在有"+balance + "元，取款失败");
            return;
        }
        System.out.println("用户："+name+"取款"+i+"元");
        balance -= i;
        System.out.println("用户："+name+"现在有"+balance + "元");
    }
}
