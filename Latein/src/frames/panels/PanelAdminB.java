package frames.panels;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import frames.MainFrame;
import frames.buttons.CommonButton;
import latein.Main;

public class PanelAdminB extends JPanel {
	
	CommonButton b1_vocSearch, b2_allVocs, b3, b4_close, b5, b6, b7;
	
	public PanelAdminB() {
		setLayout(null);
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		
		b1_vocSearch = new CommonButton("Vokabel Suchen", 195, 100, 200, 30);
		b1_vocSearch.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.mf.panelMain();				
			}
			
		});
		add(b1_vocSearch);
		
		b2_allVocs = new CommonButton("Alle Verben anzeigen", 385, 140, 200, 30);
		b2_allVocs.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setCursor(new Cursor(Cursor.WAIT_CURSOR));
				Main.mf.panelAlleVerben();				
			}
			
		});
		add(b2_allVocs);
		
		b3 = new CommonButton("Alle Nomen anzeigen", 385, 180, 200, 30);
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setCursor(new Cursor(Cursor.WAIT_CURSOR));
				Main.mf.panelAlleNomen();				
			}
			
		});
		add(b3);
		
		b4_close = new CommonButton("Beenden", 195, 220, 200, 30, Color.RED, Color.BLACK);
		b4_close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);				
			}
			
		});
		add(b4_close);
		
		b5 = new CommonButton("Button5", 5, 180, 200, 30);
		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		add(b5);
		
		b6 = new CommonButton("Button 6", 5, 140, 200, 30);
		b6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		add(b6);
	}

}
