package com.yskye.work3;

import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入矩形的边长:");
        int len = sc.nextInt(); // 矩形的边长

        System.out.println("请输入内边距（从边缘到内部空间的距离）:");
        int padding = sc.nextInt(); // 内边距

        // 输出空心矩形
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                // 判断是否在矩形的边界上或内边距范围内
                if (i == 0 || i == len - 1 || j == 0 || j == len - 1 ||
                        i < padding || i >= len - padding || j < padding || j >= len - padding) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
