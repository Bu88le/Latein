package frames.panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import frames.MainFrame;
import frames.buttons.CommonButton;
import latein.Main;
import wörter.ADeklination;

public class PanelPlural extends JPanel {
	CommonButton b1_newVoc, b2_changeTense, b3_close;
	JLabel lb1_ad, lb2_ad;
	
	public PanelPlural() {
		
		setLayout(null);
		
		lb1_ad = new JLabel("", JLabel.LEFT);
		lb1_ad.setFont(new Font("Calibri", Font.PLAIN,16));
		lb1_ad.setBounds(302, 50, 256, 175);
		lb1_ad.setBorder(new LineBorder(Color.BLACK, 1));
		if (ADeklination.ADek == true) {
			lb1_ad.setText(ADeklination.getPlural());
		}
		add(lb1_ad);
		
		lb2_ad = new JLabel(GetKasi.returnGetKasiSingular(), JLabel.RIGHT);
		lb2_ad.setFont(new Font("Calibri", Font.PLAIN,16));
		lb2_ad.setBounds(42,50, 256, 175);
		lb2_ad.setBorder(new LineBorder(Color.BLACK, 1));
		add(lb2_ad);
		
		b1_newVoc = new CommonButton("Neue Vokabel", 150, 285, 140, 30, Color.LIGHT_GRAY, Color.BLUE);
		b1_newVoc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.panelMain();
				
			}
		});
		add(b1_newVoc);
		
		b2_changeTense = new CommonButton("Anderer Numerus", 310, 285, 140, 30, Color.LIGHT_GRAY, Color.BLUE);
		b2_changeTense.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.mf.panelNumerusSelection();
				
			}
		});
		add(b2_changeTense);
		
		b3_close = new CommonButton("Beenden", 255, 325, 90, 30, Color.RED, Color.BLACK);
		b3_close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		add(b3_close);
	}
}
