import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.*;

class Test extends JPanel {

	JButton btn;
	Color btnDefault;
	Color btnSecond = new Color(234,56,120);
	
	public Test()
	{
		super();
		btn = new JButton("OK");
	
		btnDefault = btn.getBackground();
		btn.addActionListener(new ActionListener(){
						public void actionPerformed(java.awt.event.ActionEvent e) 
						{
							if(btn.getBackground().equals(btnDefault))
								btn.setBackground(btnSecond);
							else
								btn.setBackground(btnDefault);
						}
						});
		
		this.add(btn, BorderLayout.NORTH);
		
	}
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Test");
		Test pnl = new Test();
		f.add(pnl,BorderLayout.NORTH);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100,100,500,500);
		f.setVisible(true);
		
		
		
	}

}