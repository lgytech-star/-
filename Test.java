package gitee;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Test implements ActionListener {
	  JFrame f;
	  Button b;
	public Test() 
	{
		f=new JFrame("Test");
		b=new Button("OK");
		f.setSize(300,400);
		f.setLocationRelativeTo(null);
		b.addActionListener(this);
		f.add(b);
		f.setVisible(true);
	}
	  
	  
	  
	  public static void main(String[] args) {
		
        new Test();
	}

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}

}
