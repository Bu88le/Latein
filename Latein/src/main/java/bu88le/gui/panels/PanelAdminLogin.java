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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import bu88le.gui.MainFrame;
import bu88le.gui.Strings;
import logic.Formauswahl;

public class PanelAdminLogin extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7525584547160367933L;

	JTextField tfEingabeVokabel;
	JButton btSuche, btBeenden, adminAccess;
	JPanel pnPlatzhalterOBEN, pnPlatzhalterLinks, pnPlatzhalterRechts, pnBorderMitte, pnButtons, pwField;
	JLabel lbBeschreibung;
	public static JPasswordField jpwField;
	private GridBagConstraints c = new GridBagConstraints();


	public PanelAdminLogin() {
		setLayout(new BorderLayout(10, 10));
		initGUI();
	}


	private void initGUI() {
		// Panel, das in die Mitte eingesetzt wird
		pnBorderMitte = new JPanel();
		pnBorderMitte.setLayout(new GridBagLayout());

		// Label, das auffordert die Vokabel einzugeben
		lbBeschreibung = new JLabel(Strings.getString("PanelMain.label_Beschreibung"), SwingConstants.CENTER); //$NON-NLS-1$
		c.gridy = 0;
		c.gridx = 0;
		c.fill = GridBagConstraints.VERTICAL; // Füllt das "Kästchen" von oben
												// nach unten aus (nicht links
												// rechts)
		c.insets = new Insets(0, 0, 10, 0); // Lässt 10 px nach unten Abstand
		pnBorderMitte.add(lbBeschreibung, c);

		// -------------------------------
		// ----JTextField-----------------
		// -------------------------------

		tfEingabeVokabel = new JTextField();
		c.fill = GridBagConstraints.VERTICAL;
		c.gridy = 1;
		c.gridx = 0;
		tfEingabeVokabel.setForeground(Color.GRAY);
		tfEingabeVokabel.setToolTipText(Strings.getString("PanelMain.tf_EingabeVokabel_ToolTip")); //$NON-NLS-1$
		tfEingabeVokabel.setPreferredSize(new Dimension(200, 25)); // um
																	// gewünschte
																	// Größe zu
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
							PanelMain.tfEingabeVokabel.setText(tfEingabeVokabel.getText());
							btSuche.doClick();
						}
					}
				}

			}


			@Override
			public void keyReleased(KeyEvent e) {
				tfEingabeVokabel.setForeground(Color.BLACK);
				// Prüfung der Eingabe mit Regex-Ausdrücken
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
		btSuche.setBackground(Color.BLACK);
		btSuche.setForeground(Color.WHITE);
		btSuche.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Umstellen des
															// Cursors auf
															// Zeige-Cursor
		btSuche.setPreferredSize(new Dimension(90, 30));
		btSuche.setEnabled(false);
		btSuche.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					new Formauswahl(tfEingabeVokabel.getText().toLowerCase());
				} catch (IllegalArgumentException iae) {
					// TODO
				} catch (Exception ex) {

				}

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
		// ---Panel für Buttons---
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
		pnButtons.add(Box.createRigidArea(new Dimension(20, 0))); // Lücke
																	// zwischen
																	// den zwei
																	// BUttons
																	// erstellen
		pnButtons.add(btBeenden);

		pnBorderMitte.add(pnButtons, c);

		add(pnBorderMitte, BorderLayout.CENTER);

		pwField = new JPanel();
		pwField.setLayout(new GridBagLayout());

		jpwField = new JPasswordField();
		jpwField.setPreferredSize(new Dimension(200, 25));
		jpwField.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					adminAccess.doClick();
				}
			}
		});

		adminAccess = new JButton("Admin Access");
		adminAccess.setBackground(Color.BLACK);
		adminAccess.setForeground(Color.RED);
		adminAccess.setCursor(new Cursor(Cursor.HAND_CURSOR));
		adminAccess.setPreferredSize(new Dimension(120, 30));
		adminAccess.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (String.valueOf(jpwField.getPassword()).equals("back")
						|| String.valueOf(jpwField.getPassword()).equals("b")) {
					MainFrame.panelMain();
				} else if (String.valueOf(jpwField.getPassword()).equals("latein")) {
					MainFrame.panelAdminMenu();
				}

			}
		});

		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.VERTICAL;
		c.insets = new Insets(5, 0, 10, 0);
		pwField.add(jpwField, c);

		c.gridy = 1;
		pwField.add(adminAccess, c);
		add(pwField, BorderLayout.PAGE_END);
	}


	private static boolean isValid(String s) {
		if (s.matches("[a-zA-Z\\p{Blank}ß~üäö]*")) //$NON-NLS-1$
			return true;

		return false;
	}

}
