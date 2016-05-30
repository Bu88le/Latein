package frames;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import latein.Formauswahl;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class framemain{

	static public JButton button1, button2, button3, button4, button5;
	static public JLabel label1, label2, label3, label4, label5;
	static public JTextField tfield1, tfield2;
	static private String gv;
	public static JFrame frame1;
	static public JPasswordField pfield1;
	static private int zaehler;
	static private boolean visible = true;
	static private boolean visible2 = false;
	
	public framemain() {
		initialisierung();
	}
	
	public static void initialisierung() {
		frame1 = new JFrame();
		
		frame1.setSize(350, 300);		
		frame1.setLocationRelativeTo(null);
		frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame1.setResizable(false);
		frame1.setLayout(null);
				
		framem();
	}
	
	public static void framem() {

		
		label1 = new JLabel("Gesuchte Vokabel: ");		
		label1.setBounds(120, 82, 150, 10);
		frame1.add(label1);
		
		label5 = new JLabel("Gesuchte Vokabel: ");
		label5.setBounds(120, 15, 150, 10);
		label5.setVisible(!visible);
		frame1.add(label5);
		
		button1 = new JButton("Suchen...");	
		button1.setBackground(Color.BLACK);
		button1.setForeground(Color.WHITE);
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (tfield1.getText().equals("") || !isValid(tfield1.getText())) {
					
				}else {
					if (tfield1.getText().equals("admin")) {
						visible = false;
						visible2 = true;
						pfield1.requestFocus();
						
					}else {
						button1.setVisible(false);
						button2.setVisible(false);
						tfield1.setVisible(false);
						label1.setVisible(false);
						
						button4.setVisible(false);
						button5.setVisible(false);
						label5.setVisible(false);
						tfield2.setVisible(false);
						button3.setVisible(false);
						pfield1.setVisible(false);
						zaehler = 0;
						gv = tfield1.getText();
						
						new Formauswahl (gv);
						
					}
				}
				
			}
			
		});
		button1.setBounds(75, 137, 90, 30);
		button1.setCursor(new Cursor (Cursor.HAND_CURSOR));
		button1.setEnabled(false);
		button1.setVisible(visible);
		frame1.add(button1);
		
			
		tfield1 = new JTextField("", 15);
		tfield1.setForeground(Color.BLACK);
		tfield1.setBounds(75, 102, 200, 25);
		tfield1.setBorder(new LineBorder(Color.RED, 2));
		tfield1.setVisible(visible);
		tfield1.addKeyListener(new KListener());
		tfield1.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				if (tfield1.getText().equals("") || !isValid(tfield1.getText())) {
					tfield1.setBorder(new LineBorder(Color.RED, 2));
					button1.setEnabled(false);
				}else {
					tfield1.setBorder(new LineBorder(Color.BLACK, 1));
					button1.setEnabled(true);
				}

			}
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode()==KeyEvent.VK_ENTER){
					if (tfield1.getText().equals("") || !isValid(tfield1.getText())) {
						
					}else {
							if (tfield1.getText().equals("admin")) {
								visible = false;
								visible2 = true;
								pfield1.requestFocus();
								
							}else {
								zaehler = 0;
								gv = tfield1.getText();
								new Formauswahl (gv);
								
							}
						}
					
				
				}
			}
		});
		tfield1.setActionCommand("tfield1");
		frame1.add(tfield1);
		
		
		
		
		tfield2 = new JTextField("", 15);
		tfield2.setBounds(75, 35, 200, 25);
		tfield2.setBorder(new LineBorder(Color.RED, 2));
		tfield2.setVisible(visible2);
		tfield2.addKeyListener(new KListener());
		tfield2.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				if (tfield2.getText().equals("") || !isValid(tfield2.getText())) {
					tfield2.setBorder(new LineBorder(Color.RED, 2));
					button4.setEnabled(false);
				}else {
					tfield2.setBorder(new LineBorder(Color.BLACK, 1));
					button4.setEnabled(true);
				}
				
			}
			
		});
		
		tfield2.setActionCommand("tfield1");
		tfield2.setVisible(false);
		frame1.add(tfield2);
		
		button4 = new JButton("Suchen...");
		button4.setBackground(Color.BLACK);
		button4.setForeground(Color.WHITE);
		button4.addActionListener(new AListener());
		button4.setBounds(75, 70, 90, 30);
		button4.setCursor(new Cursor (Cursor.HAND_CURSOR));
		button4.setVisible(visible2);
		button4.setEnabled(false);
		frame1.add(button4);
		

		button2 = new JButton("Beenden");
		button2.setFont(new Font("Harrington Post", Font.ITALIC, 12));
		button2.setBackground(Color.RED);
		button2.setForeground(Color.BLACK);
		button2.addActionListener(new AListener());
		button2.setBounds(185, 137, 90, 30);
		button2.setCursor(new Cursor (Cursor.HAND_CURSOR));
		button2.setVisible(visible);
		frame1.add(button2);
		
		button5 = new JButton("Beenden");
		button5.setFont(new Font("Harrington Post", Font.ITALIC, 12));
		button5.setBackground(Color.RED);
		button5.setForeground(Color.BLACK);
		button5.addActionListener(new AListener());
		button5.setBounds(185, 70, 90, 30);
		button5.setCursor(new Cursor (Cursor.HAND_CURSOR));
		button5.setVisible(visible2);
		frame1.add(button5);
		
		pfield1 = new JPasswordField();
		pfield1.setForeground(Color.BLACK);
		pfield1.setBounds(75,200,200,25);		
		pfield1.setVisible(visible2);	
		pfield1.addKeyListener(new KListener());
		pfield1.setActionCommand("pfield1");
		frame1.add(pfield1);
		
		
		button3 = new JButton("Admin");
		button3.setBackground(Color.BLACK);
		button3.setForeground(Color.RED);
		button3.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 12));
		button3.addActionListener(new AListener());
		button3.setBounds(100, 230, 150, 30);
		button3.setCursor(new Cursor (Cursor.HAND_CURSOR));		
		button3.setVisible(visible2);
		frame1.add(button3);
		
		
		label2 = new JLabel();
		label2.setForeground(Color.RED);
		label2.setFont(new Font("Calibri", Font.ITALIC, 12));
		label2.setVisible(false);
		label2.setBounds(95, 170, 200, 25);
		frame1.add(label2);
	
		
		label3 = new JLabel();
		label3.setText("Passwort: latein");
		label3.setFont(new Font("Calibri", Font.PLAIN, 15));
		label3.setForeground(Color.GRAY);
		label3.setBounds(75, 150, 200, 30);
		label3.setVisible(false);
		frame1.add(label3);
		
		label4 = new JLabel();
		label4.setForeground(Color.RED);
		label4.setFont(new Font("Calibri", Font.ITALIC, 12));
		label4.setVisible(false);
		label4.setBounds(120, 170, 200, 25);
		frame1.add(label4);


		frame1.setVisible(true);	

		
		
	}
	
	static class AListener implements ActionListener{
		public void actionPerformed(ActionEvent ae) {
			
			if (ae.getSource() == framemain.button1) {

			
			}else if(ae.getSource() == framemain.button2) {
				System.exit(0);
			}else if(ae.getSource() == framemain.button3) {
				String pw = String.valueOf(pfield1.getPassword());
				if (pw.equals("latein")) {
					zaehler = 0;
					pfield1.setText("");
					label2.setVisible(false);
					label3.setVisible(false);
					frame1.dispose();
					new frameadmin();
				}else if(pw.equals("")) {
					zaehler = 0;
					label2.setText("KEIN PASSWORT EINGEGEBEN!!");
					label2.setBounds(90, 170, 150, 25);
					label3.setVisible(false);

					label2.setVisible(true);
				}else if (pw.equals("pw")) {
					zaehler = 0;
					pfield1.setText("latein");
				}else if (pw.equals("pwa")) {
					zaehler = 0;
					label2.setVisible(false);
					label3.setVisible(true);
				}else {
					zaehler = 0;
					pfield1.setText("");
					label3.setVisible(false);
					label2.setText("FALSCHES PASSWORT!!");
					label2.setBounds(120, 170,200, 25);
					label2.setVisible(true);
				}
			}else if (ae.getSource() == framemain.button4){
				button1.setVisible(false);
				button2.setVisible(false);
				tfield1.setVisible(false);
				label1.setVisible(false);
				
				button4.setVisible(false);
				button5.setVisible(false);
				label5.setVisible(false);
				tfield2.setVisible(false);
				button3.setVisible(false);
				pfield1.setVisible(false);
				
				zaehler = 0;
				gv = tfield1.getText();
				
				new Formauswahl (gv);
			}else if (ae.getSource() == framemain.button5) {
				System.exit(0);
			}
			
		}
	}

	

	static class KListener implements KeyListener {
		public void keyPressed(KeyEvent e) {
			if (e.getSource() == pfield1) {
				String pw = String.valueOf(pfield1.getPassword());
				if (pw.equals("latein")) {
					zaehler = 0;
					pfield1.setText("");
					label2.setVisible(false);
					label3.setVisible(false);
					frame1.dispose();
					new frameadmin();
				}else if(pw.equals("")) {
					zaehler = 0;
					label2.setText("KEIN PASSWORT EINGEGEBEN!!");
					label3.setVisible(false);
					label4.setVisible(false);

					label2.setVisible(true);
				}else if (pw.equals("pw")) {
					zaehler = 0;
					label2.setVisible(false);
					label3.setVisible(false);;
					label4.setVisible(false);
					pfield1.setText("latein");
				}else if (pw.equals("pwa")) {
					zaehler = 0;
					label2.setVisible(false);
					label4.setVisible(false);
					label3.setVisible(true);
				}else {
					zaehler = 0;
					pfield1.setText("");
					label3.setVisible(false);
					label2.setVisible(false);
					label4.setText("FALSCHES PASSWORT!!");
					label4.setVisible(true);
				}
			}else {
			}			
		}			

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}		
	}
	
	public static boolean isValid(String s) {
		if (s.matches("[a-zA-Z\\s\\p{Blank}\\p{Alpha}]*")){
			return true;
		}
		return false;
	}
}