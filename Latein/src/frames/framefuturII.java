package frames;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import latein.Formauswahl;
import wörter.akonjugation;
import wörter.ekonjugation;
import wörter.ikonjugation;
import wörter.konskonjugation;
import übersetzung.uea;

public class framefuturII implements ActionListener{

	static JFrame frame1;
	static JPanel panel1;
	static JTextField tfield1;
	static JButton button1, button2, button3, button4, button5;
	
	framefuturII() {
		frame1 = new JFrame();
		frame1.setSize(350, 300);
		frame1.setLocationRelativeTo(null);
		frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame1.setResizable(false);
		frame1.setLayout(null);
		
		button1 = new JButton();
		button1.setText("Indikativ & Aktiv");
		button1.setBackground(Color.BLACK);
		button1.setForeground(Color.WHITE);
		button1.addActionListener(this);
		button1.setBounds(50, 25, 250, 30);
		button1.setCursor(new Cursor (Cursor.HAND_CURSOR));
		frame1.add(button1);
		
		button2 = new JButton();
		button2.setText("Indikativ & Passiv");
		button2.setBackground(Color.BLACK);
		button2.setForeground(Color.WHITE);
		button2.addActionListener(this);
		button2.setBounds(50, 60, 250, 30);
		button2.setCursor(new Cursor (Cursor.HAND_CURSOR));
		frame1.add(button2);
		
		button3 = new JButton();
		button3.setText("neue Vokabel");
		button3.setBackground(Color.lightGray);
		button3.setForeground(Color.BLUE);
		button3.addActionListener(this);
		button3.setBounds(50, 150, 120, 30);
		button3.setCursor(new Cursor (Cursor.HAND_CURSOR));
		frame1.add(button3);
		
		button4 = new JButton();
		button4.setText("andere Zeit");
		button4.setBackground(Color.lightGray);
		button4.setForeground(Color.BLUE);
		button4.addActionListener(this);
		button4.setBounds(180, 150, 120, 30);
		button4.setCursor(new Cursor (Cursor.HAND_CURSOR));
		frame1.add(button4);
		
		button5 = new JButton();
		button5.setText("Beenden");
		button5.setFont(new Font("Harrington Standard", Font.ITALIC, 15));
		button5.setBackground(Color.RED);
		button5.setForeground(Color.BLACK);
		button5.addActionListener(this);
		button5.setBounds(115, 190, 120 ,30);
		button5.setCursor(new Cursor (Cursor.HAND_CURSOR));
		frame1.add(button5);
		
		frame1.setTitle(akonjugation.gv);
		frame1.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == this.button1) {
			if (Formauswahl.akon == true) {
				JOptionPane.showMessageDialog(null, akonjugation.futurIIaktiv, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
			}else if (Formauswahl.ekon == true) {
				JOptionPane.showMessageDialog(null, ekonjugation.futurIIaktiv, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
			}else if (Formauswahl.ikon == true) {
				
			}else if (Formauswahl.konskon == true) {
				
			}else if (Formauswahl.sons == true) {
				if (akonjugation.akon == true) {
					JOptionPane.showMessageDialog(null, akonjugation.futurIIaktiv, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if (ekonjugation.ekon == true) {
					JOptionPane.showMessageDialog(null, ekonjugation.futurIIaktiv, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if (ikonjugation.ikon == true) {
					
				}else if (konskonjugation.konskon == true) {
					
				}
			}
		}else if (ae.getSource() == this.button2) {
			if (Formauswahl.akon == true) {
				JOptionPane.showMessageDialog(null, akonjugation.futurIIpassiv, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
			}else if (Formauswahl.ekon == true) {
				JOptionPane.showMessageDialog(null, ekonjugation.futurIIpassiv, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
			}else if (Formauswahl.ikon == true) {
				
			}else if (Formauswahl.konskon == true) {
				
			}else if (Formauswahl.sons == true) {
				if (akonjugation.akon == true) {
					JOptionPane.showMessageDialog(null, akonjugation.futurIIpassiv, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if (ekonjugation.ekon == true) {
					JOptionPane.showMessageDialog(null, ekonjugation.futurIIpassiv, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if (ikonjugation.ikon == true) {
					
				}else if (konskonjugation.konskon == true) {
					
				}
			}
		}else if (ae.getSource() == this.button3) {
			new framemain();
			uea.stringbuffer.delete(0, uea.stringbuffer.length());
			frame1.dispose();
			akonjugation.akon = false;
			
		}else if (ae.getSource() == this.button4) {
			new frame();
			frame1.dispose();
		}else if (ae.getSource() == this.button5) {
			System.exit(0);
		}
	}
}