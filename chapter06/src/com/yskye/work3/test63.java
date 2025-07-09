package com.yskye.work3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class test63 {
    private JFrame frame;
    private JTextField textField;
    private double num1 = 0, num2 = 0, memory = 0;
    private String operator = "";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new test63().createGUI());
    }

    public void createGUI() {
        frame = new JFrame("计算器");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        // 菜单
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("文件(F)");
        fileMenu.add(new JMenuItem("退出(X)")).addActionListener(e -> System.exit(0));
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        // 显示屏
        textField = new JTextField("0");
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setFont(new Font("Arial", Font.BOLD, 18));
        textField.setBorder(BorderFactory.createLoweredBevelBorder());

        // 按钮面板
        JPanel buttonPanel = new JPanel(new BorderLayout(5, 5));
        
        // 功能按钮
        JPanel topPanel = new JPanel(new GridLayout(2, 5, 3, 3));
        addButtons(topPanel, new String[]{"MC", "MR", "MS", "M+", "M-", "←", "CE", "C", "±", "√"});
        
        // 主按钮区
        JPanel centerPanel = new JPanel(new BorderLayout(3, 3));
        JPanel numPanel = new JPanel(new GridLayout(4, 3, 3, 3));
        addButtons(numPanel, new String[]{"7", "8", "9", "4", "5", "6", "1", "2", "3", "0", "", "."});
        
        JPanel opPanel = new JPanel(new GridLayout(7, 1, 3, 3));
        addButtons(opPanel, new String[]{"/", "%", "*", "1/x", "-", "+", "="});
        
        centerPanel.add(numPanel, BorderLayout.CENTER);
        centerPanel.add(opPanel, BorderLayout.EAST);
        buttonPanel.add(topPanel, BorderLayout.NORTH);
        buttonPanel.add(centerPanel, BorderLayout.CENTER);

        // 主面板
        JPanel mainPanel = new JPanel(new BorderLayout(5, 5));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(textField, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        frame.add(mainPanel);
        frame.setVisible(true);
    }

    private void addButtons(JPanel panel, String[] texts) {
        for (String text : texts) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 12));
            btn.setBorder(BorderFactory.createRaisedBevelBorder());
            btn.setFocusPainted(false);
            if (text.isEmpty()) {
                btn.setEnabled(false);
            } else {
                btn.addActionListener(this::buttonClick);
            }
            panel.add(btn);
        }
    }

    private void buttonClick(ActionEvent e) {
        String cmd = e.getActionCommand();
        String text = textField.getText();
        
        try {
            if (cmd.matches("[0-9]")) {
                textField.setText(text.equals("0") ? cmd : text + cmd);
            } else if (cmd.equals(".") && !text.contains(".")) {
                textField.setText(text + ".");
            } else if (cmd.matches("[+\\-*/]")) {
                if (!operator.isEmpty()) calculate();
                num1 = Double.parseDouble(text);
                operator = cmd;
                textField.setText("0");
            } else {
                switch (cmd) {
                    case "C": reset(); break;
                    case "CE": textField.setText("0"); break;
                    case "←": 
                        textField.setText(text.length() > 1 ? text.substring(0, text.length() - 1) : "0"); 
                        break;
                    case "=": if (!operator.isEmpty()) { calculate(); operator = ""; } break;
                    case "±": textField.setText(String.valueOf(-Double.parseDouble(text))); break;
                    case "√": textField.setText(String.valueOf(Math.sqrt(Double.parseDouble(text)))); break;
                    case "1/x": textField.setText(String.valueOf(1.0 / Double.parseDouble(text))); break;
                    case "%": textField.setText(String.valueOf(Double.parseDouble(text) / 100)); break;
                    case "MC": memory = 0; break;
                    case "MR": textField.setText(String.valueOf(memory)); break;
                    case "MS": memory = Double.parseDouble(text); break;
                    case "M+": memory += Double.parseDouble(text); break;
                    case "M-": memory -= Double.parseDouble(text); break;
                }
            }
        } catch (Exception ex) {
            textField.setText("错误");
        }
    }

    private void calculate() {
        try {
            num2 = Double.parseDouble(textField.getText());
            double result = 0;
            switch (operator) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": 
                    if (num2 == 0) throw new ArithmeticException();
                    result = num1 / num2; 
                    break;
            }
            textField.setText(result == (long) result ? String.valueOf((long) result) : String.valueOf(result));
            num1 = result;
        } catch (Exception ex) {
            textField.setText("错误");
        }
    }

    private void reset() {
        textField.setText("0");
        num1 = num2 = 0;
        operator = "";
    }
}