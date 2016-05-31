package frames;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import frames.panels.PanelAdmin;
import frames.panels.PanelMain;
import frames.panels.Panel‹bersetzung;

public class MainFrame extends JFrame {
	
	static public Container c;
	private static JPanel centerpanel;
	
	public MainFrame() {
		super("Latein");
		setSize(600, 400);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		centerpanel = new PanelMain();
		
		c = getContentPane();
		
		panelMain();

	}
	
	private static void panelMain() {
		c.add(centerpanel);
		centerpanel.setBounds(0,0,600,400);
		PanelMain.tf1_vocinput.requestFocus();
		c.revalidate();

	}
	
	public static void panelAdmin() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelAdmin());
		centerpanel.setBounds(0,0,600,400);
		PanelAdmin.pwf_login.requestFocus();
		c.revalidate();
	}
	
	public void panel‹bersetzung() {
		setTitle(PanelMain.gv);
		c.remove(centerpanel);
		c.add(centerpanel = new Panel‹bersetzung());
		centerpanel.setBounds(0,0, 600, 390);
		c.revalidate();
	}

}
