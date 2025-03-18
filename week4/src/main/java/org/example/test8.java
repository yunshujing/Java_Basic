package org.example;

import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入星号数：");
        int n=sc.nextInt();

        System.out.println("方法一:");
        play1(n);

        System.out.println("方法二:");
        play2(n);

        System.out.println("方法三:");
        play3(n);

        System.out.println("方法四:");
        play4(n);

        System.out.println("方法五:");
        play5(n);
    }
    public static void play1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n-i-1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = i+1; k >0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void play2(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = i+1; k >0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = n-i-1; j > 0; j--) {
                System.out.print("*");
            }
            for (int k = i+1; k >0; k--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void play3(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = i+1; k >0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n-1; i++) {
            for (int k = i+1; k >0; k--) {
                System.out.print(" ");
            }
            for (int j = n-i-1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void play4(int n){
        if (n % 2 == 0) {
            System.out.println("输入的数字需要是奇数！");
            return;
        }
        int half = n / 2;
        for (int i = 0; i <= half; i++) {
            for (int j = 0; j < half - i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void play5(int n){
        if (n % 2 == 0) {
            System.out.println("输入的数字需要是奇数！");
            return;
        }
        int half = n / 2;
        // 上半部分
        for (int i = 0; i <= half; i++) {
            for (int j = 0; j < half - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 下半部分
        for (int i = half - 1; i >= 0; i--) {
            for (int j = 0; j < half - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



