package com.Yskye.work3;

public class test11 {
    public static void main(String[] args) {
        int n = 10; // 杨辉三角形的行数
        int[][] yh = new int[n][];

        // 构建杨辉三角形
        for (int i = 0; i < n; i++) {
            yh[i] = new int[i + 1];
            yh[i][0] = yh[i][i] = 1; // 第一个和最后一个元素总是1

            for (int j = 1; j < i; j++) {
                yh[i][j] = yh[i - 1][j - 1] + yh[i - 1][j];
            }
        }

        // 打印杨辉三角形
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(yh[i][j] + " ");
            }
            System.out.println();
        }
    }
}
