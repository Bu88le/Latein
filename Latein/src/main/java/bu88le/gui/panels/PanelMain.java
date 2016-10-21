package bu88le.gui.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import bu88le.gui.Strings;
import logic.Formauswahl;

public class PanelMain extends JPanel {

	JTextField tfEingabeVokabel;
	JButton btSuche, btBeenden;
	JPanel pnPlatzhalterOBEN, pnPlatzhalterLinks, pnPlatzhalterRechts, pnBorderMitte, pnButtons;
	JLabel lbBeschreibung;
	private GridBagConstraints c = new GridBagConstraints();


	public PanelMain() {
		setLayout(new BorderLayout(10, 15));

		initGUI();

	}


	private void initGUI() {

		// -------------------------------------
		// ---PLatzhalter f�r BorderLayout------
		// -------------------------------------
		/*
		 * pnPlatzhalterOBEN = new JPanel(); add(pnPlatzhalterOBEN,
		 * BorderLayout.PAGE_START);
		 */

		/*
		 * pnPlatzhalterLinks = new JPanel();
		 * pnPlatzhalterLinks.setPreferredSize(new Dimension(100, 100));
		 * add(pnPlatzhalterLinks, BorderLayout.LINE_START);
		 * 
		 * pnPlatzhalterRechts = new JPanel();
		 * pnPlatzhalterRechts.setPreferredSize(new Dimension(100, 100));
		 * add(pnPlatzhalterRechts, BorderLayout.LINE_END);
		 */

		// Panel, das in die Mitte eingesetzt wird
		pnBorderMitte = new JPanel();
		pnBorderMitte.setLayout(new GridBagLayout());

		// Label, das auffordert die Vokabel einzugeben
		lbBeschreibung = new JLabel(Strings.getString("PanelMain.label_Beschreibung"), JLabel.CENTER); //$NON-NLS-1$
		c.gridy = 0;
		c.gridx = 0;
		c.fill = GridBagConstraints.VERTICAL; // F�llt das "K�stchen" von oben
												// nach unten aus (nicht links
												// rechts)
		c.insets = new Insets(0, 0, 10, 0); // L�sst 10 px nach unten Abstand
		pnBorderMitte.add(lbBeschreibung, c);

		// -------------------------------
		// ----JTextField-----------------
		// -------------------------------

		tfEingabeVokabel = new JTextField(Strings.getString("PanelMain.tf_EingabeVokabel")); //$NON-NLS-1$
		c.fill = GridBagConstraints.VERTICAL;
		c.gridy = 1;
		c.gridx = 0;
		tfEingabeVokabel.setForeground(Color.GRAY);
		tfEingabeVokabel.setToolTipText(Strings.getString("PanelMain.tf_EingabeVokabel_ToolTip")); //$NON-NLS-1$
		tfEingabeVokabel.setPreferredSize(new Dimension(200, 25)); // um
																	// gew�nschte
																	// Gr��e zu
																	// bekommen
		tfEingabeVokabel.setBorder(new LineBorder(Color.RED, 2));
		tfEingabeVokabel.requestFocus();
		tfEingabeVokabel.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				tfEingabeVokabel.setForeground(Color.BLACK);
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					if (tfEingabeVokabel.getText().equals("") || !isValid(tfEingabeVokabel.getText())) { //$NON-NLS-1$

					} else {
						if (tfEingabeVokabel.getText().equals("admin")) { //$NON-NLS-1$
							// MainFrame.panelAdmin();
						} else {
							btSuche.doClick();
						}
					}
				}

			}


			@Override
			public void keyReleased(KeyEvent e) {
				tfEingabeVokabel.setForeground(Color.BLACK);
				// Pr�fung der Eingabe mit Regex-Ausdr�cken
				if (tfEingabeVokabel.getText().equals("") || !isValid(tfEingabeVokabel.getText())) { //$NON-NLS-1$
					tfEingabeVokabel.setBorder(new LineBorder(Color.RED, 2));
					btSuche.setEnabled(false);
				} else {
					tfEingabeVokabel.setBorder(new LineBorder(Color.BLACK, 1));
					btSuche.setEnabled(true);
				}

			}

		});
		tfEingabeVokabel.addFocusListener(new FocusAdapter() {

			@Override
			public void focusGained(FocusEvent arg0) {
				tfEingabeVokabel.selectAll();

			}
		});
		pnBorderMitte.add(tfEingabeVokabel, c); // 95

		// ----------------------
		// -----JButtons---------
		// ----------------------

		btSuche = new JButton(Strings.getString("PanelMain.bt_Suche")); //$NON-NLS-1$
		btSuche.setBackground(Color.LIGHT_GRAY);
		btSuche.setForeground(Color.BLUE);
		btSuche.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Umstellen des
															// Cursors auf
															// Zeige-Cursor
		btSuche.setPreferredSize(new Dimension(90, 30));
		btSuche.setEnabled(false);
		btSuche.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Formauswahl(tfEingabeVokabel.getText());

			}
		});

		btBeenden = new JButton(Strings.getString("PanelMain.bt_Beenden")); //$NON-NLS-1$
		btBeenden.setBackground(Color.RED);
		btBeenden.setForeground(Color.BLACK);
		btBeenden.setBorderPainted(false); // keine "border"
		btBeenden.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btBeenden.setPreferredSize(new Dimension(90, 30));
		btBeenden.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		// -----------------------
		// ---Panel f�r Buttons---
		// -----------------------

		pnButtons = new JPanel();
		pnButtons.setLayout(new BoxLayout(pnButtons, BoxLayout.LINE_AXIS));
		pnButtons.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		c.fill = GridBagConstraints.VERTICAL;
		c.gridy = 2;
		c.gridx = 0;
		c.insets = new Insets(5, 0, 0, 0);

		pnButtons.add(Box.createHorizontalGlue());
		pnButtons.add(btSuche);
		pnButtons.add(Box.createRigidArea(new Dimension(20, 0))); // L�cke
																	// zwischen
																	// den zwei
																	// BUttons
																	// erstellen
		pnButtons.add(btBeenden);

		pnBorderMitte.add(pnButtons, c);

		add(pnBorderMitte, BorderLayout.CENTER);

	}


	private static boolean isValid(String s) {
		if (s.matches("[a-zA-Z\\\\s\\p{Blank}\\p{Alpha}]*")) //$NON-NLS-1$
			return true;

		return false;
	}

}
