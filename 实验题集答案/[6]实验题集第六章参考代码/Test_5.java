import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;
public class calculateTest {
private JFrame frame;
private JButton button_point,button8,button7,button9,button_div,button4,button5,button6,button_mul,button1,button2,button3,button0,button_equ,button_sub,button_add;
private JTextField textField,textField_1;
StringBuffer str=new StringBuffer();
StringBuffer str1=new StringBuffer();
private int sum;
private int count=0;
private double sum1;
private class change implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			
			if(e.getSource()==button0)
			{str.append("0");str1.append("0");textField.setText(str1.toString());}
			if(e.getSource()==button1)
			{str.append("1");str1.append("1");textField.setText(str1.toString());}
			if(e.getSource()==button2)
			{str.append("2");str1.append("2");textField.setText(str1.toString());}
			if(e.getSource()==button3)
			{str.append("3");str1.append("3");textField.setText(str1.toString());}
			if(e.getSource()==button4)
			{str.append("4");str1.append("4");textField.setText(str1.toString());}
			if(e.getSource()==button5)
			{str.append("5");str1.append("5");textField.setText(str1.toString());}
			if(e.getSource()==button6)
			{str.append("6");str1.append("6");textField.setText(str1.toString());}
			if(e.getSource()==button7)
			{str.append("7");str1.append("7");textField.setText(str1.toString());}
			if(e.getSource()==button8)
			{str.append("8");str1.append("8");textField.setText(str1.toString());}
			if(e.getSource()==button9)
			{str.append("9");str1.append("9");textField.setText(str1.toString());}
			if(e.getSource()==button_point)
			{str.append(".");str1.append(".");textField.setText(str1.toString());}
			if(e.getSource()==button_equ)
			{
				String s=str.toString();
				count=0;
				if(s.contains("+"))
				{
					String[] arr=s.split("\\+");
					sum=Integer.parseInt(arr[0])+Integer.parseInt(arr[1]);
					textField_1.setText(sum+"");
					str.delete(0, str.length());
					str1.delete(0, str1.length());
				}
				else if(s.contains("-"))
				{
					String[] arr=s.split("\\-");
					sum=Integer.parseInt(arr[0])-Integer.parseInt(arr[1]);
					textField_1.setText(sum+"");
					str.delete(0, str.length());
					str1.delete(0, str1.length());
				}
				else if(s.contains("*"))
				{
					String[] arr=s.split("\\*");
					sum1=Double.parseDouble(arr[0])*Double.parseDouble(arr[1]);
					textField_1.setText(sum1+"");
					str.delete(0, str.length());
					str1.delete(0, str1.length());
				}
				else if(s.contains("÷"))
				{
					String[] arr=s.split("÷");
					if(arr[1].equals("0"))
					{	textField_1.setText("除数不能为0");str.delete(0, str.length());str1.delete(0, str1.length());}
					else
					{sum1=Double.parseDouble(arr[0])/Double.parseDouble(arr[1]);textField_1.setText(sum1+"");str.delete(0, str.length());str1.delete(0, str1.length());}
					
				}
				else
				{
					textField_1.setText(str.toString());
					str.delete(0, str.length());
					str1.delete(0, str1.length());
				}
				sum=0;
			}
		}
	}
public static void main(String[] args) {
					calculateTest window = new calculateTest();
					window.frame.setVisible(true);
	}
