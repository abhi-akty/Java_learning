//WindowEventTest.java
import java.awt.*;
import java.awt.event.*;

class WindowEventTest implements WindowListener
{
	Frame fr;
	TextField tf;

	WindowEventTest()
	{
		fr=new Frame("window Event Test");
		fr.setLayout(null);

		tf=new TextField();
		tf.setBounds(50,50,100,50);

		fr.add(tf);

		fr.addWindowListener(this);
		fr.setSize(400,400);
		fr.setVisible(true);
	}
	public void windowOpened ( WindowEvent e)
	{
		System.out.println("window is opened");
	}
	public void windowClosing( WindowEvent e)
	{
		System.out.println("window is closing");
		fr.dispose();
	}
	public void windowClosed ( WindowEvent e)
	{
		System.out.println("window is closed");
	}	
	public void windowActivated ( WindowEvent e)
	{
		System.out.println("window is Activated");
		tf.setText("window is activated");
	}
	public void windowDeactivated( WindowEvent e)
	{
		System.out.println("window is deactivated");
	}
	public void windowIconified ( WindowEvent e)
	{
		System.out.println("window is minimized");
		tf.setText("window is minimized");
	}
	public void windowDeiconified ( WindowEvent e)
	{
		System.out.println("window is maximized");
		tf.setText("window is maximized");
	}
	public static void main(String s[])
	{
		new WindowEventTest();
	}
}