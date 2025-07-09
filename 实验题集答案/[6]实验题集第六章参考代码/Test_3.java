import java.awt.*;
import java.awt.event.*;
public class Test_3 extends Frame {
			
				Label l1,l2,l3;
				Button b1,b2,b3,b4,b5,b6;
				TextField tf1,tf2,tf3;
				int count1,count2,count3;
				Color c;
				private class changeText implements	ActionListener,TextListener
				{
					public void actionPerformed(ActionEvent e){
						if(e.getSource()==b1){tf1.setText((count1++)+"");}
						if(e.getSource()==b2){tf2.setText((count2++)+"");}
						if(e.getSource()==b3){tf3.setText((count3++)+"");}
						if(e.getSource()==b4){tf1.setText((count1--)+"");}
						if(e.getSource()==b5){tf2.setText((count2--)+"");}
						if(e.getSource()==b6){tf3.setText((count3--)+"");}
						int c1=Integer.parseInt(tf1.getText());
						int c2=Integer.parseInt(tf2.getText());
						int c3=Integer.parseInt(tf3.getText());
						if(c1>=255) {c1=0;count1=0;}
						if(c2>=255) {c2=0;count2=0;}
						if(c3>=255) {c3=0;count3=0;}
						c=new Color(c1,c2,c3);
						p1.setBackground(c);
					}
					public void textValueChanged(TextEvent e) {
						c=new Color(Integer.parseInt(tf1.getText()),Integer.parseInt(tf2.getText()),Integer.parseInt(tf3.getText()));
						p1.setBackground(c);
					}	
				}
				Panel p=new Panel();
				Panel p1=new Panel();
				GridBagLayout gbl=new  GridBagLayout();
				GridBagConstraints gbc=new GridBagConstraints();
				public Test_3()
				{
					
					setSize(500, 400);
					p.setLayout(gbl);
					gbc.fill=GridBagConstraints.BOTH;
					this.setLabel();
					this.setButton_add();
					this.setTxetField();
					this.setButton_sub();
					this.setPanel();
					add(p);
					setVisible(true);
					this.addWindowListener(new WindowAdapter() {
						public void windowClosing(WindowEvent e)
						{
							System.exit(0);
						}
					});
				}
				private void setPanel() {
					gbc.weightx=10;
					gbc.weighty=10;
					gbc.gridx=0;
					gbc.gridy=4;
					gbc.gridwidth=4;
					gbc.insets=new Insets(10,10,10,10);
					p1.setBackground(new Color(220,220,220));
					gbl.setConstraints(p1, gbc);
					p.add(p1);
					
				}
				private void setButton_sub() {
					b4=new Button("-");
					b5=new Button("-");
					b6=new Button("-");
				    b4.setFont(new Font("宋体",Font.PLAIN,20));
				    b5.setFont(new Font("宋体",Font.PLAIN,20));
				    b6.setFont(new Font("宋体",Font.PLAIN,20));
					gbc.gridx=3;
					gbc.gridy=0;
					gbl.setConstraints(b4, gbc);
					gbc.gridy=1;
					gbl.setConstraints(b5, gbc);
					gbc.gridy=2;
					gbl.setConstraints(b6, gbc);
					p.add(b4);
					p.add(b5);
					p.add(b6);
					b4.addActionListener(new changeText());
					b5.addActionListener(new changeText());
					b6.addActionListener(new changeText());
					
				}
				private void setTxetField(){
					tf1=new TextField(5);
					tf2=new TextField(5);
					tf3=new TextField(5);
					tf1.setText("220");
					
					tf2.setText("220");
					tf3.setText("220");
					count1=Integer.parseInt(tf1.getText());
					count2=Integer.parseInt(tf1.getText());
					count3=Integer.parseInt(tf1.getText());
					gbc.weightx=1;
					gbc.weighty=1;
					gbc.gridx=2;
					gbc.gridy=0;
					gbl.setConstraints(tf1, gbc);
					gbc.gridy=1;
					gbl.setConstraints(tf2, gbc);
					gbc.gridy=2;
					gbl.setConstraints(tf3, gbc);
					p.add(tf1);
					p.add(tf2);
					p.add(tf3);
					tf1.addTextListener(new changeText());
					tf2.addTextListener(new changeText());
					tf3.addTextListener(new changeText());
					this.setKeyPress(tf1);
					this.setKeyPress(tf2);
					this.setKeyPress(tf3);
				}
				private void setKeyPress(TextField tf)
				{
					tf.addKeyListener(new KeyAdapter() {
						public void keyPressed(KeyEvent e)
						{
							char ch = e.getKeyChar();
							if(!(ch>='0'&&ch<='9'))
							{
								e.consume();
							}
						}
					});
				}
				private void setButton_add() {	
					b1=new Button("+");
					b2=new Button("+");
					b3=new Button("+");
				    b1.setFont(new Font("宋体",Font.PLAIN,20));
				    b2.setFont(new Font("宋体",Font.PLAIN,20));
				    b3.setFont(new Font("宋体",Font.PLAIN,20));
					gbc.insets=new Insets(10,80,10,10);
					gbc.gridx=1;
					gbc.gridy=0;
					gbc.weightx=1;
					gbc.weighty=1;
					gbl.setConstraints(b1, gbc);
					gbc.gridy=1;
					gbl.setConstraints(b2, gbc);
					gbc.gridy=2;
					gbl.setConstraints(b3, gbc);
					p.add(b1);
					p.add(b2);
					p.add(b3);
					b1.addActionListener(new changeText());
					b2.addActionListener(new changeText());
					b3.addActionListener(new changeText());
				}
				private void setLabel()
				{	
					l1=new Label("红色",Label.CENTER);
					l2=new Label("绿色",Label.CENTER);
					l3=new Label("蓝色",Label.CENTER);
					l1.setBackground(Color.RED);
					l2.setBackground(Color.GREEN);
					l3.setBackground(Color.BLUE);
					gbc.gridx=0;
					gbc.gridy=0;
					gbc.weightx=1;
					gbc.weighty=1;
					gbc.insets=new Insets(10,10,10,10);
					gbl.setConstraints(l1, gbc);
					gbc.gridy=1;
					gbl.setConstraints(l2, gbc);
					gbc.gridy=2;
					gbl.setConstraints(l3, gbc);
					p.add(l1);
					p.add(l2);
					p.add(l3);
				}

			
			public static void main(String[] args) {
				{
					new Test_3();
				}
			}
}
//GridBagConstraints.insets： 此字段指定组件的外部填充，即组件与其显示区域边缘之间间距的最小量。
