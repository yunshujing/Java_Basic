package com.yskye.work2;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input = sc.nextLine();
        input = input.replaceAll("\\s+", " ");
        input = input.trim();
        if (input.isEmpty()) {
            System.out.println("输入的字符串为空，请重新输入。");
            return;
        }
        String[] numbers = input.split(" ");
        int[] nums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = Integer.parseInt(numbers[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
        }
        System.out.println("升序排序后的字符串为：" + sb.toString());

    }
}
