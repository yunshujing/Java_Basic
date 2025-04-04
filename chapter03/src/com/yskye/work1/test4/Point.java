package com.yskye.work1.test4;
// 将笛卡尔坐标系上的点定义为一个类Point，
// 该类要求提供求得坐标系上两点间距离的功能、获取和设置坐标的功能、获取极坐标的功能，以及完成对已创建的Point类对象进行个数统计的功能。
// 设计测试Point类的应用程序主类，测试并显示输出提供所有功能的结果。
// Math.atan2();Math.sqrt() 方法可返回一个数的平方根
public class Point {
    private double x;
    private double y;
    private double x2;
    private double y2;
    private static int count = 0;
    private double distance;

    public Point() {
        count++;
    }

    public Point(double x, double y, double x2, double y2) {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
        distance = Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
        count++;
    }

    public void getPolar() {
        double r = Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
        double theta = Math.atan2(y2 - y, x2 - x);
        System.out.println("极坐标为：r = " +String.format("%.2f",r) + " theta = " + String.format("%.2f",theta));
    }

    public double getDistance() {
        return distance;
    }

    public static int getCount() {
        return count;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
}
