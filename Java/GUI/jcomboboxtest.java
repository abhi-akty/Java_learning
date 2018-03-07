//JComboBoxTest class
import javax.swing.*;
import java.awt.event.*;
class JComboBoxTest implements ActionListener
{
	JFrame fr1,fr2;
	JButton b1,b2,b3;
	JLabel lb1,lb2,lb3,lb4,lb5;
	JComboBox cb1,cb2,cb3;
	DefaultComboBoxModel model1,model2,model3;
	JTextField tf1,tf2;
	JComboBoxTest()
	{
		fr1=new JFrame("Assignment 5");
		fr1.setLayout(null);
		fr2=new JFrame("Manage Window");
		fr2.setLayout(null);
		lb1=new JLabel("State");
		lb2=new JLabel("City");
		lb1.setBounds(50,50,100,50);
		lb2.setBounds(200,50,100,50);
		fr1.add(lb1);
		fr1.add(lb2);
		
		
		b1=new JButton("Manage");
		String states[]={"Delhi","UP","MP"};
		cb1=new JComboBox(states);
		model1=new DefaultComboBoxModel();
		model1.addElement("New Delhi");
		model2=new DefaultComboBoxModel();
		model2.addElement("Greater Noida");
		model2.addElement("Noida");
		model3=new DefaultComboBoxModel();
		model3.addElement("Bhopal");
		model3.addElement("Indore");
		cb2=new JComboBox();
		cb1.setBounds(50,100,100,50);
		cb2.setBounds(200,100,150,50);
		b1.setBounds(100,200,100,50);
		fr1.add(cb1);fr1.add(cb2);fr1.add(b1);
		fr1.setSize(400,500);
		fr1.setVisible(true);
		fr2.setSize(500,500);
		cb1.addActionListener(this);
		b1.addActionListener(this);

		lb3=new JLabel("State");
		lb4=new JLabel("Add Item");
		lb5=new JLabel("Remove Item");
		b2=new JButton("Add");
		b3=new JButton("Remove");
		lb3.setBounds(50,50,100,50);
		lb4.setBounds(50,150,100,50);
		lb5.setBounds(50,250,100,50);
		tf1=new JTextField();
		tf2=new JTextField();
		tf1.setBounds(170,150,150,50);
		tf2.setBounds(170,250,150,50);
		b2.setBounds(350,150,70,50);
		b3.setBounds(335,250,100,50);
		cb3=new JComboBox(states);
		cb3.setBounds(170,50,150,50);
		fr2.add(lb4);fr2.add(lb3);fr2.add(lb5);fr2.add(b2);fr2.add(b3);fr2.add(tf1);fr2.add(tf2);fr2.add(cb3);
		b2.addActionListener(this);
		b3.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==cb1)
		{
			String st=(String)cb1.getSelectedItem();
			if(st.equals("Delhi"))
			{
				cb2.setModel(model1);
			}
			if(st.equals("UP"))
			{
				cb2.setModel(model2);
			}
			if(st.equals("MP"))
			{
				cb2.setModel(model3);
			}
		}
		if(e.getSource()==b1)
		{	
			fr2.setVisible(true);
		}	
		if(e.getSource()==b2)
		{
			String st=(String)cb3.getSelectedItem();
			String temp=tf1.getText();
			if(st.equals("Delhi"))
			{
				model1.addElement(temp);
			}
			if(st.equals("UP"))
			{
				model2.addElement(temp);
			}
			if(st.equals("MP"))
			{
				model3.addElement(temp);
			}
			tf1.setText(" ");
		}
		if(e.getSource()==b3)
		{
			String st=(String)cb3.getSelectedItem();
			String temp=tf2.getText();
			if(st.equals("Delhi"))
			{
				model1.removeElement(temp);
			}
			if(st.equals("UP"))
			{
				model2.removeElement(temp);
			}
			if(st.equals("MP"))
			{
				model3.removeElement(temp);
			}
			tf2.setText(" ");
		}	
	}
	public static void main(String s[])
	{
		new JComboBoxTest();
	}
}
