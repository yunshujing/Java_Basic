package com.yskye.work3;

import java.util.Random;
import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(10); // [0, 10)内的随机整数

        Scanner sc = new Scanner(System.in);
        int g;

        System.out.println("想好了一个0到9的数字。来猜吧！");

        // 循环直到猜对
        do {
            System.out.print("输入猜测：");
            while (!sc.hasNextInt()) { // 确保输入为整数
                System.out.print("请输入有效的整数：");
                sc.next(); // 若输入非整数，则忽略并请求重新输入
            }
            g = sc.nextInt();

            if (g > num) {
                System.out.println("大了！");
            } else if (g < num) {
                System.out.println("小了！");
            } else {
                System.out.println("答对了！");
            }
        } while (g != num);
    }
}
