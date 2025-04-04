package com.yskye.work2.test8;

public class test8 {
    public static void main(String[] args) {
        // 创建固定电话实例
        String fixNumber = "05748822096";
        fixPhone fix = new fixPhone(fixNumber);
        fix.getNumber();
        fix.dial();
        fix.answer();

        // 创建移动电话实例
        String mobileNumber = "13788866666";
        mobilePhone mobile = new mobilePhone(mobileNumber);
        mobile.getNumber();
        mobile.dial();
        mobile.answer();

        // 创建无绳电话实例
        String cordlessNumber = "2966";
        cordlessPhone cordless = new cordlessPhone(cordlessNumber);
        cordless.getNumber();
        cordless.dial();
        cordless.answer();
        cordless.move();
    }
}