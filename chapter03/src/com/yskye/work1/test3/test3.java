package com.yskye.work1.test3;
// 首先定义一个计算长方形面积的类rectangleClass，
// 要求类中有一个定义长方形左上角和右下角座标的构造方法，以及一个通过长方形右下角座标与左上角座标计算长方形面积的方法area,
// 并实例化两个长方形进行测试。
// Math.abs求绝对值
public class test3 {
    public static void main(String[] args) {
        rectangleClass re1=new rectangleClass(0,0,8.5,9);
        System.out.println("re1的面积是：" + re1.getArea());
        rectangleClass re2=new rectangleClass(2,3.5,9,6);
        System.out.println("re2的面积是：" + re2.getArea());
    }
}
