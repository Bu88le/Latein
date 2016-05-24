package frames;

import wörter.*;
import latein.*;
import zeiten.*;
import übersetzung.uea;

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

public class frameperfekt {
	static JFrame frame1;
	static JPanel panel1;
	static JTextField tfield1;
	static JButton button1, button2, button3, button4, button5, button6, button7;
	
	frameperfekt() {
		
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
		button3.setText("Konjunktiv & Aktiv");
		button3.setBackground(Color.BLACK);
		button3.setForeground(Color.WHITE);
		button3.addActionListener(new AListener());
		button3.setBounds(50, 95, 250, 30);
		button3.setCursor(new Cursor (Cursor.HAND_CURSOR));
		framemain.frame1.add(button3);
		
		button4 = new JButton();
		button4.setText("Konjunktiv & Passiv");
		button4.setBackground(Color.BLACK);
		button4.setForeground(Color.WHITE);
		button4.addActionListener(new AListener());
		button4.setBounds(50, 130, 250, 30);
		button4.setCursor(new Cursor (Cursor.HAND_CURSOR));
		framemain.frame1.add(button4);
		
		button5 = new JButton();
		button5.setText("neue Vokabel");
		button5.setBackground(Color.lightGray);
		button5.setForeground(Color.BLUE);
		button5.addActionListener(new AListener());
		button5.setBounds(50, 190, 120, 30);
		button5.setCursor(new Cursor (Cursor.HAND_CURSOR));
		framemain.frame1.add(button5);
		
		button6 = new JButton();
		button6.setText("andere Zeit");
		button6.setBackground(Color.lightGray);
		button6.setForeground(Color.BLUE);
		button6.addActionListener(new AListener());
		button6.setBounds(180, 190, 120, 30);
		button6.setCursor(new Cursor (Cursor.HAND_CURSOR));
		framemain.frame1.add(button6);
		
		button7 = new JButton();
		button7.setText("Beenden");
		button7.setBackground(Color.RED);
		button7.setForeground(Color.BLACK);
		button7.setFont(new Font("Harrington Standard", Font.ITALIC, 15));
		button7.addActionListener(new AListener());
		button7.setBounds(115, 225, 120, 30);
		button7.setCursor(new Cursor (Cursor.HAND_CURSOR));
		framemain.frame1.add(button7);
	}
	static class AListener implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			if (ae.getSource() == frameperfekt.button1){
				if (Formauswahl.akon == true) {
					JOptionPane.showMessageDialog(framemain.frame1, akonjugation.perfektaktivindikativ, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);				
				}else if(Formauswahl.ekon == true) {
					JOptionPane.showMessageDialog(framemain.frame1, ekonjugation.perfektaktivindikativ, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if (Formauswahl.ikon == true) {
					
				}else if(Formauswahl.konskon == true) {
					
				}else if (Formauswahl.sons == true) {
					if (akonjugation.akon == true) {
						JOptionPane.showMessageDialog(framemain.frame1, akonjugation.perfektaktivindikativ, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
					}else if(ekonjugation.ekon == true) {
						JOptionPane.showMessageDialog(framemain.frame1, ekonjugation.perfektaktivindikativ, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
					}else if (ikonjugation.ikon == true) {
						
					}else if (konskonjugation.konskon == true) {
						
					}
				}
			}else if (ae.getSource() == frameperfekt.button2) {
				if (Formauswahl.akon == true) {
					JOptionPane.showMessageDialog(framemain.frame1, akonjugation.perfektpassivindikativ, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if(Formauswahl.ekon == true) {
					JOptionPane.showMessageDialog(framemain.frame1, ekonjugation.perfektpassivindikativ, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if (Formauswahl.ikon == true) {
					
				}else if (Formauswahl.konskon == true) {
					
				}else if (Formauswahl.sons == true) {
					if (akonjugation.akon == true) {
						JOptionPane.showMessageDialog(framemain.frame1, akonjugation.perfektpassivindikativ, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
					}else if (ekonjugation.ekon == true) {
						JOptionPane.showMessageDialog(framemain.frame1, ekonjugation.perfektpassivindikativ, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
					}else if (ikonjugation.ikon == true) {
						
					}else if (konskonjugation.konskon == true) {
						
					}
				}

			}else if (ae.getSource() == frameperfekt.button3) {
				if (Formauswahl.akon == true) {
					JOptionPane.showMessageDialog(framemain.frame1, akonjugation.perfektaktivkonjunktiv, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);

				}else if (Formauswahl.ekon == true) {
					JOptionPane.showMessageDialog(framemain.frame1, ekonjugation.perfektaktivkonjunktiv, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if (Formauswahl.ikon == true) {
					
				}else if (Formauswahl.konskon == true) {
					
				}else if (Formauswahl.sons == true) {
					if (akonjugation.akon == true) {
						JOptionPane.showMessageDialog(framemain.frame1, akonjugation.perfektaktivkonjunktiv, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
					}else if (ekonjugation.ekon == true) {
						JOptionPane.showMessageDialog(framemain.frame1, ekonjugation.perfektaktivkonjunktiv, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
					}else if (ikonjugation.ikon == true) {
						
					}else if (konskonjugation.konskon == true) {
						
					}
				}
			}else if (ae.getSource() == frameperfekt.button4) {
				if (Formauswahl.akon == true) {
					JOptionPane.showMessageDialog(framemain.frame1, akonjugation.perfektpassivkonjunktiv, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if (Formauswahl.ekon == true) {
					JOptionPane.showMessageDialog(framemain.frame1, ekonjugation.perfektpassivkonjunktiv, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if (Formauswahl.ikon == true) {
					
				}else if (Formauswahl.konskon == true) {
					
				}else if (Formauswahl.sons == true) {
					if (akonjugation.akon == true) {
						JOptionPane.showMessageDialog(framemain.frame1, akonjugation.perfektpassivkonjunktiv, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
					}else if (ekonjugation.ekon == true) {
						JOptionPane.showMessageDialog(framemain.frame1, ekonjugation.perfektpassivkonjunktiv, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
					}else if (ikonjugation.ikon == true) {
						
					}else if (konskonjugation.konskon == true) {
						
					}
				}
			}else if (ae.getSource() == frameperfekt.button5) {
				uea.stringbuffer.delete(0, uea.stringbuffer.length());
				akonjugation.akon = false;
				
				button1.setVisible(false);
				button2.setVisible(false);
				button3.setVisible(false);
				button4.setVisible(false);
				button5.setVisible(false);
				button6.setVisible(false);
				button7.setVisible(false);
				
				framemain.framem();
				
			}else if (ae.getSource() == frameperfekt.button6) {
				button1.setVisible(false);
				button2.setVisible(false);
				button3.setVisible(false);
				button4.setVisible(false);
				button5.setVisible(false);
				button6.setVisible(false);
				button7.setVisible(false);
				
				frame.auswahl();
			}else if(ae.getSource() == frameperfekt.button7) {
				System.exit(0);
			}
			
		}
	}
	
}