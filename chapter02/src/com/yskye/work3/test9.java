package com.yskye.work3;

import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(i > 0 && i<n-1) {
                System.out.print("*");
                for (int j = 1; j < n-2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            else {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
}
