package com.yskye.work4.test15;
public class test15 {
    public static void main(String[] args){
        circleClass circle1 = new circleClass(3.5);
        circle1.circleArea();circle1.show();

        circleClass circle2 = new circleClass(5.0);
        circle2.circleArea();circle2.show();
    }
}
interface circleInterface{
    double PI = 3.14;
    void circleArea();
}
class circleClass implements circleInterface{
    double r,s;
    circleClass(double r){
        this.r = r;
    }
    public void circleArea(){
        s = PI*r*r;
    }
    void show(){
        System.out.println("面积：" + s);
    }
}
