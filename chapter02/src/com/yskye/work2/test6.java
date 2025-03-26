package com.yskye.work2;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n>1){
            if(n%2==1){
                n=n*3+1;
            }
            else{
                n/=2;
            }
        }
        System.out.println(n);
    }
}
