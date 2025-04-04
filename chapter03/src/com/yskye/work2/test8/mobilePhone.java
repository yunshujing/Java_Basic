package com.yskye.work2.test8;

public class mobilePhone extends Phone {
    public mobilePhone(String number) { // 修改构造函数参数类型
        super(number);
    }

    @Override
    public void getNumber() {  // 修改返回值类型与父类一致
        System.out.println("手机号码是：" + number);
    }

    @Override
    public void answer() {
        System.out.println("正通过移动网络接听电话……");
    }

    @Override
    public void dial() {
        System.out.println("正通过移动网络拨打电话……");
    }
}
