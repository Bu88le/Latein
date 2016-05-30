package frames;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import frames.panels.PanelAdmin;
import frames.panels.PanelMain;

public class MainFrame extends JFrame {
	
	static public Container c;
	private static PanelMain pm = new PanelMain();
	private static PanelAdmin pa = new PanelAdmin();
	
	public MainFrame() {
		super("Latein");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		c = getContentPane();
		
		panelMain();

	}
	
	private static void panelMain() {
		c.add(pm);
		pm.setBounds(0,0,600,400);
		c.revalidate();

	}
	
	public static void panelAdmin() {
		c.remove(pm);
		c.add(pa);
		pa.setBounds(0,0,600,400);
		PanelAdmin.pwf_login.requestFocus();
		c.revalidate();
	}

}
