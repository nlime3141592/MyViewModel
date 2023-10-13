package deu.java002_02.main;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

class V0 extends JFrame implements WindowListener
{
	public V0(String title)
	{
		super.setTitle(title);
		super.setSize(600, 600);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// super.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		// super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 강제 종료 느낌이 강하네.
		super.addWindowListener(this);
	}

	@Override
	public void windowOpened(WindowEvent e) { }

	@Override
	public void windowClosing(WindowEvent e) { }

	@Override
	public void windowClosed(WindowEvent e) { }

	@Override
	public void windowIconified(WindowEvent e) { }

	@Override
	public void windowDeiconified(WindowEvent e) { }

	@Override
	public void windowActivated(WindowEvent e) { }

	@Override
	public void windowDeactivated(WindowEvent e) { }
}

public class Main
{
	public static void main(String[] args)
	{
		V0[] vs = new V0[3];
		
		new V0("a");
	}
}
