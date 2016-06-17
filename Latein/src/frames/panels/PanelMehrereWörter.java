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
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;

import frames.MainFrame;
import frames.buttons.CommonButton;
import wörter.akonjugation;
import zeiten.Auswahl;

public class PanelMehrereWörter extends JPanel {
	
	JTextField tf1_eingabe;
	JLabel lb1_anzeige, lb2_hinweis;
	JScrollPane sp1;
	CommonButton b1_go, b2_close;
	
	public PanelMehrereWörter(StringBuffer sb) {
		setLayout(null);
		
		lb2_hinweis = new JLabel("Ihre Vokabel trifft auf mehrere lateinische Wörter zu! Bitte wählen sie eine Vokabel aus:", JLabel.CENTER);
		lb2_hinweis.setFont(new Font("Calibri", Font.PLAIN, 15));
		lb2_hinweis.setForeground(new Color(0,128,0));
		lb2_hinweis.setBounds(0,5,600,20);
		
		lb1_anzeige = new JLabel(sb.toString(), JLabel.CENTER);
		lb1_anzeige.setFont(new Font("Calibri", Font.PLAIN, 15));
		lb1_anzeige.setForeground(Color.BLACK);
		
		sp1 = new JScrollPane(lb1_anzeige, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
		            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sp1.setBounds(5,25,575,210);
		add(sp1);
		
		tf1_eingabe = new JTextField("", 15);
		tf1_eingabe.setBounds(200, 225, 200, 20);
		tf1_eingabe.setBorder(new LineBorder(Color.RED));
		tf1_eingabe.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					if (tf1_eingabe.getText().equals("") || !isValid(tf1_eingabe.getText())) {
						
					}else {
						if (sb.toString().contains(tf1_eingabe.getText())) {
							b1_go.doClick();
						}else {
							
						}
					}
				}
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (tf1_eingabe.getText().equals("") || !isValid(tf1_eingabe.getText())) {
					tf1_eingabe.setBorder(new LineBorder(Color.RED, 2));
					b1_go.setEnabled(false);
				}else {
					tf1_eingabe.setBorder(new LineBorder(Color.BLACK, 1));
					b1_go.setEnabled(true);
				}
				
			}
		});
		add(tf1_eingabe);
		
		b1_go = new CommonButton("Go", 255, 265, 90, 30, Color.LIGHT_GRAY, Color.BLUE);
		b1_go.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (Auswahl.akon) {
					new akonjugation(tf1_eingabe.getText(),tf1_eingabe.getText().substring(0, tf1_eingabe.getText().length()-1));
				}
			}
		});
	}
	
	private static boolean isValid(String s) {
		if (s.matches("[a-zA-Z\\\\s\\p{Blank}\\p{Alpha}]*"))
			return true;
		
		return false;
	}

}
