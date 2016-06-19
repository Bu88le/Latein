package frames;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import frames.panels.PanelAdmin;
import frames.panels.PanelAdminB;
import frames.panels.PanelAlleVocs;
import frames.panels.PanelAusgabeReverse;
import frames.panels.PanelFehler;
import frames.panels.PanelFuturI;
import frames.panels.PanelFuturII;
import frames.panels.PanelImperfekt;
import frames.panels.PanelMain;
import frames.panels.PanelMehrereWörter;
import frames.panels.PanelPerfekt;
import frames.panels.PanelPlusquamperfekt;
import frames.panels.PanelPräsens;
import frames.panels.PanelTenseSelection;
import frames.panels.PanelÜbersetzung;
import frames.panels.PanelÜbersetzungsFehler;
import übersetzung.uea;
import übersetzung.uee;

public class MainFrame extends JFrame {
	
	static public Container c;
	public static JPanel centerpanel;
	
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
		uee.stringbuffer.delete(0, uee.stringbuffer.length());
		c.remove(centerpanel);
		c.add(centerpanel = new PanelMain());
		centerpanel.setBounds(0,0,600,400);
		PanelMain.tf1_vocinput.requestFocus();
		c.revalidate();

	}
	
	public void panelMehrereWörter(StringBuffer sb) {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelMehrereWörter(sb));
		centerpanel.setBounds(0,0,600,400);
		c.revalidate();
	}
	
	public void panelReverseAusgabe() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelAusgabeReverse());
		centerpanel.setBounds(0,0,600,400);
		c.revalidate();
	}
	public void panelFehler() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelFehler());
		centerpanel.setBounds(0,0,600,400);
		c.revalidate();
	}
	
	public void panelÜbersetzungsFehler() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelÜbersetzungsFehler());
		centerpanel.setBounds(0,0,600,400);
		PanelÜbersetzungsFehler.lb1_anzeige.requestFocus();
		c.revalidate();
	}
	
	public static void panelAdmin() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelAdmin());
		centerpanel.setBounds(0,0,600,400);
		PanelAdmin.pwf_login.requestFocus();
		c.revalidate();
	}
	
	public static void panelAdminB() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelAdminB());
		centerpanel.setBounds(0,0,600,400);
		c.revalidate();
	}
	
	public static void panelAlleVocs() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelAlleVocs(centerpanel));
		centerpanel.setBounds(0,0,600,400);
		PanelAlleVocs.sp1_anzeige.requestFocus();
		c.revalidate();
	}
	
	
	public void panelÜbersetzung() {
		setTitle(PanelMain.gv);
		c.remove(centerpanel);
		c.revalidate();
		c.add(centerpanel = new PanelÜbersetzung());
		PanelÜbersetzung.sp1.requestFocus();
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
	
	public void panelImperfekt() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelImperfekt());
		centerpanel.setBounds(0,0,600,400);
		c.revalidate();
	}
	
	public void panelFuturI() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelFuturI());
		centerpanel.setBounds(0,0,600,400);
		c.revalidate();
	}
	
	public void panelFuturII() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelFuturII());
		centerpanel.setBounds(0,0,600,400);
		c.revalidate();
	}
	
	public void panelPerfekt() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelPerfekt());
		centerpanel.setBounds(0,0,600,400);
		c.revalidate();
	}
	
	public void panelPlusquamperfekt() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelPlusquamperfekt());
		centerpanel.setBounds(0,0,600,400);
		c.revalidate();
	}
	
	
	
	
	
	public void revalidaten() {
		c.revalidate();
	}
}
