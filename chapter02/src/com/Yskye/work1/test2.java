package com.Yskye.work1;

public class test2 {
    public static void main(String[] args) {
        int[][] k=new int[3][4];
        for(int i=0;i<3;i++)
            for (int j=0;j<4;j++)
                k[i][j] = i * j;
        System.out.println(k[2][3]);
    }
}
