package frames;

import javax.swing.*;

import latein.Formauswahl;
import wörter.*;
import übersetzung.uea;
import übersetzung.uee;
import übersetzung.übergabe;
import frames.framemain;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame {
	
	public static JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10;
	public static JFrame frame1;
	public static JLabel label1;
	public static JScrollPane scrollPane;
	int i;
	
	public frame() {
		ausgabe();
	}
	
	public static void ausgabe() {	
		label1 = new JLabel(übergabe.returngv());
		label1.setFont(new Font("Calibri", Font.PLAIN, 15));
		label1.setVisible(false);
		label1.setForeground(Color.BLACK);
		
		scrollPane = new JScrollPane(label1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
	            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(5,0, 335, 230);
		scrollPane.setVisible(false);
		framemain.frame1.add(scrollPane);
		
		button10 = new JButton("OK");
		button10.setBackground(Color.lightGray);
		button10.setForeground(Color.BLUE);
		button10.addActionListener(new AListener());
		button10.setBounds(75, 240, 200, 30);
		button10.setCursor(new Cursor (Cursor.HAND_CURSOR));
		button10.setVisible(false);
		framemain.frame1.add(button10);
		
		label1.setVisible(true);
		scrollPane.setVisible(true);
		button10.setVisible(true);
		
		framemain.label1.setVisible(false);
		framemain.label2.setVisible(false);
		framemain.label3.setVisible(false);
		framemain.label4.setVisible(false);
		framemain.tfield1.setVisible(false);
		framemain.pfield1.setVisible(false);
		framemain.button1.setVisible(false);
		framemain.button2.setVisible(false);
		framemain.button3.setVisible(false);
		
		
		framemain.frame1.setVisible(true);
		
	}
	
	public static void auswahl() {
		
		button1 = new JButton();
		button1.setText("Präsens");
		button1.setBackground(Color.BLACK);
		button1.setForeground(Color.WHITE);
		button1.addActionListener(new AListener());
		button1.setBounds(50, 25, 120, 30);
		button1.setCursor(new Cursor (Cursor.HAND_CURSOR));
		framemain.frame1.getContentPane().add(button1);
		
		button2 = new JButton();
		button2.setText("Imperfekt");
		button2.setBackground(Color.BLACK);
		button2.setForeground(Color.WHITE);
		button2.addActionListener(new AListener());
		button2.setBounds(180, 25, 120, 30);
		button2.setCursor(new Cursor (Cursor.HAND_CURSOR));
		framemain.frame1.getContentPane().add(button2);
		
		button3 = new JButton();
		button3.setText("Perfekt");
		button3.setBackground(Color.BLACK);
		button3.setForeground(Color.WHITE);
		button3.addActionListener(new AListener());
		button3.setBounds(50, 95, 250, 30);
		button3.setCursor(new Cursor (Cursor.HAND_CURSOR));
		framemain.frame1.getContentPane().add(button3);
		
		button4 = new JButton();
		button4.setText("Plusquamperfekt");
		button4.setBackground(Color.BLACK);
		button4.setForeground(Color.WHITE);
		button4.addActionListener(new AListener());
		button4.setBounds(50, 130, 250, 30);
		button4.setCursor(new Cursor (Cursor.HAND_CURSOR));
		framemain.frame1.getContentPane().add(button4);
		
		button5 = new JButton();
		button5.setText("Futur I");
		button5.setBackground(Color.BLACK);
		button5.setForeground(Color.WHITE);
		button5.addActionListener(new AListener());
		button5.setBounds(50, 60, 120 ,30);
		button5.setCursor(new Cursor (Cursor.HAND_CURSOR));
		framemain.frame1.getContentPane().add(button5);
		
		button6 = new JButton();
		button6.setText("Futur II");
		button6.setBackground(Color.BLACK);
		button6.setForeground(Color.WHITE);
		button6.addActionListener(new AListener());
		button6.setBounds(180, 60, 120, 30);
		button6.setCursor(new Cursor (Cursor.HAND_CURSOR));
		framemain.frame1.getContentPane().add(button6);
		
		button7 = new JButton();
		button7.setText("neue Vokabel");
		button7.setBackground(Color.lightGray);
		button7.setForeground(Color.BLUE);
		button7.addActionListener(new AListener());
		button7.setBounds(50, 190, 120, 30);
		button7.setCursor(new Cursor (Cursor.HAND_CURSOR));
		framemain.frame1.getContentPane().add(button7);
		
		button8 = new JButton();
		button8.setFont(new Font("Harrington Standard", Font.ITALIC, 15));
		button8.setText("Beenden");
		button8.setBackground(Color.RED);
		button8.setForeground(Color.BLACK);
		button8.addActionListener(new AListener());
		button8.setBounds(115, 225, 120, 30);
		button8.setCursor(new Cursor (Cursor.HAND_CURSOR));
		framemain.frame1.add(button8);
		
		button9 = new JButton("Übersetzung");
		button9.setBackground(Color.lightGray);
		button9.setForeground(Color.BLUE);
		button9.setBounds(180, 190, 120, 30);
		button9.addActionListener(new AListener());
		button9.setCursor(new Cursor(Cursor.HAND_CURSOR));
		framemain.frame1.getContentPane().add(button9);
		

	}
	static class AListener implements ActionListener{
		public void actionPerformed(ActionEvent ae) {

			if (ae.getSource() == button1) {
				
				
				button1.setVisible(false);
				button2.setVisible(false);
				button3.setVisible(false);
				button4.setVisible(false);
				button5.setVisible(false);
				button6.setVisible(false);
				button7.setVisible(false);
				button8.setVisible(false);
				button9.setVisible(false);
				
				new framew();
				
			}else if (ae.getSource() == frame.button2) {
				
				
				button1.setVisible(false);
				button2.setVisible(false);
				button3.setVisible(false);
				button4.setVisible(false);
				button5.setVisible(false);
				button6.setVisible(false);
				button7.setVisible(false);
				button8.setVisible(false);
				button9.setVisible(false);
				
				new frameimperfekt();	
				
			}else if(ae.getSource() == frame.button3) {
				
				
				button1.setVisible(false);
				button2.setVisible(false);
				button3.setVisible(false);
				button4.setVisible(false);
				button5.setVisible(false);
				button6.setVisible(false);
				button7.setVisible(false);
				button8.setVisible(false);
				button9.setVisible(false);
				
				new frameperfekt();		
				
			}else if (ae.getSource() == frame.button4) {
					
				
				button1.setVisible(false);
				button2.setVisible(false);
				button3.setVisible(false);
				button4.setVisible(false);
				button5.setVisible(false);
				button6.setVisible(false);
				button7.setVisible(false);
				button8.setVisible(false);
				button9.setVisible(false);
				
				new frameplusq();
				
			}else if (ae.getSource() == frame.button5) {
				
				
				button1.setVisible(false);
				button2.setVisible(false);
				button3.setVisible(false);
				button4.setVisible(false);
				button5.setVisible(false);
				button6.setVisible(false);
				button7.setVisible(false);
				button8.setVisible(false);
				button9.setVisible(false);
				
				new framefuturI();	
				
			}else if(ae.getSource() == frame.button6) {
				
				
				button1.setVisible(false);
				button2.setVisible(false);
				button3.setVisible(false);
				button4.setVisible(false);
				button5.setVisible(false);
				button6.setVisible(false);
				button7.setVisible(false);
				button8.setVisible(false);
				button9.setVisible(false);
				
				new framefuturII();	
				
			}else if (ae.getSource() == frame.button7) {
				button1.setVisible(false);
				button2.setVisible(false);
				button3.setVisible(false);
				button4.setVisible(false);
				button5.setVisible(false);
				button6.setVisible(false);
				button7.setVisible(false);
				button8.setVisible(false);
				button9.setVisible(false);
				uea.stringbuffer.delete(0, uea.stringbuffer.length());
				uee.stringbuffer.delete(0, uee.stringbuffer.length());
				framemain.framem();
			}else if (ae.getSource() == frame.button8) {
				System.exit(0);
			}else if (ae.getSource() == frame.button9) {
				if (akonjugation.akon == true) {
					JOptionPane.showMessageDialog(framemain.frame1, übergabe.returngv(), framemain.tfield1.getText(), JOptionPane.INFORMATION_MESSAGE);
				}else if (ekonjugation.ekon == true) {
					JOptionPane.showMessageDialog(framemain.frame1, übergabe.returngv(), framemain.tfield1.getText(), JOptionPane.INFORMATION_MESSAGE);
				}
			}else if (ae.getSource() == frame.button10) {
				label1.setVisible(false);
				scrollPane.setVisible(false);
				button10.setVisible(false);
				
				auswahl();
			}
	}
	
	}	
}