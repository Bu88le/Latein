package frames.panels;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import frames.MainFrame;
import frames.buttons.CommonButton;
import latein.Formauswahl;
import latein.Main;
import übersetzung.ReverseAusgabe;

/*
 * Klasse erbt von JPanel
 */
public class PanelAdmin extends JPanel {
	
	/*
	 * lb1_desc zur Description
	 * lb2_hint zur Anzeige eines Passwort Hinweises
	 */
	private static JLabel lb1_desc, lb2_hint;
	
	/*
	 * tf1_vocinput zur Eingabe der gersuchten Vokabel
	 */
	private static JTextField tf1_vocinput;
	
	/*
	 * b1_Suchen zum Starten der Suche nach der eingegeben Vokabel
	 * b2_Beenden zum Beenden des Programms
	 * b3_Admin zum Aufruf des AdminPanels bei richtiger Passwort-Eingabe
	 * b4_reverseAusgabe zur Rückwärtssuche
	 */
	private static CommonButton b1_Suchen, b2_Beenden, b3_Admin, b4_reverseSuche;
	
	/*
	 * pwf_login zur Eingabe des Passworts für AdminPanel
	 */
	public static JPasswordField pwf_login;
	
	/*
	 * Konstruktor
	 */
	public PanelAdmin() {
		/*
		 * Layout des geerbten Panels auf 'null' setzen, damit Komponenten frei gesetzt werden können
		 */
		setLayout(null);
		
		
		
		
		/*
		 * Initialisieren des Panels lb1_desc
		 */
		lb1_desc = new JLabel("Gesuchte Vokabel", JLabel.CENTER);
		/*
		 * Grenzen des Panels werden gesetzt:
		 * x:200 - y:50 - Länge:200 - Höhe:10
		 */
		lb1_desc.setBounds(200, 50, 200, 10);
		/*
		 * lb1_desc wird dem geerbten JPanel hinzugefügt
		 */
		add(lb1_desc);
		
		
		
		
		/*
		 * tf1_vocinput wird initialisiert
		 */
		tf1_vocinput = new JTextField("");
		/*
		 * ToolTipText für t11_vocinput wird gesetzt
		 */
		tf1_vocinput.setToolTipText("<html><center><font color=#585858 size=3>" + 
				"Gib deine gesuchte Vokabel hier ein" + "</font></center></html>");
		/*
		 * Grenzen des Textfelds werden gesetzt:
		 * x:200 - y:75 - l:200 - h:25
		 */
		tf1_vocinput.setBounds(200, 75, 200, 25);
		/*
		 * Rahmen des tf1_vocinput bekommt die Farbe schwarz und die Dicke 1
		 */
		tf1_vocinput.setBorder(new LineBorder(Color.BLACK, 1));
		/*
		 * KeyListener wird dem TextField hinzugefügt
		 */
		tf1_vocinput.addKeyListener(new KeyAdapter() {
			@Override
			/*
			 * Wenn Taste gedrückt wird:
			 */
			public void keyPressed(KeyEvent e) {
				/*
				 * Wenn gedrückte Taste ENTER ist
				 */
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					/*
					 * Wenn Eingabe leer ist oder ungültige Zeichen (siehe Methode isValid) enthält, dann mache nichts,
					 * sonst rufe Klasse Formauswahl auf und übergebé die Eingabe des Textfelds
					 */
					/*
					 * !isValid(tf1_vocinput.getText() bewirkt, dass true zurückgeliefert wird, sobald ein ungültiges Zeichen enthalten ist
					 */
					if (tf1_vocinput.getText().equals("") || !isValid(tf1_vocinput.getText())) {
						
					}else {
						b1_Suchen.doClick();
					}
				}
				
			}

			@Override
			/*
			 * Wenn Taste losgelassen wird:
			 */
			public void keyReleased(KeyEvent e) {
				/*
				 * Wenn Einageb leer oder ungültig ist:
				 * setze Rahmen von tf1_vocinput rot mit Dicke 2
				 * b1_Suchen und b4_reverseSuche setEnabled(false)
				 */
				if (tf1_vocinput.getText().equals("") || !isValid(tf1_vocinput.getText())) {
					tf1_vocinput.setBorder(new LineBorder(Color.RED, 2));
					b1_Suchen.setEnabled(false);
					b4_reverseSuche.setEnabled(false);
				/*
				 * sonst setze Rahmen von tf1_vocinput Schwarz mit Dicke 1
				 * b1_Suchen und b4_reverseSuche setEnabled(true)
				 */
				}else {
					tf1_vocinput.setBorder(new LineBorder(Color.BLACK, 1));
					b1_Suchen.setEnabled(true);
					b4_reverseSuche.setEnabled(true);
				}
				
			}
		});
		/*
		 * füge dem geerbten JPanel das TextField hinzu
		 */
		add(tf1_vocinput);
		
		
		
		
		/*
		 * Initialisierung des Buttons b1_Suchen
		 */
		b1_Suchen = new CommonButton("Suchen", 150, 115, 150, 30);
		/*
		 * b1_Suchen wird disabled gesetzt bis eine gültige Eingabe erfolgt
		 */
		b1_Suchen.setEnabled(false);
		/*
		 * b1_Suchen erhält einen ActionListener
		 */
		b1_Suchen.addActionListener(new ActionListener() {

			@Override
			/*
			 * Wenn Button geklickt wird:
			 */
			public void actionPerformed(ActionEvent e) {
				/*
				 * Cursor wird zum Warten-Cursor gesetzt
				 */
				getRootPane().setCursor(new Cursor(Cursor.WAIT_CURSOR));
				/*
				 * Formauswahl wird aufgerufen und die Eingabe des Textfields übergeben
				 */
				new Formauswahl(tf1_vocinput.getText());
				
			}
			
		});
		/*
		 * b1_Suchen wird dem geerbten JPane hinzugefügt
		 */
		add(b1_Suchen);
		
		
		
		
		/*
		 * b2_Beenden wird initialisiert
		 */
		b2_Beenden = new CommonButton("Beenden", 245, 150, 110, 30, Color.RED, Color.BLACK);
		/*
		 * b2_Beenden erhält einen ActionListener
		 */
		b2_Beenden.addActionListener(new ActionListener() {

			@Override
			/*
			 * Wenn Button gedrückt wird:
			 */
			public void actionPerformed(ActionEvent e) {
				/*
				 * Programm wird verlassen
				 */
				System.exit(0);				
			}
			
		});
		/*
		 * b2_Beenden wird dem geerbten JPanel hinzugefügt
		 */
		add(b2_Beenden);
		
		
		
		
		/*
		 * lb2_Hint wird initialisiert
		 */
		lb2_hint = new JLabel("", JLabel.CENTER);
		/*
		 * ^Grenzen des Labels werden gesetzt:
		 * x:200 - y:270 - l:200 - h:10
		 */
		lb2_hint.setBounds(200, 270, 200, 10);
		/*
		 * Schriftart des Labels wird gesetzt:
		 * Art:Calibri - Format:Normal - Größe:12
		 */
		lb2_hint.setFont(new Font("Calibri", Font.PLAIN, 12));
		/*
		 * lb2_hint wird dem geerbten JPanel hinzugefügt
		 */
		add(lb2_hint);
		
		
		
		
		/*
		 * pwf_login wird initalisiert
		 */
		pwf_login = new JPasswordField();
		/*
		 * Schriftfarbe wird auf Scwarz gesetzt
		 */
		pwf_login.setForeground(Color.BLACK);
		/*
		 * Grenzen des PWFields werden gesetzt:
		 * x:200 - y:300 - l:200 - h:25
		 */
		pwf_login.setBounds(200,300,200,25);
		/*
		 * KeyListener wird hinzugefügt
		 */
		pwf_login.addKeyListener(new KeyAdapter() {
			/*
			 * String pw enthält das eingegebene Passwort
			 */
			String pw = String.valueOf(pwf_login.getPassword());
			/*
			 * Wenn Taste gedrückt wird:
			 */
			public void keyPressed(KeyEvent e) {
				/*
				 * Wenn gedrückte Taste ENTER ist, dann überprüfe:
				 */
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						/*
						 * Wenn das eingegebene Passwort "latein" ist, dann rufe MainFrame.panelAdminB() auf
						 */
						if (pw.equals("latein")) {
							Main.mf.panelAdminB();
						/*
						 * Wenn kein Passwort eingegeben wurde:
						 * setze Text von lb2_hint zu "Kein Passwort eingegeben", setze Schriftfarbe zu rot, setzte Sichtbar, repainte ContentPane des Frames
						 */
						}else if (pw.equals("")) {
							lb2_hint.setVisible(false);
							lb2_hint.setText("KEIN PASSWORT EINGEGEBEN");
							lb2_hint.setForeground(Color.RED);
							lb2_hint.setVisible(true);
							MainFrame.c.repaint();
						/*
						 * Wenn das eingegebene Passwort "pwa" ist:
						 * setze Text von lb2_hint zu "latein", setze Schriftfarbe schwarz, setzte Sichtbar, repainte ContentPane des Frames
						 */
						}else if (pw.equals("pwa")) {
							lb2_hint.setVisible(false);
							lb2_hint.setText("latein");
							lb2_hint.setForeground(Color.BLACK);
							lb2_hint.setVisible(true);
							MainFrame.c.revalidate();
						/*
						 * Wenn eingegebenes Passwort "pw" ist:
						 * setze lb2_hint unsichtbar, setzte Text des PasswortFieldsa zu "latein"
						 */
						}else if (pw.equals("pw")) {
							lb2_hint.setVisible(false);
							pwf_login.setText("latein");
						}else if (!pw.equals("latein") || !pw.equals("") || !pw.equals("pwa") || !pw.equals("pw")) {
							lb2_hint.setVisible(false);
							lb2_hint.setText("FALSCHES PASSWORT");
							lb2_hint.setVisible(true);
							MainFrame.c.revalidate();
						}
					}
					
			}
		});
		add(pwf_login);
		
		b3_Admin = new CommonButton("ADMIN ACCESS", 225, 330, 150, 30, Color.BLACK, Color.RED);
		b3_Admin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		
		});
		add(b3_Admin);
		
		b4_reverseSuche = new CommonButton("Rückwärtssuche", 310, 115, 150, 30);
		b4_reverseSuche.setEnabled(false);
		b4_reverseSuche.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (tf1_vocinput.getText().equals("") || !isValid(tf1_vocinput.getText())) {
					
				}else {
					ReverseAusgabe.ausgabeUEA(tf1_vocinput.getText());
					
				}
				
			}
		});
		add(b4_reverseSuche);
		
	}
	
	private static boolean isValid(String s) {
		if (s.matches("[a-zA-Z\\\\s\\p{Blank}\\p{Alpha}]*"))
			return true;
		
		return false;
	}

}
