package com.yskye.work2.test8;

public class Phone {
    protected String number; // 改为protected使子类可以访问

    public Phone() {}

    public Phone(String number) { // 修改构造函数参数类型
        this.number = number;
    }

    public void setNumber(String number) { // 修改方法参数类型
        this.number = number;
    }

    public void getNumber() {
        System.out.println("本机号码是：" + number);
    }

    public void answer() {
        System.out.println("正通过电信固网接听电话……");
    }

    public void dial() {
        System.out.println("正通过电信固网拨打电话……");
    }
}
