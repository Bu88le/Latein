package frames;

import java.awt.Container;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import frames.panels.PanelAdmin;
import frames.panels.PanelAdminB;
import frames.panels.PanelAlleNomen;
import frames.panels.PanelAlleVocs;
import frames.panels.PanelAusgabeReverse;
import frames.panels.PanelAuswahlÜberprüfung;
import frames.panels.PanelFehler;
import frames.panels.PanelFuturI;
import frames.panels.PanelFuturII;
import frames.panels.PanelImperfekt;
import frames.panels.PanelMain;
import frames.panels.PanelMehrereWörter;
import frames.panels.PanelNumerusSelection;
import frames.panels.PanelPerfekt;
import frames.panels.PanelPlural;
import frames.panels.PanelPlusquamperfekt;
import frames.panels.PanelPräsens;
import frames.panels.PanelSingular;
import frames.panels.PanelTenseSelection;
import frames.panels.PanelÜbersetzung;
import frames.panels.PanelÜbersetzungNomen;
import frames.panels.PanelÜbersetzungsFehler;
import latein.Main;
import übersetzung.uea;
import übersetzung.uee;

public class MainFrame extends JFrame {
	
	static public Container c;
	public static JPanel centerpanel;
	JMenuBar jmb1;
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
		jmb1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		setJMenuBar(jmb1);
		
		jmi1_help = new JMenuItem("Help");
		jmi1_help.setHorizontalAlignment(SwingConstants.CENTER);
		jmi1_help.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("HELP");
				
			}
		});
		jmb1.add(jmi1_help);
		
		jmi2_about = new JMenuItem("About");
		jmi2_about.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("about");
				
			}
		});
		jmb1.add(jmi2_about);
		
		jmi3_exit = new JMenuItem("Beenden");
		jmi3_exit.setHorizontalTextPosition(SwingConstants.CENTER);
		jmi3_exit.setHorizontalAlignment(SwingConstants.CENTER);
		jmi3_exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);				
			}
		});
		jmb1.add(jmi3_exit);
		
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
	
	public void panelMehrereWörter(ArrayList<String> MehrereWörter) {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelMehrereWörter(MehrereWörter));
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
	
	public void panelAuswahlÜberprüfung() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelAuswahlÜberprüfung());
		centerpanel.setBounds(0,0,600,400);
		c.revalidate();
	}
	
	public void panelÜbersetzungsFehler(int i) {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelÜbersetzungsFehler(i));
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
	
	public static void panelAlleVerben() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelAlleVocs(centerpanel));
		centerpanel.setBounds(0,0,600,400);
		PanelAlleVocs.sp1_anzeige.requestFocus();
		c.revalidate();
	}
	
	public static void panelAlleNomen() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelAlleNomen(centerpanel));
		centerpanel.setBounds(0,0,600,400);
		PanelAlleNomen.sp1_anzeige.requestFocus();
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
	
	public void panelÜbersetzungNomen() {
		setTitle(PanelMain.gv);
		c.remove(centerpanel);
		c.add(centerpanel = new PanelÜbersetzungNomen());
		PanelÜbersetzungNomen.sp1.requestFocus();
		centerpanel.setBounds(0,0, 600, 390);
		c.revalidate();
	}

	public void panelTenseSelection() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelTenseSelection());
		centerpanel.setBounds(0,0,600,400);
		c.revalidate();
	}
	
	public void panelNumerusSelection() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelNumerusSelection());
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
	
	public void panelSingular() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelSingular());
		centerpanel.setBounds(0,0,600,400);
		c.revalidate();
	}
	
	public void panelPlural() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelPlural());
		centerpanel.setBounds(0,0,600,400);
		c.revalidate();
	}
	
	
	
	
	public void revalidaten() {
		c.revalidate();
	}
}
