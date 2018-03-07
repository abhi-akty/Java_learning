//class ButtonTest
import javax.swing.*;
import java.awt.event.*;


class ButtonTest implements ActionListener 
{
	JFrame fr;
	JLabel lb;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
	int count=0;
	
	ButtonTest()
	{
		fr=new JFrame ("Button Test");
		fr.setLayout(null);
		lb=new JLabel();

		b1=new JButton ("First");
		b2=new JButton ("Second");
		b3=new JButton ("Third");
		b4=new JButton ("Fourth");
		b5=new JButton ("Fifth");
		b6=new JButton ("Sixth");
		b7=new JButton ("Seventh");
		b8=new JButton ("Eighth");
		b9=new JButton ("Ninth");
		b10=new JButton ("Prev");
		b11=new JButton ("Next");
	
		b1.setBounds(50,700,100,40);
		b2.setBounds(200,700,100,40);
		b3.setBounds(350,700,100,40);

		b4.setBounds(50,700,100,40);
		b5.setBounds(200,700,100,40);
		b6.setBounds(350,700,100,40);

		b7.setBounds(50,700,100,40);
		b8.setBounds(200,700,100,40);
		b9.setBounds(350,700,100,40);
	
		b10.setBounds(600,770,80,30);
		b11.setBounds(670,770,80,30);
		lb.setBounds(50,50,670,600);
			
		fr.add(lb);
		fr.add(b1);
		fr.add(b2);
		fr.add(b3);
		fr.add(b4);
		fr.add(b5);
		fr.add(b6);
		fr.add(b7);
		fr.add(b8);
		fr.add(b9);
		fr.add(b10);
		fr.add(b11);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
	
		b10.setEnabled(false);
		b4.setVisible(false);
		b5.setVisible(false);
		b6.setVisible(false);
		b7.setVisible(false);
		b8.setVisible(false);
		b9.setVisible(false);

		fr.setSize(820,880);
		fr.setVisible(true);	
	}
	public void actionPerformed( ActionEvent e )
	{
		if(e.getSource()==b11)
		{
			if(count==0)
			{
				b1.setVisible(false);
				b2.setVisible(false);
				b3.setVisible(false);
				b4.setVisible(true);
				b5.setVisible(true);
				b6.setVisible(true);
				count=count+1;
				b10.setEnabled(true);
			}
			else
			{
				b4.setVisible(false);
				b5.setVisible(false);
				b6.setVisible(false);
				b7.setVisible(true);
				b8.setVisible(true);
				b9.setVisible(true);
				b11.setEnabled(false);
				b10.setEnabled(true);
				count=count+1;
			}
		}
		if(e.getSource()==b10)
		{
			if(count==1)
			{
				b1.setVisible(true);
				b2.setVisible(true);
				b3.setVisible(true);
				b4.setVisible(false);
				b5.setVisible(false);
				b6.setVisible(false);
				b11.setEnabled(true);
				b10.setEnabled(false);
				count=count-1;
			}
			else
			{
				b7.setVisible(false);
				b8.setVisible(false);
				b9.setVisible(false);
				b4.setVisible(true);
				b5.setVisible(true);
				b6.setVisible(true);
				b11.setEnabled(true);
				count=count-1;
			}
		}
		if(e.getSource()==b1)
		{
			lb.setIcon(new ImageIcon("1.jpg"));
		}
		if(e.getSource()==b2)
		{
			lb.setIcon(new ImageIcon("2.jpg"));
		}
		if(e.getSource()==b3)
		{
			lb.setIcon(new ImageIcon("3.jpg"));
		}
		if(e.getSource()==b4)
		{
			lb.setIcon(new ImageIcon("4.jpg"));
		}
		if(e.getSource()==b5)
		{
			lb.setIcon(new ImageIcon("5.jpg"));
		}
		if(e.getSource()==b6)
		{
			lb.setIcon(new ImageIcon("6.jpg"));
		}
		if(e.getSource()==b7)
		{
			lb.setIcon(new ImageIcon("7.jpg"));
		}
		if(e.getSource()==b8)
		{
			lb.setIcon(new ImageIcon("8.jpg"));
		}
		if(e.getSource()==b9)
		{
			lb.setIcon(new ImageIcon("9.jpg"));
		}
	}
			
	public static void main(String s[])
	{
		new ButtonTest();
	}
}
