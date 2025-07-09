package com.yskye.work3;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // 显示菜单
            System.out.println("请选择操作【请用大写字母】：");
            System.out.println("A:记事本");
            System.out.println("B:重启计算机");
            System.out.println("C:启动QQ");
            System.out.println("D:查看系统属性");
            System.out.println("G:退出");

            String choice = scanner.nextLine();

            // 处理用户输入
            switch (choice) {
                case "A":
                    // 调用api打开记事本代码
                    try {
                        Runtime.getRuntime().exec("notepad");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case "B":
                    // 调用api重启计算机
                    try {
                        Runtime.getRuntime().exec("shutdown -r -t 0");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case "C":
                    // 调用api启动QQ
                    try {
                        Runtime.getRuntime().exec("C:\\Program Files\\Tencent\\QQ\\Bin\\QQScLauncher.exe");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case "D":
                    // 查看系统属性
                    showSystemProperties();
                    break;
                case "G":
                    System.out.println("退出程序");
                    return;
                default:
                    System.out.println("无效的选择，请重新输入！");
            }
        }
    }

    // 展示系统属性的方法
    private static void showSystemProperties() {
        System.out.println("java.runtime.name---->" + System.getProperty("java.runtime.name"));
        System.out.println("sun.boot.library.path--->" + System.getProperty("sun.boot.library.path"));
        System.out.println("java.vm.version--->" + System.getProperty("java.vm.version"));
        System.out.println("java.vm.vendor---->" + System.getProperty("java.vm.vendor"));
        System.out.println("java.vendor.url--->" + System.getProperty("java.vendor.url"));
    }
}