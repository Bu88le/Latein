package frames;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import frames.panels.PanelAdmin;
import frames.panels.PanelMain;
import frames.panels.PanelPräsens;
import frames.panels.PanelTenseSelection;
import frames.panels.PanelÜbersetzung;
import übersetzung.uea;

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
	
	public static void panelMain() {
		uea.stringbuffer.delete(0, uea.stringbuffer.length());
		c.remove(centerpanel);
		c.add(centerpanel = new PanelMain());
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
	
	public void panelÜbersetzung() {
		setTitle(PanelMain.gv);
		c.remove(centerpanel);
		c.revalidate();
		c.add(centerpanel = new PanelÜbersetzung());
		centerpanel.setBounds(0,0, 600, 390);
		c.revalidate();
	}

	public void panelTenseSelection() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelTenseSelection());
		centerpanel.setBounds(0,0,600,400);
		c.revalidate();
	}
	
	public void panelPräsens() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelPräsens());
		centerpanel.setBounds(0,0,600,400);
		c.revalidate();
	}
	
	
	
	
	
	public void revalidaten() {
		c.revalidate();
	}
}
