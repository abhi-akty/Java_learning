//class JLabelTest
import javax.swing.*;
import java.awt.event.*;
class JLabelTest implements ActionListener
{
	JFrame fr;
	JButton b11,b12,b13,b14,b2;
	JLabel lb1,lb2,lb3,lb4;
	
	JLabelTest()
	{
		fr=new JFrame("JLabel Test");
		fr.setLayout(null);
		
		b11=new JButton("Change");
		b12=new JButton("Change");
		b13=new JButton("Change");
		b14=new JButton("Change");
		b2=new JButton("Change All");
	
		lb1=new JLabel("First",JLabel.LEFT);
		lb2=new JLabel("Second",JLabel.RIGHT);
		lb3=new JLabel("Third",JLabel.LEFT);
		lb4=new JLabel("Fourth",JLabel.RIGHT); 

		fr.setSize(550,600);
		
		lb1.setBounds(50,50,150,50);
		lb2.setBounds(50,150,150,50);
		lb3.setBounds(50,250,150,50);
		lb4.setBounds(50,350,150,50);
				
		b11.setBounds(250,50,100,50);
		b12.setBounds(250,150,100,50);
		b13.setBounds(250,250,100,50);
		b14.setBounds(250,350,100,50);
		b2.setBounds(400,200,100,50);

		fr.setVisible(true);
		fr.add(b11);
		fr.add(b12);
		fr.add(b13);
		fr.add(b14);
		fr.add(b2);
		fr.add(lb1);
		fr.add(lb2);
		fr.add(lb3);
		fr.add(lb4);
		
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14 .addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b11)
		{
			if(lb1.getHorizontalAlignment()==JLabel.LEFT)
			{
				lb1.setHorizontalAlignment(JLabel.RIGHT);
			}
			else
			{
				lb1.setHorizontalAlignment(JLabel.LEFT);
			}
		}
		if(e.getSource()==b12)
		{
			if(lb2.getHorizontalAlignment()==JLabel.LEFT)
			{
				lb2.setHorizontalAlignment(JLabel.RIGHT);
			}
			else
			{
				lb2.setHorizontalAlignment(JLabel.LEFT);
			}
		}
		if(e.getSource()==b13)
		{
			if(lb3.getHorizontalAlignment()==JLabel.LEFT)
			{
				lb3.setHorizontalAlignment(JLabel.RIGHT);
			}
			else
			{
				lb3.setHorizontalAlignment(JLabel.LEFT);
			}
		}
		if(e.getSource()==b14)
		{
			if(lb4.getHorizontalAlignment()==JLabel.LEFT)
			{
				lb4.setHorizontalAlignment(JLabel.RIGHT);
			}
			else
			{
				lb4.setHorizontalAlignment(JLabel.LEFT);
			}
		}
		if(e.getSource()==b2)
		{
			if(lb1.getHorizontalAlignment()==JLabel.LEFT)
			{
				lb1.setHorizontalAlignment(JLabel.RIGHT);
			}
			else
			{
				lb1.setHorizontalAlignment(JLabel.LEFT);
			}
			if(lb2.getHorizontalAlignment()==JLabel.LEFT)
			{
				lb2.setHorizontalAlignment(JLabel.RIGHT);
			}
			else
			{
				lb2.setHorizontalAlignment(JLabel.LEFT);
			}
			if(lb3.getHorizontalAlignment()==JLabel.LEFT)
			{
				lb3.setHorizontalAlignment(JLabel.RIGHT);
			}
			else
			{
				lb3.setHorizontalAlignment(JLabel.LEFT);
			}
			if(lb4.getHorizontalAlignment()==JLabel.LEFT)
			{
				lb4.setHorizontalAlignment(JLabel.RIGHT);
			}
			else
			{
				lb4.setHorizontalAlignment(JLabel.LEFT);
			}
		}
	}
	public static void main(String s[])
	{
		new JLabelTest();
	}
}	