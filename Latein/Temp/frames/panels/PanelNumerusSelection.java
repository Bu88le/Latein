package frames.panels;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import frames.MainFrame;
import frames.buttons.CommonButton;
import latein.Main;
import übersetzung.ÜbergabeNomen;
import übersetzung.übergabe;

public class PanelNumerusSelection extends JPanel {

	CommonButton b1_singular, b2_plural, b3_newVoc,b4_Translation,b5_Close;
	
	public PanelNumerusSelection() {
		
		setLayout(null);
		
		b1_singular = new CommonButton("Singular", 150, 95);
		b1_singular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.mf.panelSingular();
				
			}
		});
		add(b1_singular);
		
		b2_plural = new CommonButton("Plural", 150, 130);
		b2_plural.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.mf.panelPlural();
				
			}
		});
		add(b2_plural);
		
		b3_newVoc = new CommonButton("Neue Vokabel", 150, 285, 140, 30, Color.LIGHT_GRAY, Color.BLUE);
		b3_newVoc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.panelMain();
				
			}
		});
		add(b3_newVoc);
		
		b4_Translation = new CommonButton("Übersetzung", 310, 285, 140, 30, Color.LIGHT_GRAY, Color.BLUE);
		b4_Translation.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(b2_plural, ÜbergabeNomen.returngv());
				
			}
		});
		add(b4_Translation);
		
		b5_Close = new CommonButton("Beenden", 255, 325, 90, 30, Color.RED, Color.BLACK);
		b5_Close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		add(b5_Close);
	}
}
