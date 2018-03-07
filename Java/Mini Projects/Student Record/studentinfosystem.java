//class StudentInfoSystem
import javax.swing.*;
import java.awt.event.*;
class StudentInfoSystem 
{
	static JTable table;
	static DefaultTableModel model;
	static
	{
		model=new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Roll No.");
		model.addColumn("Course");
		model.addColumn("Phone No.");
		model.addColumn("Email Address");
		model.addColumn("Address");
		table=new JTable(model);
	}
	public static void main()
	{
		new StudentInfoSystem();
	}
}		