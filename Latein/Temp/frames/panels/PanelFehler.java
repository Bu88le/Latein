package frames.panels;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JPanel;

import frames.buttons.CommonButton;
import latein.Main;

public class PanelFehler extends JPanel {

	CommonButton b1_show, b2_newvoc, b3_close, b4_email;
	JLabel lb1_info;
	static JLabel lb2_hinweis;
	
	public PanelFehler() {
		setLayout(null);
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		
		JLabel lb1_info = new JLabel("", JLabel.CENTER);
		lb1_info.setText("<html>Hmm... anscheinend ist deine Vokabel oder diese Form diesem Programm nicht bekannt. <p/> Um zu überprüfen, ob deine Vokabel existiert, klicke bitte auf den \"Überprüfung\"-Button unten. <p/><p/>Falls deine Vokabel nicht aufgelistet sein sollte, schreibe bitte eine <p/> E-Mail an: <u color = \"#0101DF\">bubblereg@gmx.de</u> <p/>Betreff: <u><font color=\"#0101DF\">fehlende Vokabel</font></u> <p/> deine Vokabel mit Bedeutungen als Inhalt. <p/> <p/> So können wir diesen Fehler möglichst schnell beheben");
		lb1_info.setBounds(5, 5, 600, 200);
		add(lb1_info);
		
		b1_show = new CommonButton("Überprüfung", 235, 205, 130, 30, Color.LIGHT_GRAY, new Color(0,128,0));
		b1_show.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.mf.panelAuswahlÜberprüfung();				
			}
			
		});
		add(b1_show);
		
		b2_newvoc = new CommonButton("Neue Vokabel", 315, 290, 150, 30, Color.LIGHT_GRAY, Color.BLUE);
		b2_newvoc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.mf.panelMain();				
			}
			
		});
		add(b2_newvoc);
		
		b3_close = new CommonButton("Beenden", 235, 330, 120, 30, Color.RED, Color.BLACK);
		b3_close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);				
			}
			
		});
		b3_close.setFont(new Font("Calibri", Font.ITALIC, 15));
		add(b3_close);
		
		lb2_hinweis = new JLabel("Das E-Mail Programm konnte leider nicht automatisch gestartet werden", JLabel.CENTER);
		lb2_hinweis.setBounds(50,240,500,40);
		lb2_hinweis.setFont(new Font("Calibri", Font.PLAIN, 15));
		lb2_hinweis.setVisible(false);
		add(lb2_hinweis);
		
		b4_email = new CommonButton("E-Mail verfassen", 135, 290, 150, 30, Color.LIGHT_GRAY, Color.BLUE);
		b4_email.addActionListener(new ActionListener() {
			
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
		add(b4_email);
	}
	
}
