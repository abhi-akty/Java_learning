//SearchRecord class
import java.awt.event.*;
import javax.swing.*;
class SearchRecord implements ActionListener
{
	JLabel searchWith;
	JFrame fr1;
	JRadioButton rollno,phoneno;
	JTextField tf;
	ButtonGroup bg;
	JButton searchb;
	
	SearchRecord()
	{
		fr1=new JFrame ();
		fr1.setLayout(null);
		fr1.setSize(400,600);
		
		searchWith = new JLabel("Search With",JLabel.CENTER);
		rollno = new JRadioButton("Roll No.");
		phoneno = new JRadioButton("Phone No.");
		tf=new JTextField();
		searchb=new JButton("Search");
		bg=new ButtonGroup();
		bg.add(rollno);
		bg.add(phoneno);
		
		searchWith.setBounds(50,50,300,50);
		rollno.setBounds(50,130,100,50);
		phoneno.setBounds(50,210,100,50);
		tf.setBounds(50,290,100,50);
		searchb.setBounds(170,290,100,50);
		
		fr1.add(searchWith);
		fr1.add(rollno);
		fr1.add(phoneno);
		fr1.add(tf);
		fr1.add(searchb);
		
		searchb.addActionListener(this);
		
		fr1.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==searchb)
		{
			if(
		
	}
	public static void main(String s[])
	{
		new SearchRecord();
	}
}
		
		