package com.yskye.work2;

import javax.swing.*;
import java.awt.*;

public class test62 {

    public static void main(String[] args) {
        // 创建 JFrame 窗口
        JFrame frame = new JFrame();
        frame.setSize(320, 240); // 设置窗口大小
        frame.setLocation(220, 160); // 设置窗口位置
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置默认关闭操作

        // 设置 JFrame 的背景颜色为蓝色
        frame.getContentPane().setBackground(new Color(0, 204, 255));

        // 使用 FlowLayout 布局管理器（这里简化布局，实际应使用更精确的布局如 AbsoluteLayout）
        frame.setLayout(null);

        // 创建并配置按钮
        JButton redButton = new JButton("红色");
        redButton.setBounds(20, 10, 80, 40); // 修改：y坐标从20改为10
        redButton.setBackground(Color.RED);

        JButton greenButton = new JButton("绿色");
        greenButton.setBounds(120, 10, 80, 40); // 修改：y坐标从20改为10
        greenButton.setBackground(Color.GREEN);

        JButton blueButton = new JButton("蓝色");
        blueButton.setBounds(220, 10, 80, 40); // 修改：y坐标从20改为10
        blueButton.setBackground(Color.BLUE);

        // 将按钮添加到窗口
        frame.add(redButton);
        frame.add(greenButton);
        frame.add(blueButton);

        // 添加按钮点击事件监听器
        redButton.addActionListener(e -> {
            Color currentColor = frame.getContentPane().getBackground();
            int r = (currentColor.getRed() + 10) % 256; // 超过 255 时重置为 0
            frame.getContentPane().setBackground(new Color(r, currentColor.getGreen(), currentColor.getBlue()));
        });

        greenButton.addActionListener(e -> {
            Color currentColor = frame.getContentPane().getBackground();
            int g = (currentColor.getGreen() + 10) % 256; // 超过 255 时重置为 0
            frame.getContentPane().setBackground(new Color(currentColor.getRed(), g, currentColor.getBlue()));
        });

        blueButton.addActionListener(e -> {
            Color currentColor = frame.getContentPane().getBackground();
            int b = (currentColor.getBlue() + 10) % 256; // 超过 255 时重置为 0
            frame.getContentPane().setBackground(new Color(currentColor.getRed(), currentColor.getGreen(), b));
        });

        // 新增：创建一个 JPanel 作为下方面板，并设置其初始背景颜色
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBounds(20, 120, 280, 120); // 设置下方面板的位置和大小
        bottomPanel.setBackground(frame.getContentPane().getBackground()); // 初始背景颜色与窗口背景颜色相同
        frame.add(bottomPanel);

        // 更新按钮点击事件监听器，使下方面板颜色同步改变
        redButton.addActionListener(e -> {
            Color currentColor = frame.getContentPane().getBackground();
            int r = (currentColor.getRed() + 10) % 256; // 超过 255 时重置为 0
            Color newColor = new Color(r, currentColor.getGreen(), currentColor.getBlue());
            frame.getContentPane().setBackground(newColor);
            bottomPanel.setBackground(newColor); // 下方面板颜色同步改变
        });

        greenButton.addActionListener(e -> {
            Color currentColor = frame.getContentPane().getBackground();
            int g = (currentColor.getGreen() + 10) % 256; // 超过 255 时重置为 0
            Color newColor = new Color(currentColor.getRed(), g, currentColor.getBlue());
            frame.getContentPane().setBackground(newColor);
            bottomPanel.setBackground(newColor); // 下方面板颜色同步改变
        });

        blueButton.addActionListener(e -> {
            Color currentColor = frame.getContentPane().getBackground();
            int b = (currentColor.getBlue() + 10) % 256; // 超过 255 时重置为 0
            Color newColor = new Color(currentColor.getRed(), currentColor.getGreen(), b);
            frame.getContentPane().setBackground(newColor);
            bottomPanel.setBackground(newColor); // 下方面板颜色同步改变
        });

        // 显示窗口
        frame.setVisible(true);
    }
}