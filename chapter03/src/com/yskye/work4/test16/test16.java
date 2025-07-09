package com.yskye.work4.test16;
public class test16 {
    public static void main(String[] args){
        Square s = new Square(2);
        s.show();

        Circle c = new Circle(3);
        c.show();
    }
}
interface Shape{
    double area(double r);
}
class Square implements Shape{
    double r;
    Square(double r){
        this.r = r;
    }
    public double area(double r){
        return r*r;
    }
    void show(){
        System.out.println("长方形面积：" + area(r));
    }
}
class Circle implements Shape{
    double r;
    final static double PI=3.14;
    Circle(double r){
        this.r = r;
    }
    public double area(double r){
        return PI*r*r;
    }
    void show(){
        System.out.println("圆形面积：" + area(r));
    }
}
