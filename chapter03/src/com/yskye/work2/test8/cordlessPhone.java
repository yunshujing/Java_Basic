package com.yskye.work2.test8;

public class cordlessPhone extends fixPhone {
    public cordlessPhone(String number) { // 修改构造函数参数类型
        super(number);
    }

    @Override
    public void getNumber() {  // 修改返回值类型与父类一致
        System.out.println("本机号码是：" + number);
    }

    public void move() {
        System.out.println("正在移动通话……");
    }
}
