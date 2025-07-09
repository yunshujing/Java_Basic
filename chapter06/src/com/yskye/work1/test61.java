package com.yskye.work1;

import java.awt.*;
import java.awt.event.*;

public class test61 extends Frame implements ActionListener, AdjustmentListener {
    // RGB颜色控制组件
    private TextField redField, greenField, blueField;
    private Button redPlus, redMinus, greenPlus, greenMinus, bluePlus, blueMinus;
    private Panel colorPanel;
    
    // 当前RGB值
    private int redValue = 220;
    private int greenValue = 220;
    private int blueValue = 220;
    
    public test61() {
        setTitle("调色板");
        setSize(320, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        
        // 设置主布局为BorderLayout
        setLayout(new BorderLayout(5, 5));
        
        // 创建控制面板
        Panel controlPanel = createControlPanel();
        add(controlPanel, BorderLayout.NORTH);
        
        // 创建颜色预览面板
        colorPanel = new Panel() {
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                // 确保面板被绘制
                g.setColor(getBackground());
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        colorPanel.setBackground(new Color(redValue, greenValue, blueValue));
        colorPanel.setPreferredSize(new Dimension(280, 220));
        
        // 创建中心容器
        Panel centerContainer = new Panel(new BorderLayout());
        centerContainer.setBackground(Color.LIGHT_GRAY);
        
        // 添加一些边距
        Panel topSpacer = new Panel();
        topSpacer.setPreferredSize(new Dimension(300, 10));
        topSpacer.setBackground(Color.LIGHT_GRAY);
        
        Panel leftSpacer = new Panel();
        leftSpacer.setPreferredSize(new Dimension(15, 200));
        leftSpacer.setBackground(Color.LIGHT_GRAY);
        
        Panel rightSpacer = new Panel();
        rightSpacer.setPreferredSize(new Dimension(15, 200));
        rightSpacer.setBackground(Color.LIGHT_GRAY);
        
        Panel bottomSpacer = new Panel();
        bottomSpacer.setPreferredSize(new Dimension(300, 15));
        bottomSpacer.setBackground(Color.LIGHT_GRAY);
        
        centerContainer.add(topSpacer, BorderLayout.NORTH);
        centerContainer.add(leftSpacer, BorderLayout.WEST);
        centerContainer.add(rightSpacer, BorderLayout.EAST);
        centerContainer.add(bottomSpacer, BorderLayout.SOUTH);
        centerContainer.add(colorPanel, BorderLayout.CENTER);
        
        add(centerContainer, BorderLayout.CENTER);
        
        // 添加窗口关闭事件
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        setVisible(true);
    }
    
    private Panel createControlPanel() {
        Panel mainPanel = new Panel(new GridLayout(4, 1, 5, 8));
        mainPanel.setBackground(Color.LIGHT_GRAY);
        
        // 添加顶部间距
        Panel topSpace = new Panel();
        topSpace.setPreferredSize(new Dimension(300, 10));
        topSpace.setBackground(Color.LIGHT_GRAY);
        mainPanel.add(topSpace);
        
        // 创建红色控制行
        Panel redPanel = createColorControlRow("RED", Color.RED);
        redField = (TextField) getTextFieldFromPanel(redPanel);
        redField.setText(String.valueOf(redValue));
        redPlus = (Button) getButtonFromPanel(redPanel, "+");
        redMinus = (Button) getButtonFromPanel(redPanel, "-");
        
        // 创建绿色控制行
        Panel greenPanel = createColorControlRow("GREEN", Color.GREEN);
        greenField = (TextField) getTextFieldFromPanel(greenPanel);
        greenField.setText(String.valueOf(greenValue));
        greenPlus = (Button) getButtonFromPanel(greenPanel, "+");
        greenMinus = (Button) getButtonFromPanel(greenPanel, "-");
        
        // 创建蓝色控制行
        Panel bluePanel = createColorControlRow("BLUE", Color.BLUE);
        blueField = (TextField) getTextFieldFromPanel(bluePanel);
        blueField.setText(String.valueOf(blueValue));
        bluePlus = (Button) getButtonFromPanel(bluePanel, "+");
        blueMinus = (Button) getButtonFromPanel(bluePanel, "-");
        
        mainPanel.add(redPanel);
        mainPanel.add(greenPanel);
        mainPanel.add(bluePanel);
        
        return mainPanel;
    }
    
    private Panel createColorControlRow(String colorName, Color labelColor) {
        Panel rowPanel = new Panel(new FlowLayout(FlowLayout.CENTER, 8, 5));
        rowPanel.setBackground(Color.LIGHT_GRAY);
        
        // 颜色标签
        Label colorLabel = new Label(colorName);
        colorLabel.setBackground(labelColor);
        colorLabel.setForeground(Color.WHITE);
        colorLabel.setPreferredSize(new Dimension(60, 28));
        colorLabel.setAlignment(Label.CENTER);
        colorLabel.setFont(new Font("Dialog", Font.BOLD, 12));
        
        // 加号按钮
        Button plusButton = new Button("+");
        plusButton.setPreferredSize(new Dimension(30, 28));
        plusButton.setFont(new Font("Dialog", Font.BOLD, 14));
        plusButton.addActionListener(this);
        
        // 数值文本框
        TextField valueField = new TextField("220", 4);
        valueField.setPreferredSize(new Dimension(50, 28));
        valueField.setFont(new Font("Dialog", Font.PLAIN, 12));
        valueField.addActionListener(this);
        
        // 减号按钮
        Button minusButton = new Button("-");
        minusButton.setPreferredSize(new Dimension(30, 28));
        minusButton.setFont(new Font("Dialog", Font.BOLD, 14));
        minusButton.addActionListener(this);
        
        rowPanel.add(colorLabel);
        rowPanel.add(plusButton);
        rowPanel.add(valueField);
        rowPanel.add(minusButton);
        
        return rowPanel;
    }
    
    private TextField getTextFieldFromPanel(Panel panel) {
        for (Component comp : panel.getComponents()) {
            if (comp instanceof TextField) {
                return (TextField) comp;
            }
        }
        return null;
    }
    
    private Button getButtonFromPanel(Panel panel, String text) {
        for (Component comp : panel.getComponents()) {
            if (comp instanceof Button && ((Button) comp).getLabel().equals(text)) {
                return (Button) comp;
            }
        }
        return null;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        // 处理按钮点击
        if (source == redPlus) {
            changeColorValue("red", 1);
        } else if (source == redMinus) {
            changeColorValue("red", -1);
        } else if (source == greenPlus) {
            changeColorValue("green", 1);
        } else if (source == greenMinus) {
            changeColorValue("green", -1);
        } else if (source == bluePlus) {
            changeColorValue("blue", 1);
        } else if (source == blueMinus) {
            changeColorValue("blue", -1);
        }
        
        // 处理文本框输入
        if (source == redField) {
            updateColorFromTextField("red");
        } else if (source == greenField) {
            updateColorFromTextField("green");
        } else if (source == blueField) {
            updateColorFromTextField("blue");
        }
    }
    
    private void changeColorValue(String color, int delta) {
        switch (color) {
            case "red":
                redValue = Math.max(0, Math.min(255, redValue + delta));
                redField.setText(String.valueOf(redValue));
                break;
            case "green":
                greenValue = Math.max(0, Math.min(255, greenValue + delta));
                greenField.setText(String.valueOf(greenValue));
                break;
            case "blue":
                blueValue = Math.max(0, Math.min(255, blueValue + delta));
                blueField.setText(String.valueOf(blueValue));
                break;
        }
        updateColorPanel();
    }
    
    private void updateColorFromTextField(String color) {
        try {
            int value;
            switch (color) {
                case "red":
                    value = Integer.parseInt(redField.getText());
                    redValue = Math.max(0, Math.min(255, value));
                    redField.setText(String.valueOf(redValue));
                    break;
                case "green":
                    value = Integer.parseInt(greenField.getText());
                    greenValue = Math.max(0, Math.min(255, value));
                    greenField.setText(String.valueOf(greenValue));
                    break;
                case "blue":
                    value = Integer.parseInt(blueField.getText());
                    blueValue = Math.max(0, Math.min(255, value));
                    blueField.setText(String.valueOf(blueValue));
                    break;
            }
            updateColorPanel();
        } catch (NumberFormatException ex) {
            // 如果输入无效，恢复原值
            redField.setText(String.valueOf(redValue));
            greenField.setText(String.valueOf(greenValue));
            blueField.setText(String.valueOf(blueValue));
        }
    }
    
    private void updateColorPanel() {
        if (colorPanel != null) {
            colorPanel.setBackground(new Color(redValue, greenValue, blueValue));
            colorPanel.repaint();
        }
    }
    
    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        // 这个方法是为了实现AdjustmentListener接口，这里不需要使用
    }
    
    public static void main(String[] args) {
        new test61();
    }
}
