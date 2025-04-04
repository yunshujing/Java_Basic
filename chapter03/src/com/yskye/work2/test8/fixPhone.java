package com.yskye.work2.test8;

public class fixPhone extends Phone {
    public fixPhone(String number) { // 修改构造函数参数类型
        super(number);
    }

    @Override
    public void answer() {
        System.out.println("正通过电信固网接听电话……");
    }

    @Override
    public void dial() {
        System.out.println("正通过电信固网拨打电话……");
    }
}