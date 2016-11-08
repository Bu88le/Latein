package bu88le.gui;

import java.awt.BorderLayout;
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

import bu88le.gui.panels.PanelFuturI;
import bu88le.gui.panels.PanelFuturII;
import bu88le.gui.panels.PanelImperfekt;
import bu88le.gui.panels.PanelMain;
import bu88le.gui.panels.PanelPerfekt;
import bu88le.gui.panels.PanelPlusquamperfekt;
import bu88le.gui.panels.PanelPr�sens;
import bu88le.gui.panels.PanelSelectWords;
import bu88le.gui.panels.PanelTenseSelection;
import bu88le.gui.panels.PanelTranslation;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2941050948770885476L;

	private JMenuBar jmbZsm;
	private JMenu jmHelp, jmExit;
	private JMenuItem jmiAbout, jmiHelp;
	private static JPanel centerpanel;
	private static Container c;


	public MainFrame() {
		super("Latein");

		setSize(600, 435);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(10, 10));

		c = getContentPane();

		initGUI();

		setVisible(true);
	}


	private void initGUI() {

		jmbZsm = new JMenuBar();
		jmbZsm.setCursor(new Cursor(Cursor.HAND_CURSOR));
		setJMenuBar(jmbZsm);

		jmiAbout = new JMenu("?");
		jmiAbout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("about");

			}
		});
		jmbZsm.add(jmiAbout);

		jmExit = new JMenu("Beenden");
		jmExit.setHorizontalTextPosition(SwingConstants.CENTER);
		jmExit.setHorizontalAlignment(SwingConstants.CENTER);
		jmExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		jmbZsm.add(jmExit);

		panelMain();

	}


	public static void panelMain() {
		if (centerpanel != null)
			c.remove(centerpanel);

		c.add(centerpanel = new PanelMain(), BorderLayout.CENTER);
		PanelMain.tfEingabeVokabel.requestFocus();
		c.revalidate();
	}


	public static void panelSelectWords(ArrayList<String> foundVoc, ArrayList<String> unusualForms,
			ArrayList<String> infinitive, ArrayList<Integer> placeFoundVocs, ArrayList<String> translation) {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelSelectWords(centerpanel, foundVoc, unusualForms, infinitive, placeFoundVocs,
				translation), BorderLayout.CENTER);
		c.revalidate();
	}


	public static void panelTranslation(StringBuffer ausgabe) {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelTranslation(centerpanel, ausgabe), BorderLayout.CENTER);
		PanelTranslation.jsp_ausgabe.requestFocus();
		c.revalidate();
	}


	public static void panelTenseSelection() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelTenseSelection(centerpanel), BorderLayout.CENTER);
		c.revalidate();
	}


	public static void panelPr�sens() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelPr�sens(centerpanel), BorderLayout.CENTER);
		c.revalidate();
	}


	public static void panelImperfekt() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelImperfekt(centerpanel), BorderLayout.CENTER);
		c.revalidate();
	}


	public static void panelPerfekt() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelPerfekt(centerpanel), BorderLayout.CENTER);
		c.revalidate();
	}


	public static void panelPlusquamperfekt() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelPlusquamperfekt(centerpanel), BorderLayout.CENTER);
		c.revalidate();
	}


	public static void panelFuturI() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelFuturI(centerpanel), BorderLayout.CENTER);
		c.revalidate();
	}


	public static void panelFuturII() {
		c.remove(centerpanel);
		c.add(centerpanel = new PanelFuturII(centerpanel), BorderLayout.CENTER);
		c.revalidate();
	}


	public static void back(JPanel caller) {
		c.remove(centerpanel);
		c.add(centerpanel = caller, BorderLayout.CENTER);
		c.repaint();
	}

}
