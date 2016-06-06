package frames.panels;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;

import frames.buttons.CommonButton;
import latein.Main;

public class Panel‹bersetzungsFehler extends JPanel {

	CommonButton b1_go, b2_close;
	public static JLabel lb1_anzeige;
	
	public Panel‹bersetzungsFehler() {
		setLayout(null);
		
		lb1_anzeige = new JLabel("", JLabel.CENTER);
		lb1_anzeige.setText("<html> Wenn du glaubst einen ‹bersetzungsfehler gefunden zu haben, schreibe bitte eine <p/> E-Mail an: <u color = \"#0101DF\">bubblereg@gmx.de</u> <p/>Betreff: <u><font color=\"#0101DF\">falsche ‹bersetzung</font></u> <p/> und der richtigen ‹bersetzung als Inhalt. <p/> <p/> So kˆnnen wir deinen Antrag besser zuordnen und somit schneller beantowrten<html/>");
		lb1_anzeige.setBounds(10, 10, 575, 250);
		lb1_anzeige.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				b1_go.doClick();				
			}
		});
		add(lb1_anzeige);
		
		b1_go = new CommonButton("OK", 255, 290, 90, 30, Color.LIGHT_GRAY, Color.BLUE);
		b1_go.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.mf.panel‹bersetzung();				
			}
			
		});
		add(b1_go);
		
		b2_close = new CommonButton("Beenden", 255, 330, 90, 30, Color.RED, Color.BLACK);
		b2_close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);			
			}
		});
		add(b2_close);
		
	}
	
}
