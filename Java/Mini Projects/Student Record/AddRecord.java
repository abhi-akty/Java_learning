//AddRecord class
import java.awt.event.*;
import javax.swing.*;
class AddRecord implements ActionListener
{
	JFrame fr;
	JLabel name,rollno,phone,email,course,address;
	JButton addb,cancelb;
	JTextField nametf,rollnotf,phonetf,emailtf,coursetf,addresstf;
	
	AddRecord()
	{
		fr=new JFrame();
		fr.setLayout(null);
		fr.setSize(400,600);
		
		name=new JLabel("Name");
		name.setBounds(50,50,100,50);
		fr.add(name);
		
		rollno=new JLabel("Roll No. ");
		rollno.setBounds(50,110,100,50);
		fr.add(rollno);
		
		course=new JLabel("Course");
		course.setBounds(50,170,100,50);
		fr.add(course);
		
		phone=new JLabel("Phone No.");
		phone.setBounds(50,230,100,50);
		fr.add(phone);
		
		email=new JLabel("Email");
		email.setBounds(50,290,100,50);
		fr.add(email);
		
		address=new JLabel("Address");
		address.setBounds(50,350,100,50);
		fr.add(address);
		
		nametf=new JTextField();
		nametf.setBounds(120,60,150,30);
		fr.add(nametf);
	
		rollnotf=new JTextField();
		rollnotf.setBounds(120,120,150,30);
		fr.add(rollnotf);

		coursetf=new JTextField();
		coursetf.setBounds(120,180,150,30);
		fr.add(coursetf);

		phonetf=new JTextField();
		phonetf.setBounds(120,240,150,30);
		fr.add(phonetf);

		emailtf=new JTextField();
		emailtf.setBounds(120,300,150,30);
		fr.add(emailtf);

		addresstf=new JTextField();
		addresstf.setBounds(120,360,150,50);
		fr.add(addresstf);
		
		addb=new JButton("Add");
		addb.setBounds(70,420,60,50);
		fr.add(addb);
		addb.addActionListener(this);

		cancelb=new JButton("Cancel");
		cancelb.setBounds(150,420,80,50);
		fr.add(cancelb);
		cancelb.addActionListener(this);	
		
		fr.setVisible(true);

	}
	public void actionPerformed(ActionEvent e)
	{
		/*if(e.getSource()==addb)
		{

		}
		if(e.getSource()==cancelb)
		{
	
		}
		*/	
	}
	public static void main(String s[])
	{
		new AddRecord();
	}
}
		