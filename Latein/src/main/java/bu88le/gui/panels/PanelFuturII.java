package bu88le.gui.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import logic.Auswahl;
import wordShaping.AKonjugation;

public class PanelFuturII extends CommonPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2042430984419128318L;
	JPanel pageStart, pageStart_Oben, pageStart_Unten;
	JButton b1_AktivIndikativ, b2_AktivKonjunktiv, b3_PassivIndikativ, b4_PassivKonjunktiv;
	JLabel lb1_numerus, lb2_voc;
	JScrollPane sp1_numerus, sp2_vocs;
	GridBagConstraints c = new GridBagConstraints();
	String numerus = "<html><font size=4>";


	public PanelFuturII(JPanel caller) {
		super(caller);
		initGUI();
	}


	private void initGUI() {
		pageStart = new JPanel();
		pageStart.setLayout(new BoxLayout(pageStart, BoxLayout.Y_AXIS));
		pageStart.setMinimumSize(new Dimension(getWidth(), 95));

		pageStart_Oben = new JPanel();
		pageStart_Oben.setLayout(new BoxLayout(pageStart_Oben, BoxLayout.LINE_AXIS));
		pageStart_Oben.setBorder(BorderFactory.createEmptyBorder(35, 75, 20, 75));

		b1_AktivIndikativ = new JButton("Aktiv & Indikativ");
		b1_AktivIndikativ.setBackground(Color.BLACK);
		b1_AktivIndikativ.setForeground(Color.WHITE);
		b1_AktivIndikativ.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b1_AktivIndikativ.setPreferredSize(new Dimension(200, 30));
		b1_AktivIndikativ.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (Auswahl.aKon) {
					umschreibenAufString(AKonjugation.returnFuturIIAktivIndikativ());
				}

			}
		});

		b3_PassivIndikativ = new JButton("Passiv & Indikativ");
		b3_PassivIndikativ.setBackground(Color.BLACK);
		b3_PassivIndikativ.setForeground(Color.WHITE);
		b3_PassivIndikativ.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b3_PassivIndikativ.setPreferredSize(new Dimension(200, 30));
		b3_PassivIndikativ.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (Auswahl.aKon) {
					umschreibenAufString(AKonjugation.returnFuturIIPassivIndikativ());
				}

			}
		});

		pageStart_Oben.add(b1_AktivIndikativ);
		pageStart_Oben.add(Box.createHorizontalGlue());
		pageStart_Oben.add(b3_PassivIndikativ);

		pageStart.add(pageStart_Oben, c);

		add(pageStart, BorderLayout.PAGE_START);

		lb1_numerus = new JLabel("", JLabel.CENTER);
		for (int i = 1; i < 4; i++) {
			numerus += i + ". Person Sg.";
			numerus += "<p/>";
		}
		numerus += "<p/>";
		for (int i = 1; i < 4; i++) {
			numerus += i + ". Person Pl.";
			numerus += "<p/>";
		}
		lb1_numerus.setText(numerus);
		lb1_numerus.setPreferredSize(new Dimension(275, 150));

		sp1_numerus = new JScrollPane(lb1_numerus);
		add(sp1_numerus, BorderLayout.LINE_START);

		lb2_voc = new JLabel("", JLabel.CENTER);
		lb2_voc.setPreferredSize(new Dimension(275, 150));

		sp2_vocs = new JScrollPane(lb2_voc);
		add(sp2_vocs, BorderLayout.LINE_END);

	}


	private void umschreibenAufString(String[] arr) {
		String voc = "<html><font size=4 color=blue>";
		for (int i = 0; i < 3; i++) {
			voc += arr[i];
			voc += "<p/>";
		}
		voc += "<p/>";
		for (int i = 3; i < 6; i++) {
			voc += arr[i];
			voc += "<p/>";
		}
		lb2_voc.setText(voc);
	}

}
