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

public class PanelPerfekt extends CommonPanel {

	JPanel pageStart, pageStart_Oben, pageStart_Unten;
	JButton b1_AktivIndikativ, b2_AktivKonjunktiv, b3_PassivIndikativ, b4_PassivKonjunktiv;
	JLabel lb1_numerus, lb2_voc;
	JScrollPane sp1_numerus, sp2_vocs;
	GridBagConstraints c = new GridBagConstraints();
	String numerus = "<html><font size=4>";


	public PanelPerfekt(JPanel caller) {
		super(caller);
		initGUI();
	}


	private void initGUI() {
		pageStart = new JPanel();
		pageStart.setLayout(new BoxLayout(pageStart, BoxLayout.Y_AXIS));
		pageStart.setMinimumSize(new Dimension(getWidth(), 95));

		pageStart_Oben = new JPanel();
		pageStart_Oben.setLayout(new BoxLayout(pageStart_Oben, BoxLayout.LINE_AXIS));
		pageStart_Oben.setBorder(BorderFactory.createEmptyBorder(10, 75, 5, 75));

		b1_AktivIndikativ = new JButton("Aktiv & Indikativ");
		b1_AktivIndikativ.setBackground(Color.BLACK);
		b1_AktivIndikativ.setForeground(Color.WHITE);
		b1_AktivIndikativ.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b1_AktivIndikativ.setPreferredSize(new Dimension(200, 30));
		b1_AktivIndikativ.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (Auswahl.aKon) {
					umschreibenAufString(AKonjugation.returnPerfektAktivIndikativ());
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
					umschreibenAufString(AKonjugation.returnPerfektPassivIndikativ());
				}

			}
		});

		pageStart_Oben.add(b1_AktivIndikativ);
		pageStart_Oben.add(Box.createHorizontalGlue());
		pageStart_Oben.add(b3_PassivIndikativ);

		pageStart_Unten = new JPanel();
		pageStart_Unten.setLayout(new BoxLayout(pageStart_Unten, BoxLayout.LINE_AXIS));
		pageStart_Unten.setBorder(BorderFactory.createEmptyBorder(0, 75, 10, 75));

		b2_AktivKonjunktiv = new JButton("Aktiv & Konjunktiv");
		b2_AktivKonjunktiv.setBackground(Color.BLACK);
		b2_AktivKonjunktiv.setForeground(Color.WHITE);
		b2_AktivKonjunktiv.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b2_AktivKonjunktiv.setPreferredSize(new Dimension(200, 30));
		b2_AktivKonjunktiv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (Auswahl.aKon) {
					umschreibenAufString(AKonjugation.returnPerfektAktivKonjunktiv());
				}

			}
		});

		b4_PassivKonjunktiv = new JButton("Passiv & Konjunktiv");
		b4_PassivKonjunktiv.setBackground(Color.BLACK);
		b4_PassivKonjunktiv.setForeground(Color.WHITE);
		b4_PassivKonjunktiv.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b4_PassivKonjunktiv.setPreferredSize(new Dimension(200, 30));
		b4_PassivKonjunktiv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (Auswahl.aKon) {
					umschreibenAufString(AKonjugation.returnPerfektPassivKonjunktiv());
				}

			}
		});

		pageStart_Unten.add(b2_AktivKonjunktiv);
		pageStart_Unten.add(Box.createHorizontalGlue());
		pageStart_Unten.add(b4_PassivKonjunktiv);

		pageStart.add(pageStart_Oben, c);

		pageStart.add(pageStart_Unten, c);

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
