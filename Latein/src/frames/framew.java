package frames;

import w�rter.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.*;

import latein.Formauswahl;

import java.awt.event.ActionListener;

import w�rter.akonjugation;

public class framew implements ActionListener  {
	
	static JFrame frame1;
	static JPanel panel1;
	static JTextField tfield1;
	static JButton button1, button2, button3, button4, button5, button6;
	
	framew() {
		frame1 = new JFrame();
		frame1.setSize(250, 200);
		frame1.setLocationRelativeTo(null);
		frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame1.setResizable(false);
		
		panel1 = new JPanel();
		
		button1 = new JButton();
		button1.setText("Indikativ & Aktiv");
		button1.setBackground(Color.BLACK);
		button1.setForeground(Color.WHITE);
		button1.addActionListener(this);
		panel1.add(button1);
		
		button2 = new JButton();
		button2.setText("Indikativ & Passiv");
		button2.setBackground(Color.BLACK);
		button2.setForeground(Color.WHITE);
		button2.addActionListener(this);;
		panel1.add(button2);
		
		button3 = new JButton();
		button3.setText("Konjunktiv & Aktiv");
		button3.setBackground(Color.BLACK);
		button3.setForeground(Color.WHITE);
		button3.addActionListener(this);
		panel1.add(button3);
		
		button4 = new JButton();
		button4.setText("Konjunktiv & Passiv");
		button4.setBackground(Color.BLACK);
		button4.setForeground(Color.WHITE);
		button4.addActionListener(this);
		panel1.add(button4);
		
		tfield1 = new JTextField();
		tfield1.setEditable(false);
		tfield1.setVisible(false);
		panel1.add(tfield1);
		
		button5 = new JButton();
		button5.setText("neue Vokabel");
		button5.setBackground(Color.RED);
		button5.setForeground(Color.BLACK);
		button5.addActionListener(this);
		panel1.add(button5);
		
		button6 = new JButton();
		button6.setText("andere Zeit");
		button6.setBackground(Color.RED);
		button6.setForeground(Color.BLACK);
		button6.addActionListener(this);
		panel1.add(button6);
		
		frame1.add(panel1);
		frame1.setTitle(akonjugation.gv);
		frame1.setVisible(true);
		
	}	
	
	public void actionPerformed(ActionEvent ae) {
		
		if (ae.getSource() == this.button1) {
			if (Formauswahl.akon == true) {
				JOptionPane.showMessageDialog(null, akonjugation.pr�sensaktivindikativ, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);				
			}else if (Formauswahl.ekon == true) {				
				JOptionPane.showMessageDialog(null, ekonjugation.pr�sensaktivindikativ, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
			}else if(Formauswahl.ikon ==true) {
				
				
			}else if (Formauswahl.konskon == true) {
				
			}else if (Formauswahl.sons == true) {
				if (akonjugation.akon == true) {
					JOptionPane.showMessageDialog(null, akonjugation.pr�sensaktivindikativ, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);	
				}else if(ekonjugation.ekon == true) {
					JOptionPane.showMessageDialog(null, ekonjugation.pr�sensaktivindikativ, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if(ikonjugation.ikon == true) {
					
				}else if(konskonjugation.konskon == true) {
					
				}
			}
		}else if (ae.getSource() == this.button2) {
			if (Formauswahl.akon == true) {
				JOptionPane.showMessageDialog(null, akonjugation.pr�senspassivindikativ, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);				
			}else if (Formauswahl.ekon == true) {			
				JOptionPane.showMessageDialog(null, ekonjugation.pr�senspassivindikativ, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
			}else if (Formauswahl.ikon == true) {
				
				
			}else if (Formauswahl.konskon == true) {
				
			}else if (Formauswahl.sons == true) {
				if (akonjugation.akon == true) {
					JOptionPane.showMessageDialog(null, akonjugation.pr�senspassivindikativ, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if(ekonjugation.ekon == true) {
					JOptionPane.showMessageDialog(null, ekonjugation.pr�senspassivindikativ, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if(ikonjugation.ikon == true) {
					
				}else if(konskonjugation.konskon == true) {
					
				}
			}
			
			
		}else if (ae.getSource() == this.button3) {
			if (Formauswahl.akon == true) {
				JOptionPane.showMessageDialog(null, akonjugation.pr�sensaktivkonjunktiv, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);				
			}else if (Formauswahl.ekon == true) {				
				JOptionPane.showMessageDialog(null, ekonjugation.pr�sensaktivkonjunktiv, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
			}else if (Formauswahl.ikon == true) {
				
				
			}else if (Formauswahl.konskon == true) {
				
				
			}else if(Formauswahl.sons == true) {
				if (akonjugation.akon == true) {
					JOptionPane.showMessageDialog(null, akonjugation.pr�sensaktivkonjunktiv, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if (ekonjugation.ekon == true) {
					JOptionPane.showMessageDialog(null, ekonjugation.pr�sensaktivkonjunktiv, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if(ikonjugation.ikon == true) {
					
				}else if(konskonjugation.konskon == true) {
					
				}
				
			}
		}else if (ae.getSource() == this.button4) {
			if (Formauswahl.akon == true) {
				JOptionPane.showMessageDialog(null, akonjugation.pr�senspassivkonjunktiv, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);				
			}else if (Formauswahl.ekon == true) {
				JOptionPane.showMessageDialog(null, ekonjugation.pr�senspassivkonjunktiv, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);				
			}else if (Formauswahl.ikon == true) {
				
				
			}else if (Formauswahl.konskon == true) {
				
			}else if (Formauswahl.sons == true) {
				
				if (akonjugation.akon == true) {
					JOptionPane.showMessageDialog(null, akonjugation.pr�senspassivkonjunktiv, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if(ekonjugation.ekon == true) {
					JOptionPane.showMessageDialog(null, ekonjugation.pr�senspassivkonjunktiv, ekonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if(ikonjugation.ikon == true) {
					
				}else if(konskonjugation.konskon == true) {
					
				}
			}
		}else if(ae.getSource() == this.button5) {
			frame1.dispose();
			new framemain();
			akonjugation.akon = false;
			
		}else if(ae.getSource() == this.button6) {
			frame1.dispose();
			new frame();

		}
		
	}

}