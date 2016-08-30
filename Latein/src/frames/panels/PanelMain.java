package frames.panels;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import frames.MainFrame;
import frames.buttons.CommonButton;
import latein.Formauswahl;
import latein.Main;
import übersetzung.ReverseAusgabe;

public class PanelMain extends JPanel {
	
	public static String gv;
	static CommonButton b1_Suchen, b2_Beenden, b3_reverseSuche;
	public static JTextField tf1_vocinput;
	JLabel lb1_desc;
	
	public PanelMain() {

		setLayout(null);
		
		b1_Suchen = new CommonButton("Suchen",150, 190, 150, 30);
		b1_Suchen.setEnabled(false);
		b1_Suchen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (tf1_vocinput.getText().equals("") || !isValid(tf1_vocinput.getText())) {
					
				}else {
					if (tf1_vocinput.getText().equals("admin")) {
						MainFrame.panelAdmin();
					}else {
						setCursor(new Cursor(Cursor.WAIT_CURSOR));
						gv = tf1_vocinput.getText();
						new Formauswahl(tf1_vocinput.getText());
					}
				}				
			}
			
		});
		add(b1_Suchen);
		
		
		b2_Beenden = new CommonButton("Beenden", 240, 225, 120, 30, Color.RED, Color.BLACK);
		b2_Beenden.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
			
		});
		add(b2_Beenden);
		
		tf1_vocinput = new JTextField("");
		tf1_vocinput.setToolTipText("<html><center><font color=#585858 size=3>" + 
				"Gib deine gesuchte Vokabel hier ein" + "</font></center></html>");
		tf1_vocinput.setBounds(200, 150, 200, 25);
		tf1_vocinput.setBorder(new LineBorder(Color.RED, 2));
		tf1_vocinput.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					if (tf1_vocinput.getText().equals("") || !isValid(tf1_vocinput.getText())) {
						
					}else {
						if (tf1_vocinput.getText().equals("admin")) {
							MainFrame.panelAdmin();
						}else {
							b1_Suchen.doClick();
						}
					}
				}
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (tf1_vocinput.getText().equals("") || !isValid(tf1_vocinput.getText())) {
					tf1_vocinput.setBorder(new LineBorder(Color.RED, 2));
					b1_Suchen.setEnabled(false);
					b3_reverseSuche.setEnabled(false);
				}else {
					tf1_vocinput.setBorder(new LineBorder(Color.BLACK, 1));
					b1_Suchen.setEnabled(true);
					b3_reverseSuche.setEnabled(true);
				}
				
			}
			
		});
		add(tf1_vocinput);
		
		lb1_desc = new JLabel("Gesuchte Vokabel", JLabel.CENTER);
		lb1_desc.setBounds(200, 125, 200, 10);
		add(lb1_desc);
		
		b3_reverseSuche = new CommonButton("Rückwärtssuche", 310, 190, 150, 30);
		b3_reverseSuche.setEnabled(false);
		b3_reverseSuche.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (tf1_vocinput.getText().equals("") || !isValid(tf1_vocinput.getText())) {
					
				}else {
					setCursor(new Cursor(Cursor.WAIT_CURSOR));
					ReverseAusgabe.ausgabeUEA(tf1_vocinput.getText());
					
				}
				
			}
		});
		add(b3_reverseSuche);
		
	}
	
	private static boolean isValid(String s) {
		if (s.matches("[a-zA-Z\\\\s\\p{Blank}\\p{Alpha}]*"))
			return true;
		
		return false;
	}

}
