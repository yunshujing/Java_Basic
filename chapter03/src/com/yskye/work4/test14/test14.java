package com.yskye.work4.test14;
public class test14 {
    public static void main(String[] args){
        cfx r = new cfx("长方形",3,2);
        r.parameter();r.area();
        yx c = new yx("圆形","红色",4);
        c.parameter();c.area();
    }
}
abstract class Graphics {
    String name;
    Graphics(String name) {
        this.name = name;
    }
    abstract void parameter();
    abstract void area();
}
class cfx extends Graphics{
    double height,weight;
    cfx(String name,double height,double weight) {
        super(name);
        this.height = height;
        this.weight = weight;
    }
    void parameter() {
        System.out.println(name+" "+"长："+height+" 宽："+weight);
    }
    void area() {
        System.out.println("面积：" + height * weight);
    }
}
class yx extends Graphics{
    String color;
    double r;
    final static double PI = 3.14;
    yx(String name,String color,double r) {
        super(name);
        this.color = color;
        this.r = r;
    }
    void parameter(){
        System.out.println(name+" "+"颜色："+color+" 半径："+r);
    }
    void area(){
        System.out.println("面积："+PI*r*r);
    }
}
