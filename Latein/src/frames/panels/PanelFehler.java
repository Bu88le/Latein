package frames.panels;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import frames.buttons.CommonButton;
import latein.Main;

public class PanelFehler extends JPanel {

	CommonButton b1_show, b2_newvoc, b3_close;
	JLabel lb1_info;
	
	public PanelFehler() {
		setLayout(null);
		
		JLabel lb1_info = new JLabel("", JLabel.CENTER);
		lb1_info.setText("<html>Hmm... anscheinend ist deine Vokabel oder diese Form diesem Programm nicht bekannt. <p/> Um zu überprüfen, ob deine Vokabel existiert, klicke bitte auf den \"Überprüfung\"-Button unten. <p/><p/>Falls deine Vokabel nicht aufgelistet sein sollte, schreibe bitte eine <p/> E-Mail an: <u color = \"#0101DF\">bubblereg@gmx.de</u> <p/>Betreff: <u><font color=\"#0101DF\">fehlende Vokabel</font></u> <p/> deine Vokabel mit Bedeutungen als Inhalt. <p/> <p/> So können wir diesen Fehler möglichst schnell beheben");
		lb1_info.setBounds(5, 5, 600, 200);
		add(lb1_info);
		
		b1_show = new CommonButton("Überprüfung", 215, 220, 130, 30, Color.LIGHT_GRAY, Color.BLUE);
		b1_show.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.mf.panelAlleVocs();				
			}
			
		});
		add(b1_show);
		
		b2_newvoc = new CommonButton("Neue Vokabel", 215, 300, 130, 30, Color.LIGHT_GRAY, Color.BLUE);
		b2_newvoc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.mf.panelMain();				
			}
			
		});
		add(b2_newvoc);
		
		b3_close = new CommonButton("Beenden", 215, 340, 130, 30, Color.RED, Color.BLACK);
		b3_close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);				
			}
			
		});
		add(b3_close);
	}
}
