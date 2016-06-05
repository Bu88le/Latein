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
import wörter.akonjugation;
import übersetzung.zusammenfassung;

public class PanelAlleVocs extends JPanel {
	
	JLabel lb1_vocs;
	JScrollPane sp1_anzeige;
	CommonButton b1_go;
	
	public PanelAlleVocs() {
		setLayout(null);
		
		lb1_vocs = new JLabel(zusammenfassung.returnallevocs(), JLabel.CENTER);
		lb1_vocs.setFont(new Font("Calibri", Font.PLAIN, 15));
		lb1_vocs.setForeground(Color.BLACK);
		
		sp1_anzeige = new JScrollPane(lb1_vocs, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
	            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sp1_anzeige.setBounds(10, 5, 575, 320);
		sp1_anzeige.setVisible(true);
		sp1_anzeige.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					b1_go.doClick();
				}					
			}
		});
		add(sp1_anzeige);
		
		b1_go = new CommonButton("OK", 255, 340, 90, 30, Color.LIGHT_GRAY, Color.BLUE);
		b1_go.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.mf.panelAdminB();
				
			}
			
		});	
		add(b1_go);
	}
}
