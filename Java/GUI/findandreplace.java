//class findandreplace
import javax.swing.*;
import java.awt.event.*;

class FindAndReplace implements ActionListener
{
	JFrame fr;
	JButton b1,b2,b3;
	JLabel lb1,lb2;
	JTextArea ta;
	JTextField tf1,tf2;
	JScrollPane pane;
	
	FindAndReplace()
	{
		fr=new JFrame("Find and Replace");
		fr.setLayout(null);
		
		ta=new JTextArea();
		pane=new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		pane.setBounds(50,50,800,400);
		
		b1=new JButton("Search");
		b2=new JButton("Replace");
		b3=new JButton("Replace All");
		
		b1.setBounds(550,500,100,50);
		b2.setBounds(550,600,100,50);
		b3.setBounds(540,700,120,50);

		lb1=new JLabel("Find");
		lb2=new JLabel("Replace");
		
		tf1=new JTextField();
		tf2=new JTextField();
		
		lb1.setBounds(80,500,80,50);
		lb2.setBounds(80,600,100,50);
		
		tf1.setBounds(220,500,100,50);
		tf2.setBounds(220,600,100,50);

		fr.add(pane);
		fr.add(b1);
		fr.add(b2);
		fr.add(b3);
		fr.add(lb1);
		fr.add(lb2);
		fr.add(tf1);
		fr.add(tf2);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		fr.setSize(900,900);
		fr.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		/*if(e.getSource()==b1)
		{
			String entered = ta.getText();
			String tofind = tf1.getText();
			int i=entered.indexOf(tofind);
			while(true)
			{
				
		ta.requestFocusInWindow();*/
	}
	public static void main(String s[])
	{
		new FindAndReplace();
	}
}
			