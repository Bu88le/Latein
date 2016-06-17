package frames.panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import frames.buttons.CommonButton;
import latein.Main;
import übersetzung.ReverseAusgabe;
import übersetzung.uea;

public class PanelAusgabeReverse extends JPanel {
	JLabel lb1_anzeige;
	JScrollPane sp1;
	CommonButton b1_go;
	
	public PanelAusgabeReverse() {
		setLayout(null);
		
		lb1_anzeige = new JLabel(ReverseAusgabe.getAusgabeReverse().toString(), JLabel.CENTER);
		lb1_anzeige.setFont(new Font("Calibri", Font.PLAIN, 15));
		lb1_anzeige.setForeground(Color.BLACK);
		
		sp1 = new JScrollPane(lb1_anzeige, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
		            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sp1.setBounds(10, 5, 575, 320);
		sp1.setVisible(true);
		sp1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					b1_go.doClick();
				}					
			}
		});
		add(sp1);
		
		b1_go = new CommonButton("OK", 255, 340, 90, 30, Color.LIGHT_GRAY, Color.BLUE);
		b1_go.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.mf.panelMain();				
			}
		});
		add(b1_go);
	}
}
