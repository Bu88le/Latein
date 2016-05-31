package frames.panels;

import java.awt.Color;
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

public class PanelAdmin extends JPanel {
	
	private static JLabel lb1_desc, lb2_hint;
	private static JTextField tf1_vocinput;
	private static CommonButton b1_Suchen, b2_Beenden, b3_Admin;
	public static JPasswordField pwf_login;
	
	public PanelAdmin() {
		setLayout(null);
		
		lb1_desc = new JLabel("Gesuchte Vokabel", JLabel.CENTER);
		lb1_desc.setBounds(200, 50, 200, 10);
		add(lb1_desc);
		
		
		
		tf1_vocinput = new JTextField("");
		tf1_vocinput.setToolTipText("<html><center><font color=#585858 size=3>" + 
				"Gib deine gesuchte Vokabel hier ein" + "</font></center></html>");
		tf1_vocinput.setBounds(200, 75, 200, 25);
		tf1_vocinput.setBorder(new LineBorder(Color.BLACK, 1));
		tf1_vocinput.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					if (tf1_vocinput.getText().equals("") || !isValid(tf1_vocinput.getText())) {
						
					}else {
						//TODO 
					}
				}
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (tf1_vocinput.getText().equals("") || !isValid(tf1_vocinput.getText())) {
					tf1_vocinput.setBorder(new LineBorder(Color.RED, 2));
					b1_Suchen.setEnabled(false);
				}else {
					tf1_vocinput.setBorder(new LineBorder(Color.BLACK, 1));
					b1_Suchen.setEnabled(true);
				}
				
			}
		});
		add(tf1_vocinput);
		
		
		b1_Suchen = new CommonButton("Suchen", 200, 115, 90, 30);
		b1_Suchen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		add(b1_Suchen);
		
		
		
		b2_Beenden = new CommonButton("Beenden", 310, 115, 90, 30, Color.RED, Color.BLACK);
		b2_Beenden.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
			
		});
		add(b2_Beenden);
		
		lb2_hint = new JLabel("", JLabel.CENTER);
		lb2_hint.setBounds(200, 270, 200, 10);
		lb2_hint.setFont(new Font("Calibri", Font.PLAIN, 12));
		add(lb2_hint);
		
		pwf_login = new JPasswordField();
		pwf_login.setForeground(Color.BLACK);
		pwf_login.setBounds(200,300,200,25);	
		pwf_login.addKeyListener(new KeyAdapter() {
			String pw = String.valueOf(pwf_login.getPassword());
			public void keyPressed(KeyEvent e) {
					String pw = String.valueOf(pwf_login.getPassword());
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						if (pw.equals("latein")) {

						}else if (pw.equals("")) {
							lb2_hint.setVisible(false);
							lb2_hint.setText("KEIN PASSWORT EINGEGEBEN");
							lb2_hint.setForeground(Color.RED);
							lb2_hint.setVisible(true);
							MainFrame.c.repaint();
						}else if (pw.equals("pwa")) {
							lb2_hint.setVisible(false);
							lb2_hint.setText("latein");
							lb2_hint.setForeground(Color.BLACK);
							lb2_hint.setVisible(true);
							MainFrame.c.revalidate();
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
		
	}
	
	private static boolean isValid(String s) {
		if (s.matches("[a-zA-Z\\\\s\\p{Blank}\\p{Alpha}]*"))
			return true;
		
		return false;
	}

}
