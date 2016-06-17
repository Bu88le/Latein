package frames.panels;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JPanel;

import frames.buttons.CommonButton;
import latein.Main;

public class PanelÜbersetzungsFehler extends JPanel {

	CommonButton b1_go, b2_close, b3_email;
	public static JLabel lb1_anzeige, lb2_hinweis;
	
	public PanelÜbersetzungsFehler() {
		setLayout(null);
		
		lb1_anzeige = new JLabel("", JLabel.CENTER);
		lb1_anzeige.setText("<html> Wenn du glaubst einen Übersetzungsfehler gefunden zu haben, schreibe bitte eine <p/> E-Mail an: <u color = \"#0101DF\">bubblereg@gmx.de</u> <p/>Betreff: <u><font color=\"#0101DF\">falsche Übersetzung</font></u> <p/> und der richtigen Übersetzung als Inhalt. <p/> <p/> So können wir deinen Antrag besser zuordnen und somit schneller beantowrten<html/>");
		lb1_anzeige.setBounds(10, 10, 575, 250);
		lb1_anzeige.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				b1_go.doClick();				
			}
		});
		add(lb1_anzeige);
		
		b1_go = new CommonButton("OK", 315, 290, 150, 30, Color.LIGHT_GRAY, Color.BLUE);
		b1_go.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.mf.panelÜbersetzung();				
			}
			
		});
		add(b1_go);
		
		b2_close = new CommonButton("Beenden", 225, 330, 120, 30, Color.RED, Color.BLACK);
		b2_close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);			
			}
		});
		add(b2_close);
		
		lb2_hinweis = new JLabel("Das E-Mail Programm konnte leider nicht automatisch gestartet werden", JLabel.CENTER);
		lb2_hinweis.setBounds(50,240,500,40);
		lb2_hinweis.setFont(new Font("Calibri", Font.PLAIN, 15));
		lb2_hinweis.setVisible(false);
		add(lb2_hinweis);
		
		b3_email = new CommonButton("E-Mail verfassen", 135,290,150,30, Color.LIGHT_GRAY, Color.BLUE);
		b3_email.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					new ProcessBuilder( "cmd", "/c", "start", "/B","mailTo:bubblereg@gmx.de").start();
				} catch (IOException e1) {
					e1.printStackTrace();
					lb2_hinweis.setVisible(true);
					Main.mf.revalidaten();
				}				
			}
		});
		b3_email.setToolTipText("Ein Mausklick öffnet das Standard Email-Programm");
		add(b3_email);
	}
	
}
