package frames;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
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
import frames.panels.PanelMehrereW�rter;
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
	JMenuBar jmb1;
	JMenu jm1;
	JMenuItem jmi1_help, jmi2_about, jmi3_exit;
	public static ArrayList<String> MehrereVokabeln = new ArrayList<String>();
	
	public MainFrame() {
		super("Latein");		
		setSize(600, 435);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		centerpanel = new PanelMain();
		
		jmb1 = new JMenuBar();
		setJMenuBar(jmb1);
		
		jm1 = new JMenu("?");
		jmb1.add(jm1);
		
		jmi1_help = new JMenuItem("Help");
		jmi1_help.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		jm1.add(jmi1_help);
		
		jmi2_about = new JMenuItem("About");
		jmi2_about.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		jm1.add(jmi2_about);
		
		jm1.addSeparator();
		
		jmi3_exit = new JMenuItem("Beenden");
		jmi3_exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);				
			}
		});
		jm1.add(jmi3_exit);
		
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
	
	public void panelMehrereW�rter(ArrayList<String> MehrereW�rter) {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelMehrereW�rter(MehrereW�rter));
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
		PanelTenseSelection.b1_pr�sens.requestFocus();
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
