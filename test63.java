
public void createGUI() {
    frame = new JFrame("计算器");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(250, 350);
    frame.setLayout(null);

    // 创建菜单栏
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("文件(F)");
    JMenuItem exitItem = new JMenuItem("退出(X)");
    exitItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });
    fileMenu.add(exitItem);
    menuBar.add(fileMenu);
    frame.setJMenuBar(menuBar);

    // 创建显示结果的文本框
    textField = new JTextField();
    textField.setBounds(10, 40, 220, 30);
    textField.setEditable(false);
    frame.add(textField);

    // 创建功能按钮
    String[] functionButtons = {"MC", "MR", "MS", "M+", "M-", "←", "CE", "C", "±", "√"};
    int x = 10, y = 80;
    for (String btnText : functionButtons) {
        JButton button = new JButton(btnText);
        button.setBounds(x, y, 50, 30);
        button.addActionListener(new ButtonClickListener());
        frame.add(button);
        x += 55;
        if (x >= 220) {
            x = 10;
            y += 35;
        }
    }

    // 创建数字按钮
    String[] numberButtons = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "0"};
    x = 10; y = 175;
    for (int i = 0; i < numberButtons.length; i++) {
        JButton button = new JButton(numberButtons[i]);
        button.setBounds(x, y, 50, 50);
        button.addActionListener(new ButtonClickListener());
        frame.add(button);
        x += 60;
        if ((i + 1) % 3 == 0) {
            x = 10;
            y += 60;
        }
    }

    // 创建操作按钮
    String[] operatorButtons = {"/", "%", "*", "1/x", "-", "+", "."};
    x = 190; y = 80;
    for (String op : operatorButtons) {
        JButton button = new JButton(op);
        button.setBounds(x, y, 50, 50);
        button.addActionListener(new ButtonClickListener());
        frame.add(button);
        y += 60;
    }

    // 创建等于按钮
    JButton equalButton = new JButton("=");
    equalButton.setBounds(190, 260, 50, 50);
    equalButton.addActionListener(new ButtonClickListener());
    frame.add(equalButton);

    frame.setVisible(true);
}

private class ButtonClickListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        if (command.matches("[0-9]")) {
            textField.setText(textField.getText() + command);
        } else if (command.equals("C")) {
            textField.setText("");
            num1 = 0;
            num2 = 0;
            operator = "";
        } else if (command.equals("=")) {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case "+":
                    textField.setText(String.valueOf(num1 + num2));
                    break;
                case "-":
                    textField.setText(String.valueOf(num1 - num2));
                    break;
                case "*":
                    textField.setText(String.valueOf(num1 * num2));
                    break;
                case "/":
                    if (num2 != 0) {
                        textField.setText(String.valueOf(num1 / num2));
                    } else {
                        textField.setText("Error");
                    }
                    break;
            }
            num1 = 0;
            num2 = 0;
            operator = "";
        } else {
            if (!textField.getText().isEmpty()) {
                num1 = Double.parseDouble(textField.getText());
                operator = command;
                textField.setText("");
            }
        }
        
        // 处理新增功能按钮
        switch (command) {
            case "MC":
                // Memory Clear
                break;
            case "MR":
                // Memory Recall
                break;
            case "MS":
                // Memory Store
                break;
            case "M+":
                // Memory Add
                break;
            case "M-":
                // Memory Subtract
                break;
            case "←":
                // Backspace
                String text = textField.getText();
                if (!text.isEmpty()) {
                    textField.setText(text.substring(0, text.length() - 1));
                }
                break;
            case "CE":
                // Clear Entry
                textField.setText("");
                break;
            case "±":
                // Change sign
                try {
                    double value = Double.parseDouble(textField.getText());
                    textField.setText(String.valueOf(-value));
                } catch (NumberFormatException ex) {
                    // Ignore if not a valid number
                }
                break;
            case "√":
                // Square root
                try {
                    double value = Double.parseDouble(textField.getText());
                    textField.setText(String.valueOf(Math.sqrt(value)));
                } catch (NumberFormatException ex) {
                    // Ignore if not a valid number
                }
                break;
            case "1/x":
                // Reciprocal
                try {
                    double value = Double.parseDouble(textField.getText());
                    textField.setText(String.valueOf(1 / value));
                } catch (NumberFormatException ex) {
                    // Ignore if not a valid number
                }
                break;
            case "%":
                // Percentage
                try {
                    double value = Double.parseDouble(textField.getText());
                    textField.setText(String.valueOf(value / 100));
                } catch (NumberFormatException ex) {
                    // Ignore if not a valid number
                }
                break;
        }
    }
}
