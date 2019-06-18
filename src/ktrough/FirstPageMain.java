package ktrough;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class FirstPage implements ActionListener
{
	JLabel l1,bg;
	JButton b;
	JFrame jf=new JFrame("Knight's Tour \n");
	
	FirstPage()
	{
		jf.setVisible(true);
		jf.setSize(650,650);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);
		
		JLabel l1=new JLabel("Welcome to Knight's Tour!!! \n");
		
		l1.setFont(new Font("Serif",Font.BOLD,30));
		
		ImageIcon img=new ImageIcon("E:\\knight1.gif");
		bg=new JLabel("",img,JLabel.CENTER);
	
		b=new JButton("CONTINUE");
		b.setFont(new Font("Serif",Font.BOLD,20));
		jf.add(l1); 
		jf.add(b);
		jf.add(bg);
		
		l1.setBounds(130,0,400,200);
		b.setBounds(250,500,150,60);
		bg.setBounds(0,0,600,600);
		
		b.addActionListener(this); 
}
	public void actionPerformed(ActionEvent e)
	{ 
      if(e.getSource()==b)
      {
    	  jf.setVisible(false);
    	  new KT_GUI();
      }
	}
}

public class FirstPageMain 
{
	public static void main(String args[])
	{
			new FirstPage();
	}
}