public calculateTest()
	{
	initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(323, 405);
		frame.setResizable(false);
		
		frame.getContentPane().setLayout(null);
		
		JMenuBar mb = new JMenuBar();
		mb.setBounds(0, 0, 299, 23);
		frame.getContentPane().add(mb);
		
		JMenu jm1 = new JMenu("查看(V)");
		mb.add(jm1);
		
		JRadioButtonMenuItem jrb1 = new JRadioButtonMenuItem("标准型(T)");

		jm1.add(jrb1);
		
		JRadioButtonMenuItem jrb2 = new JRadioButtonMenuItem("科学型(S)");
		jm1.add(jrb2);
		
		JRadioButtonMenuItem jrb3 = new JRadioButtonMenuItem("程序员(P)");
		jm1.add(jrb3);
		
		JRadioButtonMenuItem jrb4 = new JRadioButtonMenuItem("统计信息(A)");
		jm1.add(jrb4);
		jm1.addSeparator();
		JRadioButtonMenuItem jrb5 = new JRadioButtonMenuItem("历史记录(Y)");
		jm1.add(jrb5);
		
		JRadioButtonMenuItem jrb6 = new JRadioButtonMenuItem("数字分组(I)");
		jm1.add(jrb6);
		jm1.addSeparator();
		JRadioButtonMenuItem jrb7 = new JRadioButtonMenuItem("基本(B)");
		jm1.add(jrb7);
		
		JRadioButtonMenuItem jrb8 = new JRadioButtonMenuItem("单位转换(U)");
		jm1.add(jrb8);
		
		JRadioButtonMenuItem jrb9 = new JRadioButtonMenuItem("日起计算(D)");
		jm1.add(jrb9);
		
		JMenu jm4 = new JMenu("工作表(W)");
		jm1.add(jm4);
		
		JRadioButtonMenuItem jrb10 = new JRadioButtonMenuItem("抵押(M)");
		jm4.add(jrb10);
		
		JRadioButtonMenuItem jrb11 = new JRadioButtonMenuItem("汽车租赁(V)");
		jm4.add(jrb11);
		
		JRadioButtonMenuItem jrb12 = new JRadioButtonMenuItem("油耗(mpg)(F)");
		jm4.add(jrb12);
		
		JRadioButtonMenuItem jrb13 = new JRadioButtonMenuItem("油耗(l/100km)(U)");
		jm4.add(jrb13);
		
		JMenu jm2 = new JMenu("编辑(E)");
		mb.add(jm2);
		
		JMenuItem jmi1 = new JMenuItem("复制(C)");
		jm2.add(jmi1);
		
		JMenuItem jmi2 = new JMenuItem("粘贴(P)");
		jm2.add(jmi2);
		
		JMenu jm5 = new JMenu("历史记录(H)");
		jm2.add(jm5);
		
		JMenuItem jmi3 = new JMenuItem("复制历史记录");
		jm5.add(jmi3);
		
		JMenuItem jmi4 = new JMenuItem("编辑(E)");
		jm5.add(jmi4);
		
		JMenuItem jmi5 = new JMenuItem("取消编辑(N)");
		jm5.add(jmi5);
		
		JMenuItem jmi6 = new JMenuItem("清除(L)");
		jm5.add(jmi6);
		
		JMenu jm3 = new JMenu("帮助(H)");
		mb.add(jm3);
		
		JMenuItem jmi7 = new JMenuItem("查看帮助(V)");
		jm3.add(jmi7);
		
		JMenuItem jmi8 = new JMenuItem("关于计算机(A)");
		jm3.add(jmi8);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 127, 289, 150);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 5, 4, 4));
		
		JButton bMC = new JButton("MC");
		panel.add(bMC);
		
		JButton bMR = new JButton("MR");
		panel.add(bMR);
		
		JButton bMS = new JButton("MS");
		panel.add(bMS);
		
		JButton bM1 = new JButton("M+");
		panel.add(bM1);
		
		JButton bM2 = new JButton("M-");
		panel.add(bM2);
		
		JButton b_delete = new JButton("<—");
		panel.add(b_delete);
		
		JButton bCE = new JButton("CE");
		panel.add(bCE);
		
		JButton bC = new JButton("C");
		panel.add(bC);
		
		JButton b_rev = new JButton("±");
		panel.add(b_rev);
		
		JButton b_sqrt = new JButton("√");
		panel.add(b_sqrt);
		
		button7 = new JButton("7");
		panel.add(button7);
		
		button8 = new JButton("8");
		panel.add(button8);
	
		
		button9 = new JButton("9");
		panel.add(button9);
		button_div = new JButton("/");
		panel.add(button_div);
		
		JButton b_mod = new JButton("%");
		panel.add(b_mod);
		
		button4 = new JButton("4");
		panel.add(button4);
		button5 = new JButton("5");
		panel.add(button5);
		button6 = new JButton("6");
		panel.add(button6);
		button_mul = new JButton("*");
		panel.add(button_mul);
		JButton b_back = new JButton("1/x");
		panel.add(b_back);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(9, 281, 288, 75);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		button1 = new JButton("1");
		button1.setBounds(2, 0, 54, 34);
		panel_1.add(button1);		
		button2 = new JButton("2");
		button2.setBounds(60, 0, 54, 34);
		panel_1.add(button2);
		button3 = new JButton("3");
		button3.setBounds(118, 0, 54, 34);
		panel_1.add(button3);
		button_point = new JButton(".");
		button_point.setBounds(118, 38, 54, 34);
		panel_1.add(button_point);
		
		button0 = new JButton("0");
		button0.setBounds(2, 38, 112, 34);
		panel_1.add(button0);		
		button_equ = new JButton("=");
		button_equ.setBounds(234, 0, 54, 72);
		panel_1.add(button_equ);
		button_equ.addActionListener(new change());
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3) );
		panel_2.setForeground(new Color(0, 0, 0));
		panel_2.setBounds(10, 33, 289, 84);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setEditable(false);
		textField.setBounds(10, 10, 269, 31);
		textField.setBorder(new EmptyBorder(0, 0, 0, 0));
		textField.setFont(new Font("宋体",Font.PLAIN,20));
		panel_2.add(textField);
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setEditable(false);
		textField_1.setBorder(BorderFactory.createEmptyBorder());
		textField_1.setBounds(10, 38, 269, 36);
		textField_1.setFont(new Font("宋体",Font.PLAIN,20));
		textField_1.setText("0");
		panel_2.add(textField_1);
		bC.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("0");
				str.delete(0, str.length());
				str1.delete(0, str1.length());
				count=0;
			}
		});
		button_sub = new JButton("-");
		button_sub.setBounds(176, 0, 54, 34);
		panel_1.add(button_sub);
		button_sub.addActionListener(new change());
		button_add = new JButton("+");
		button_add.setBounds(176, 38, 54, 34);
		panel_1.add(button_add);
		button0.addActionListener(new change());
		button1.addActionListener(new change());
		button2.addActionListener(new change());
		button3.addActionListener(new change());
		button4.addActionListener(new change());
		button5.addActionListener(new change());
		button6.addActionListener(new change());
		button7.addActionListener(new change());
		button8.addActionListener(new change());
		button9.addActionListener(new change());
		button_point.addActionListener(new change());
		button_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				count++;
				str1.append("+");
				textField.setText(str1.toString());
				if(count!=1)
				{
					calculate();
				}
				str.append("+");
			}
		});
		button_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				count++;
				str1.append("-");
				textField.setText(str1.toString());
				if(count!=1)
				{
					calculate();
				}
				str.append("-");
			}
		});
		button_div.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0)
			{
				count++;
				str1.append("÷");
				textField.setText(str1.toString());
				if(count!=1)
				{
					calculate();
				}
				str.append("÷");
			}
		
		});
		button_mul.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0)
			{
				count++;
				str1.append("*");
				textField.setText(str1.toString());
				if(count!=1)
				{
					calculate();
				}
				str.append("*");
			}
		
		});
	}
	public void calculate()
	{
		String s=str.toString();

		if(s.contains("+"))
		{
			String[] arr=s.split("\\+");
			sum=Integer.parseInt(arr[0])+Integer.parseInt(arr[1]);
			textField_1.setText(sum+"");
			str.delete(0, str.length());
			str.append(sum+"");
			count=1;
		}
		else if(s.contains("-"))
		{
			String[] arr=s.split("\\-");
			sum=Integer.parseInt(arr[0])-Integer.parseInt(arr[1]);
			textField_1.setText(sum+"");
			str.delete(0, str.length());
			str.append(sum+"");
			count=1;
			
		}
		else if(s.contains("*"))
		{
			String[] arr=s.split("\\*");
			sum1=Double.parseDouble(arr[0])*Double.parseDouble(arr[1]);
			textField_1.setText(sum1+"");
			str.delete(0,str.length());
			str.append(sum1+"");
			count=1;
		}
		else if(s.contains("÷"))
		{
			String[] arr=s.split("÷");
			if(arr[1].equals("0"))
			{	textField_1.setText("除数不能为0");}
			else
			{sum1=Double.parseDouble(arr[0])/Double.parseDouble(arr[1]);textField_1.setText(sum1+"");	
			str.delete(0,str.length());
			str.append(sum1+"");
			count=1;}
			
		}
	}

}
