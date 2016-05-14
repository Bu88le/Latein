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

public class framefuturII {

	static JFrame frame1;
	static JPanel panel1;
	static JTextField tfield1;
	static JButton button1, button2, button3, button4, button5;
	
	framefuturII() {
		
		button1 = new JButton();
		button1.setText("Indikativ & Aktiv");
		button1.setBackground(Color.BLACK);
		button1.setForeground(Color.WHITE);
		button1.addActionListener(new AListener());
		button1.setBounds(50, 25, 250, 30);
		button1.setCursor(new Cursor (Cursor.HAND_CURSOR));
		framemain.frame1.add(button1);
		
		button2 = new JButton();
		button2.setText("Indikativ & Passiv");
		button2.setBackground(Color.BLACK);
		button2.setForeground(Color.WHITE);
		button2.addActionListener(new AListener());
		button2.setBounds(50, 60, 250, 30);
		button2.setCursor(new Cursor (Cursor.HAND_CURSOR));
		framemain.frame1.add(button2);
		
		button3 = new JButton();
		button3.setText("neue Vokabel");
		button3.setBackground(Color.lightGray);
		button3.setForeground(Color.BLUE);
		button3.addActionListener(new AListener());
		button3.setBounds(50, 190, 120, 30);
		button3.setCursor(new Cursor (Cursor.HAND_CURSOR));
		framemain.frame1.add(button3);
		
		button4 = new JButton();
		button4.setText("andere Zeit");
		button4.setBackground(Color.lightGray);
		button4.setForeground(Color.BLUE);
		button4.addActionListener(new AListener());
		button4.setBounds(180, 190, 120, 30);
		button4.setCursor(new Cursor (Cursor.HAND_CURSOR));
		framemain.frame1.add(button4);
		
		button5 = new JButton();
		button5.setText("Beenden");
		button5.setFont(new Font("Harrington Standard", Font.ITALIC, 15));
		button5.setBackground(Color.RED);
		button5.setForeground(Color.BLACK);
		button5.addActionListener(new AListener());
		button5.setBounds(115, 225, 120, 30);
		button5.setCursor(new Cursor (Cursor.HAND_CURSOR));
		framemain.frame1.add(button5);
		
	}
	
	static class AListener implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			if (ae.getSource() == framefuturII.button1) {
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
			}else if (ae.getSource() == framefuturII.button2) {
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
			}else if (ae.getSource() == framefuturII.button3) {
				uea.stringbuffer.delete(0, uea.stringbuffer.length());
				akonjugation.akon = false;
				
				button1.setVisible(false);
				button2.setVisible(false);
				button3.setVisible(false);
				button4.setVisible(false);
				button5.setVisible(false);
								
				framemain.framem();
				
			}else if (ae.getSource() == framefuturII.button4) {
				button1.setVisible(false);
				button2.setVisible(false);
				button3.setVisible(false);
				button4.setVisible(false);
				button5.setVisible(false);
				
				frame.auswahl();
			}else if (ae.getSource() == framefuturII.button5) {
				System.exit(0);
			}
		}
	}
	
	
}