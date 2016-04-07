package frames;

import wörter.*;
import latein.*;
import zeiten.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import latein.Formauswahl;

public class frameperfekt implements ActionListener {
	static JFrame frame1;
	static JPanel panel1;
	static JTextField tfield1;
	static JButton button1, button2, button3, button4, button5, button6;
	
	frameperfekt() {
		frame1 = new JFrame();
		frame1.setSize(250, 200);
		frame1.setLocationRelativeTo(null);
		frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
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
		if (ae.getSource() == this.button1){
			if (Formauswahl.akon == true) {
				JOptionPane.showMessageDialog(null, akonjugation.perfektaktivindikativ, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				
			}else if(Formauswahl.ekon == true) {
				
			}else if (Formauswahl.ikon == true) {
				
			}else if(Formauswahl.konskon == true) {
				
			}else if (Formauswahl.sons == true) {
				if (akonjugation.akon == true) {
					JOptionPane.showMessageDialog(null, akonjugation.perfektaktivindikativ, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
				}else if(ekonjugation.ekon == true) {
					
				}else if (ikonjugation.ikon == true) {
					
				}else if (konskonjugation.konskon == true) {
					
				}
			}
		}else if (ae.getSource() == this.button2) {
			if (Formauswahl.akon == true) {
				JOptionPane.showMessageDialog(null, akonjugation.perfektpassivindikativ, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);
			}else if(Formauswahl.ekon == true) {
				
			}else if (Formauswahl.ikon == true) {
				
			}else if (Formauswahl.konskon == true) {
				
			}else if (Formauswahl.sons == true) {
				if (akonjugation.akon == true) {
					JOptionPane.showMessageDialog(null, akonjugation.perfektpassivindikativ, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);

				}else if (ekonjugation.ekon == true) {
					
				}else if (ikonjugation.ikon == true) {
					
				}else if (konskonjugation.konskon == true) {
					
				}
			}

		}else if (ae.getSource() == this.button3) {
			if (Formauswahl.akon == true) {
				JOptionPane.showMessageDialog(null, akonjugation.perfektaktivkonjunktiv, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);

			}else if (Formauswahl.ekon == true) {
				
			}else if (Formauswahl.ikon == true) {
				
			}else if (Formauswahl.konskon == true) {
				
			}else if (Formauswahl.sons == true) {
				if (akonjugation.akon == true) {
					JOptionPane.showMessageDialog(null, akonjugation.perfektaktivkonjunktiv, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);

				}else if (ekonjugation.ekon == true) {
					
				}else if (ikonjugation.ikon == true) {
					
				}else if (konskonjugation.konskon == true) {
					
				}
			}
		}else if (ae.getSource() == this.button4) {
			if (Formauswahl.akon == true) {
				JOptionPane.showMessageDialog(null, akonjugation.perfektpassivkonjunktiv, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);

			}else if (Formauswahl.ekon == true) {
				
			}else if (Formauswahl.ikon == true) {
				
			}else if (Formauswahl.konskon == true) {
				
			}else if (Formauswahl.sons == true) {
				if (akonjugation.akon == true) {
					JOptionPane.showMessageDialog(null, akonjugation.perfektpassivkonjunktiv, akonjugation.gv, JOptionPane.INFORMATION_MESSAGE);

				}else if (ekonjugation.ekon == true) {
					
				}else if (ikonjugation.ikon == true) {
					
				}else if (konskonjugation.konskon == true) {
					
				}
			}
		}else if (ae.getSource() == this.button5) {
			new framemain();
			frame1.dispose();
			akonjugation.akon = false;
		}else if (ae.getSource() == this.button6) {
			new frame();
			frame1.dispose();
		}
		
	}
}