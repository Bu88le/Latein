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
import wörter.akonjugation;
import wörter.ekonjugation;
import wörter.ikonjugation;
import wörter.konskonjugation;

public class PanelFuturII extends JPanel {
	CommonButton b1_indAkt, b3_indPas, b5_newVoc, b6_changeTense, b7_close;
	JLabel lb1_ad, lb2_ad;
	
	public PanelFuturII() {
		
		setLayout(null);
		
		b1_indAkt = new CommonButton("Indiaktiv & Aktiv", 50, 40, 200, 30);
		b1_indAkt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (akonjugation.akon) {
					lb1_ad.setText(akonjugation.getFuturIIAktiv());
				}
				if (ekonjugation.ekon) {
					lb1_ad.setText(ekonjugation.getFuturIIAktiv());
				}
				if (ikonjugation.ikon) {
					
				}
				if(konskonjugation.konskon) {
					
				}	
				
				lb2_ad.setText(GetPersonen.getPersonen());
				Main.mf.revalidaten();
			}
		});
		add(b1_indAkt);

		b3_indPas = new CommonButton("Indikativ & Passiv", 350, 40, 200, 30);
		b3_indPas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (ekonjugation.ekon) {
					lb1_ad.setText(ekonjugation.getFuturIIPassiv());
				}
				if (ikonjugation.ikon) {
					
				}
				if(konskonjugation.konskon) {
					
				}	
				if (akonjugation.akon) {
					lb1_ad.setText(akonjugation.getFuturIIPassiv());
					
				}
				lb2_ad.setText(GetPersonen.getPersonen());
				Main.mf.revalidaten();
				
			}
		});
		add(b3_indPas);
		
		lb1_ad = new JLabel("", JLabel.LEFT);
		lb1_ad.setFont(new Font("Calibri", Font.PLAIN,16));
		lb1_ad.setBounds(302, 100, 256, 175);
		lb1_ad.setBorder(new LineBorder(Color.BLACK, 1));
		add(lb1_ad);
		
		b5_newVoc = new CommonButton("Neue Vokabel", 150, 285, 140, 30, Color.LIGHT_GRAY, Color.BLUE);
		b5_newVoc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.panelMain();
				
			}
		});
		add(b5_newVoc);
		
		lb2_ad = new JLabel("", JLabel.RIGHT);
		lb2_ad.setFont(new Font("Calibri", Font.PLAIN,16));
		lb2_ad.setBounds(42,100, 256, 175);
		lb2_ad.setBorder(new LineBorder(Color.BLACK, 1));
		add(lb2_ad);
		
		b6_changeTense = new CommonButton("Andere Zeit", 310, 285, 140, 30, Color.LIGHT_GRAY, Color.BLUE);
		b6_changeTense.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.mf.panelTenseSelection();
				
			}
		});
		add(b6_changeTense);
		
		b7_close = new CommonButton("Beenden", 255, 325, 90, 30, Color.RED, Color.BLACK);
		b7_close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		add(b7_close);
	}
}
