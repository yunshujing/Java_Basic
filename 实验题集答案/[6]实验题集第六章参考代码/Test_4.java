
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class Test_4 extends JFrame {
		JButton jb1,jb2,jb3;
		int r=100,g=100,b=255;
		JPanel jp=new JPanel();
		Test_4()
		{
			jp.setBackground(new Color(r,g,b));
			jp.setLayout(null);
			this.setSize(320, 240);
			this.add(jp);
			this.addWindowListener(new WindowAdapter() {
				public void windowClosed(WindowEvent e)
				{
					System.exit(0);
				}
			});
			jb1=new JButton("ºìÉ«");
			jb2=new JButton("ÂÌÉ«");
			jb3=new JButton("À¶É«");
			jb1.setBackground(Color.RED);
			jb2.setBackground(Color.GREEN);
			jb3.setBackground(Color.BLUE);
			jb1.setBounds(20,80,80,40);
			jb2.setBounds(120,80,80,40);
			jb3.setBounds(220,80,80,40);
			jb1.addActionListener(new changeColor());
			jb2.addActionListener(new changeColor());
			jb3.addActionListener(new changeColor());
			jp.add(jb1);
			jp.add(jb2);
			jp.add(jb3);
			this.setVisible(true);
		}
		private class changeColor implements ActionListener
		{

			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==jb1)
				{
					r+=10;
					if(r>255)r=0;
					jp.setBackground(new Color(r,g,b));
				}
				if(e.getSource()==jb2)
				{
					g+=10;
					if(g>255)
						g=0;
					jp.setBackground(new Color(r,g,b));
				}
				if(e.getSource()==jb3)
				{
					b+=10;
					if(b>255)
						b=0;
					jp.setBackground(new Color(r,g,b));
				}
			}
			
		}
	


public static void main(String[] args) { 
		new Test_4();
	}
}