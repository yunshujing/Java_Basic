package com.yskye.work1.test4;
// 将笛卡尔坐标系上的点定义为一个类Point，
// 该类要求提供求得坐标系上两点间距离的功能、获取和设置坐标的功能、获取极坐标的功能，以及完成对已创建的Point类对象进行个数统计的功能。
// 设计测试Point类的应用程序主类，测试并显示输出提供所有功能的结果。
// Math.atan2();Math.sqrt() 方法可返回一个数的平方根
public class test4 {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1, 2, 2);
        System.out.println("x1="+p1.getX()+"\n"+"y1="+p1.getY()+"\n"
                +"x2="+p1.getX2()+"\n"+"y2="+p1.getY2());
        System.out.println("两点距离为："+String.format("%.2f",p1.getDistance()));
        p1.getPolar();
        System.out.println("已创建的Point类对象有："+Point.getCount()+"个");

        Point p2 = new Point();
        System.out.println("已创建的Point类对象有："+Point.getCount()+"个");
        p2.setX(3);
        p2.setY(3);
        p2.setX2(4);
        p2.setY2(4);
        System.out.println("x1="+p2.getX()+"\n"+"y1="+p2.getY()+"\n"
                +"x2="+p2.getX2()+"\n"+"y2="+p2.getY2());
        System.out.println("两点距离为："+String.format("%.2f",p2.getDistance()));
        p2.getPolar();
        System.out.println("已创建的Point类对象有："+Point.getCount()+"个");
    }
}
