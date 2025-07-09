package com.yskye.work1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str, substr;
        System.out.println("请输入一个字符串：");
        str = sc.nextLine();
        System.out.println("请输入一个子字符串：");
        substr = sc.nextLine();

        int count = 0;
        List<Integer> positions = new ArrayList<>();
        int index = str.indexOf(substr);
        while (index != -1) {
            positions.add(index);
            count++;
            index = str.indexOf(substr, index + substr.length());
        }
        System.out.println("子字符串\"" + substr + "\"出现的次数: " + count);
        System.out.print("出现的位置: ");
        for (int position : positions) {
            System.out.print(position + " ");
        }
    }
}
