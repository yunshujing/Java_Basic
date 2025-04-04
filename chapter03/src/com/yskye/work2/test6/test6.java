package com.yskye.work2.test6;

//请创建一个银行帐户类，要求如下：（１）类包括帐户名、帐户号、存款额等属性；（２）可实现余额查询，存款和取款的操作。（３）创建该类的对象，验证以上两项。
public class test6 {
    public static void main(String[] args) {
        Bank user1=new Bank("1","yskye",100);
        user1.deposit(10000);
        user1.withdraw(50);
    }
}
