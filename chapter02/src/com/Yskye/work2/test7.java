package com.Yskye.work2;

public class test7 {
    public static void main(String[] args) {
        int[] cnt=new int[13];
        for (int i = 0; i < 3600; i++) {
            int a1=(int) (Math.random()*6+1);
            int a2=(int) (Math.random()*6+1);
            int sum=a1+a2;
            cnt[sum]++;
        }
        for (int i = 2; i < 13; i++) {
            System.out.println(cnt[i]);
        }
    }
}
