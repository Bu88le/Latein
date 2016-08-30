package frames.panels;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import frames.MainFrame;
import frames.buttons.CommonButton;
import latein.Main;
import �bersetzung.�bergabeNomen;

public class PanelAuswahl�berpr�fung extends JPanel {
	
	CommonButton b1_verben, b2_nomen, b3_back, b4_beenden;
	
	public PanelAuswahl�berpr�fung() {
		
setLayout(null);
		
		b1_verben = new CommonButton("�berpr�fung Verben", 150, 95);
		b1_verben.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.mf.panelAlleVerben();
				
			}
		});
		add(b1_verben);
		
		b2_nomen = new CommonButton("�berpr�fung Nomen", 150, 130);
		b2_nomen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.mf.panelAlleNomen();
				
			}
		});
		add(b2_nomen);
		
		b3_back = new CommonButton("Zur�ck", 255, 285, 90, 30, Color.LIGHT_GRAY, Color.BLUE);
		b3_back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.mf.panelFehler();
				
			}
		});
		add(b3_back);
		
		
		b4_beenden = new CommonButton("Beenden", 255, 325, 90, 30, Color.RED, Color.BLACK);
		b4_beenden.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		add(b4_beenden);
	}
}
