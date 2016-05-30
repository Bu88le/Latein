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

public class frameplusq {

	static JFrame frame1;
	static JPanel panel1;
	static JTextField tfield1;
	static JButton button1, button2, button3, button4, button5, button6, button7;
	
	frameplusq() {
		
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
			if (ae.getSource() == frameplusq.button1){
				if (akonjugation.akon == true) {
					JOptionPane.showMessageDialog(framemain.frame1, akonjugation.plusquamperfektaktivindikativ, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);				
				}else if(ekonjugation.ekon == true) {
					JOptionPane.showMessageDialog(framemain.frame1, ekonjugation.plusquamperfektaktivindikativ, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if (ikonjugation.ikon == true) {
					
				}else if(konskonjugation.konskon == true) {
					
				}else if (Formauswahl.sons == true) {
					if (akonjugation.akon == true) {
						JOptionPane.showMessageDialog(framemain.frame1, akonjugation.plusquamperfektaktivindikativ, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
					}else if(ekonjugation.ekon == true) {
						JOptionPane.showMessageDialog(framemain.frame1, ekonjugation.plusquamperfektaktivindikativ, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
					}else if (ikonjugation.ikon == true) {
						
					}else if (konskonjugation.konskon == true) {
						
					}
				}
			}else if (ae.getSource() == frameplusq.button2) {
				if (akonjugation.akon == true) {
					JOptionPane.showMessageDialog(framemain.frame1, akonjugation.plusquamperfektpassivindikativ, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if(ekonjugation.ekon == true) {
					JOptionPane.showMessageDialog(framemain.frame1, ekonjugation.plusquamperfektpassivindikativ, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if (ikonjugation.ikon == true) {
					
				}else if (konskonjugation.konskon == true) {
					
				}else if (Formauswahl.sons == true) {
					if (akonjugation.akon == true) {
						JOptionPane.showMessageDialog(framemain.frame1, akonjugation.plusquamperfektpassivindikativ, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
					}else if (ekonjugation.ekon == true) {
						JOptionPane.showMessageDialog(framemain.frame1, ekonjugation.plusquamperfektpassivindikativ, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
					}else if (ikonjugation.ikon == true) {
						
					}else if (konskonjugation.konskon == true) {
						
					}
				}

			}else if (ae.getSource() == frameplusq.button3) {
				if (akonjugation.akon == true) {
					JOptionPane.showMessageDialog(framemain.frame1, akonjugation.plusquamperfektaktivkonjunktiv, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if (ekonjugation.ekon == true) {
					JOptionPane.showMessageDialog(framemain.frame1, ekonjugation.plusquamperfektaktivkonjunktiv, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if (ikonjugation.ikon == true) {
					
				}else if (konskonjugation.konskon == true) {
					
				}else if (Formauswahl.sons == true) {
					if (akonjugation.akon == true) {
						JOptionPane.showMessageDialog(framemain.frame1, akonjugation.plusquamperfektaktivkonjunktiv, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
					}else if (ekonjugation.ekon == true) {
						JOptionPane.showMessageDialog(framemain.frame1, ekonjugation.plusquamperfektaktivkonjunktiv, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
					}else if (ikonjugation.ikon == true) {
						
					}else if (konskonjugation.konskon == true) {
						
					}
				}
			}else if (ae.getSource() == frameplusq.button4) {
				if (akonjugation.akon == true) {
					JOptionPane.showMessageDialog(framemain.frame1, akonjugation.plusquamperfektpassivkonjunktiv, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if (ekonjugation.ekon == true) {
					JOptionPane.showMessageDialog(framemain.frame1, ekonjugation.plusquamperfektpassivkonjunktiv, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if (ikonjugation.ikon == true) {
					
				}else if (konskonjugation.konskon == true) {
					
				}else if (Formauswahl.sons == true) {
					if (akonjugation.akon == true) {
						JOptionPane.showMessageDialog(framemain.frame1, akonjugation.plusquamperfektpassivkonjunktiv, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
					}else if (ekonjugation.ekon == true) {
						JOptionPane.showMessageDialog(framemain.frame1, ekonjugation.plusquamperfektpassivkonjunktiv, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
					}else if (ikonjugation.ikon == true) {
						
					}else if (konskonjugation.konskon == true) {
						
					}
				}
			}else if (ae.getSource() == frameplusq.button5) {
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
			}else if (ae.getSource() == frameplusq.button6) {
				button1.setVisible(false);
				button2.setVisible(false);
				button3.setVisible(false);
				button4.setVisible(false);
				button5.setVisible(false);
				button6.setVisible(false);
				button7.setVisible(false);
				
				frame.auswahl();
			}else if (ae.getSource() == frameplusq.button7) {
				System.exit(0);
			}
			
		}
	}
	
}