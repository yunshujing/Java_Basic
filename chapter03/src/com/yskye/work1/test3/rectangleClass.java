package com.yskye.work1.test3;
// 首先定义一个计算长方形面积的类rectangleClass，
// 要求类中有一个定义长方形左上角和右下角座标的构造方法，以及一个通过长方形右下角座标与左上角座标计算长方形面积的方法area,
// 并实例化两个长方形进行测试。
// Math.abs求绝对值
public class rectangleClass {
    private double x;
    private double y;
    private double x1;
    private double y1;
    private double area;

    public rectangleClass() {}
    public rectangleClass(double x, double y, double x1, double y1)
    {
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
        this.area = Math.abs((x1 - x) * (y1 - y));
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
