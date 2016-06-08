package frames;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import frames.panels.PanelAdmin;
import frames.panels.PanelAdminB;
import frames.panels.PanelAlleVocs;
import frames.panels.PanelFehler;
import frames.panels.PanelFuturI;
import frames.panels.PanelFuturII;
import frames.panels.PanelImperfekt;
import frames.panels.PanelMain;
import frames.panels.PanelPerfekt;
import frames.panels.PanelPlusquamperfekt;
import frames.panels.PanelPr�sens;
import frames.panels.PanelTenseSelection;
import frames.panels.Panel�bersetzung;
import frames.panels.Panel�bersetzungsFehler;
import �bersetzung.uea;
import �bersetzung.uee;

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
	public void panelFehler() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelFehler());
		centerpanel.setBounds(0,0,600,400);
		c.revalidate();
	}
	
	public void panel�bersetzungsFehler() {
		c.remove(centerpanel);
		c.add(centerpanel = new Panel�bersetzungsFehler());
		centerpanel.setBounds(0,0,600,400);
		Panel�bersetzungsFehler.lb1_anzeige.requestFocus();
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
	
	
	public void panel�bersetzung() {
		setTitle(PanelMain.gv);
		c.remove(centerpanel);
		c.revalidate();
		c.add(centerpanel = new Panel�bersetzung());
		Panel�bersetzung.sp1.requestFocus();
		centerpanel.setBounds(0,0, 600, 390);
		c.revalidate();
	}

	public void panelTenseSelection() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelTenseSelection());
		centerpanel.setBounds(0,0,600,400);
		c.revalidate();
	}
	
	public void panelPr�sens() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelPr�sens());
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
