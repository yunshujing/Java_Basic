package com.yskye.work1;
//使用LinkedList实现一个模拟KTV点歌系统的程序
import java.util.LinkedList;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        // 创建LinkedList存储歌曲
        LinkedList<String> songs = new LinkedList<>();
        
        // 初始化歌曲列表
        songs.add("关不上的窗-周传雄");
        songs.add("李白-李荣浩");
        songs.add("安和桥-宋东野");
        songs.add("当你老了-赵照");
        songs.add("父亲写的散文诗-李健");
        songs.add("再度重相逢-孙露");
        songs.add("男孩-梁博");
        songs.add("成都-赵雷");
        
        Scanner scanner = new Scanner(System.in);
        String choice = "";
        
        while (!choice.equalsIgnoreCase("D")) {
            // 显示欢迎界面
            System.out.println("----------------------欢迎来到点歌系统----------------------");
            System.out.println("A.添加歌曲到列表");
            System.out.println("B.将歌曲置顶");
            System.out.println("C.将歌曲前移一位");
            System.out.println("D.退出");
            System.out.println("初始歌曲集:");
            for (int i = 0; i < songs.size(); i++) {
                System.out.println(i + ": " + songs.get(i));
            }
            
            // 获取用户输入
            System.out.print("请输入要执行的序号 [A-D]：");
            choice = scanner.nextLine();
            
            if (choice.equalsIgnoreCase("A")) {
                System.out.print("请输入要添加的歌曲名称：");
                String songName = scanner.nextLine();
                songs.add(songName);
                System.out.println("已添加歌曲：" + songName);
                System.out.println("当前歌曲列表:");
                for (int i = 0; i < songs.size(); i++) {
                    System.out.println(i + ": " + songs.get(i));
                }
                
            } else if (choice.equalsIgnoreCase("B")) {
                System.out.print("请输入要置顶的歌曲序号：");
                try {
                    int index = Integer.parseInt(scanner.nextLine());
                    if (index >= 0 && index < songs.size()) {
                        String song = songs.remove(index);
                        songs.addFirst(song);
                        System.out.println("已将歌曲" + song + "置顶");
                        System.out.println("当前歌曲列表:");
                        for (int i = 0; i < songs.size(); i++) {
                            System.out.println(i + ": " + songs.get(i));
                        }
                    } else {
                        System.out.println("无效的歌曲序号！");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("请输入有效的数字！");
                }
                
            } else if (choice.equalsIgnoreCase("C")) {
                System.out.print("请输入要前移的歌曲序号：");
                try {
                    int index = Integer.parseInt(scanner.nextLine());
                    if (index > 0 && index < songs.size()) {
                        String song = songs.remove(index);
                        songs.add(index - 1, song);
                        System.out.println("已将歌曲" + song + "置前一位");
                        System.out.println("当前歌曲列表:");
                        for (int i = 0; i < songs.size(); i++) {
                            System.out.println(i + ": " + songs.get(i));
                        }
                    } else if (index == 0) {
                        System.out.println("该歌曲已经在最前面，无法前移！");
                    } else {
                        System.out.println("无效的歌曲序号！");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("请输入有效的数字！");
                }
                
            } else if (choice.equalsIgnoreCase("D")) {
                System.out.println("------------------------退出------------------------");
                System.out.println("您已退出系统");
            } else {
                System.out.println("无效的选择，请重新输入！");
            }
        }
        
        scanner.close();
    }
}
