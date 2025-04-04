package com.yskye.work1.test2;
// 首先定义一个计算二维坐标系中圆面积的类circleClass，
// 要求类中有一个定义圆心座标,圆上一点座标的构造方法，以及一个通过圆上一点座标与圆心座标计算圆面积的方法area。
// 然后，通过上述类生成两个圆对象circle1、circle2进行测试：一个圆心、圆上一点座标分别为(0,0)、(8.5,9)，
// 另一个圆心、圆上一点座标分别为(2,3.5)、(9,6)，并分别显示各自面积，两位小数。
// Math.pow(x底数,y几次方) ,x 的 y 次幂
public class test2 {
    public static void main(String[] args) {
        CircleClass circle1=new CircleClass(0,0,8.5,9);
        System.out.println("circle1的圆面积是：" + circle1.area());

        CircleClass circle2=new CircleClass(2,3.5,9,6);
        System.out.println("circle2的圆面积是：" + circle2.area());
    }
}
