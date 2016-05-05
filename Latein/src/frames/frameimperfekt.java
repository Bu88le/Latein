package frames;

import wörter.*;
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

public class frameimperfekt implements ActionListener {
	
	static JFrame frame1;
	static JPanel panel1;
	static JTextField tfield1;
	static JButton button1, button2, button3, button4, button5, button6, button7;
	
	frameimperfekt() {
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
		button2.addActionListener(this);;
		button2.setBounds(50, 60, 250, 30);
		button2.setCursor(new Cursor (Cursor.HAND_CURSOR));
		frame1.add(button2);
		
		button3 = new JButton();
		button3.setText("Konjunktiv & Aktiv");
		button3.setBackground(Color.BLACK);
		button3.setForeground(Color.WHITE);
		button3.addActionListener(this);
		button3.setBounds(50, 95, 250, 30);
		button3.setCursor(new Cursor (Cursor.HAND_CURSOR));
		frame1.add(button3);
		
		button4 = new JButton();
		button4.setText("Konjunktiv & Passiv");
		button4.setBackground(Color.BLACK);
		button4.setForeground(Color.WHITE);
		button4.addActionListener(this);
		button4.setBounds(50, 130, 250, 30);
		button4.setCursor(new Cursor (Cursor.HAND_CURSOR));
		frame1.add(button4);

		button5 = new JButton();
		button5.setText("neue Vokabel");
		button5.setBackground(Color.lightGray);
		button5.setForeground(Color.BLUE);
		button5.addActionListener(this);
		button5.setBounds(50, 190, 120, 30);
		button5.setCursor(new Cursor (Cursor.HAND_CURSOR));
		frame1.add(button5);
		
		button6 = new JButton();
		button6.setText("andere Zeit");
		button6.setBackground(Color.lightGray);
		button6.setForeground(Color.BLUE);
		button6.addActionListener(this);
		button6.setBounds(180, 190, 120, 30);
		button6.setCursor(new Cursor (Cursor.HAND_CURSOR));
		frame1.add(button6);
		
		button7 = new JButton();
		button7.setText("Beenden");
		button7.setBackground(Color.RED);
		button7.setForeground(Color.BLACK);
		button7.setFont(new Font("Harrington Standard", Font.ITALIC, 15));
		button7.addActionListener(this);
		button7.setBounds(115, 225, 120, 30);
		button7.setCursor(new Cursor (Cursor.HAND_CURSOR));
		frame1.add(button7);
		
		frame1.setTitle(akonjugation.gv);
		frame1.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == this.button1) {
			if (Formauswahl.akon == true) {
				JOptionPane.showMessageDialog(null, akonjugation.imperfektaktivindikativ, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				
			}else if (Formauswahl.ekon == true) {				
				JOptionPane.showMessageDialog(null, ekonjugation.imperfektaktivindikativ, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
			}else if(Formauswahl.ikon == true) {
				
				
			}else if(Formauswahl.konskon == true) {
				
				
			}else if (Formauswahl.sons == true) {
				
				if (akonjugation.akon == true) {
					JOptionPane.showMessageDialog(null, akonjugation.imperfektaktivindikativ, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);					
				}else if(ekonjugation.ekon == true) {
					JOptionPane.showMessageDialog(null, ekonjugation.imperfektaktivindikativ, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if(ikonjugation.ikon == true) {
					
				}else if(konskonjugation.konskon == true) {
					
				}
				
			}
		}else if (ae.getSource() == this.button2) {
			
			if (Formauswahl.akon == true) {
				JOptionPane.showMessageDialog(null, akonjugation.imperfektpassivindikativ, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);				
			}else if (Formauswahl.ekon == true) {
				JOptionPane.showMessageDialog(null, ekonjugation.imperfektpassivindikativ, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);				
			}else if(Formauswahl.ikon == true) {
				
				
			}else if (Formauswahl.konskon == true) {
				
				
			}else if (Formauswahl.sons == true) {
				if (akonjugation.akon == true) {
					JOptionPane.showMessageDialog(null, akonjugation.imperfektpassivindikativ, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if(ekonjugation.ekon == true) {
					JOptionPane.showMessageDialog(null, ekonjugation.imperfektpassivindikativ, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if(ikonjugation.ikon == true) {
					
				}else if (konskonjugation.konskon == true) {
					
				}
			}
		}else if (ae.getSource() == this.button3) {
			if (Formauswahl.akon == true) {
				JOptionPane.showMessageDialog(null, akonjugation.imperfektaktivkonjunktiv, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);				
			}else if(Formauswahl.ekon == true) {
				JOptionPane.showMessageDialog(null, ekonjugation.imperfektaktivkonjunktiv, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);				
			}else if(Formauswahl.ikon == true) {
				
				
			}else if(Formauswahl.konskon == true) {
				
				
			}else if (Formauswahl.sons == true) {
				if (akonjugation.akon == true) {
					JOptionPane.showMessageDialog(null, akonjugation.imperfektaktivkonjunktiv, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if (ekonjugation.ekon == true) {
					JOptionPane.showMessageDialog(null, ekonjugation.imperfektaktivkonjunktiv, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if (ikonjugation.ikon == true) {
					
				}else if (konskonjugation.konskon == true) {
					
				}
			}
		}else if (ae.getSource() == this.button4) {
			if (Formauswahl.akon == true) {
				JOptionPane.showMessageDialog(null, akonjugation.imperfektpassivkonjunktiv, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);				
			}else if(Formauswahl.ekon == true) {
				JOptionPane.showMessageDialog(null, ekonjugation.imperfektpassivkonjunktiv, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);				
			}else if(Formauswahl.ikon == true) {
				
				
			}else if(Formauswahl.konskon == true) {
				
				
			}else if (Formauswahl.sons == true) {
				if (akonjugation.akon == true) {
					JOptionPane.showMessageDialog(null, akonjugation.imperfektpassivkonjunktiv, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);	
				}else if (ekonjugation.ekon == true) {
					JOptionPane.showMessageDialog(null, ekonjugation.imperfektpassivkonjunktiv, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if (ikonjugation.ikon == true) {
					
				}else if (konskonjugation.konskon == true) {
					
				}
			}
		}else if (ae.getSource() == this.button5) {
			new framemain();
			uea.stringbuffer.delete(0, uea.stringbuffer.length());
			frame1.dispose();
			akonjugation.akon = false;
			
		}else if (ae.getSource() == this.button6) {
			new frame();
			frame1.dispose();
		}else if(ae.getSource() == this.button7) {
			System.exit(0);
		}
	}
}