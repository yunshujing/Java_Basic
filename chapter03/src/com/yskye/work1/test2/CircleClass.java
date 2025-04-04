package com.yskye.work1.test2;
// 首先定义一个计算二维坐标系中圆面积的类circleClass，
// 要求类中有一个定义圆心座标,圆上一点座标的构造方法，以及一个通过圆上一点座标与圆心座标计算圆面积的方法area。
// 用Math.pow(x底数,y几次方) ,x 的 y 次幂
public class CircleClass {
    private double x;
    private double y;
    private double x1;
    private double y1;
    private double area;

    public CircleClass() {}

    public CircleClass(double x, double y, double x1, double y1){
        this.x=x;
        this.y=y;
        this.x1=x1;
        this.y1=y1;
        System.out.println("圆心坐标为："+x+","+y);
        System.out.println("圆上一点坐标为："+x1+","+y1);
    }

    public double area() {
        double r=Math.sqrt(Math.pow((x1-x),2)+Math.pow((y1-y),2));
        this.area= Math.pow(r,2) * 3.14;
        return area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
