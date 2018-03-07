//JCheckBoxTest class
import javax.swing.*;
import java.awt.event.*;
class JCheckBoxTest implements ActionListener
{
	JFrame fr1,fr2;
	JButton b1,b2,b3,b4,b5,b6,b7;
	JTextArea tf;
	JLabel lb1,lb2,lb3,lb7;
	JCheckBox cb1,cb2,cb3;
	JRadioButton rb1,rb2,rb3,rb4;
	String ques[]={"","","","","","","","","",""};
	String options[][]={{"","","",""},{"","","",""},{"","","",""},{"","","",""},{"","","",""},{"","","",""},{"","","",""},{"","","",""},{"","","",""},{"","","",""}};
	int correctAns[]={};
	int userAns[]={};
	int score=0;
	
	JCheckBoxTest()
	{
		fr1=new JFrame("Demo Test");
		fr1.setLayout(null);
		fr2=new JFrame("Result");
		fr2.setLayout(null);
		fr2.setSize(500,500);
		b7=new JButton("OK");

		b1=new JButton("Goto");
		b2=new JButton("Goto");
		b3=new JButton("Goto");
		b4=new JButton("Prev");
		b5=new JButton("Next");
		b6=new JButton("Submit");
		tf=new JTextArea();
		rb1=new JRadioButton("options[0][0]");
		rb2=new JRadioButton("options[0][1]");
		rb3=new JRadioButton("options[0][2]");
		rb4=new JRadioButton("options[0][3]");

		lb1=new JLabel();
		lb2=new JLabel();
		lb3=new JLabel();

		cb1=new JCheckBox("Bookmark 1");
		cb3=new JCheckBox("Bookmark 2");
		cb3=new JCheckBox("Bookmark 3");

		b1.setBounds(1000,50,80,50);
		b2.setBounds(1000,150,80,50);
		b3.setBounds(1000,250,80,50);
		b4.setBounds(500,600,50,50);
		b5.setBounds(600,600,50,50);
		b6.setBounds(500,700,100,50);
		tf.setBounds(50,50,600,300);
		cb1.setBounds(700,50,100,50);
		cb2.setBounds(700,150,100,50);
		cb3.setBounds(700,250,100,50);
		lb1.setBounds(850,50,100,50);
		lb2.setBounds(850,150,100,50);
		lb3.setBounds(850,250,100,50);

		fr1.add(b1);
		fr1.add(b2);
		fr1.add(b3);
		fr1.add(b4);
		fr1.add(b5);
		fr1.add(b6);
		fr1.add(lb1);
		fr1.add(lb2);
		fr1.add(lb3);
		fr1.add(cb1);
		fr1.add(cb2);
		fr1.add(cb3);
		fr1.add(tf);
	
		fr1.setVisible(true);
		fr1.setSize(1200,1000);
		lb7=new JLabel("Correct Answers :  ");
		lb7.setBounds(100,100,250,100);
		fr2.add(lb7);
		b7.setBounds(250,400,50,50);
		fr2.add(b7);
		b4.setEnabled(false);
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource==b6)
		{
			
	}
	public static void main(String s[])
	{
		new JCheckBoxTest();
	}
}
	


		