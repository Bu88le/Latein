package frames;

import javax.swing.*;

import latein.Formauswahl;
import wörter.*;
import übersetzung.uea;
import übersetzung.uee;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame implements ActionListener {
	
	public static final String pfield1 = null;
	static JFrame frame1;
	JButton button1, button2, button3, button4, button5, button6, button7, button8, button9;
	static JPanel panel1;
	JTextField tfield1;
	
	public frame() {
		frame1 = new JFrame();
		frame1.setSize(350, 300);
		frame1.setLocationRelativeTo(null);
		frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame1.setResizable(false);
		frame1.setLayout(null);		
		
		button1 = new JButton();
		button1.setText("Präsens");
		button1.setBackground(Color.BLACK);
		button1.setForeground(Color.WHITE);
		button1.addActionListener(this);
		button1.setBounds(50, 25, 120, 30);
		button1.setCursor(new Cursor (Cursor.HAND_CURSOR));
		frame1.add(button1);
		
		button2 = new JButton();
		button2.setText("Imperfekt");
		button2.setBackground(Color.BLACK);
		button2.setForeground(Color.WHITE);
		button2.addActionListener(this);
		button2.setBounds(180, 25, 120, 30);
		button2.setCursor(new Cursor (Cursor.HAND_CURSOR));
		frame1.add(button2);
		
		button3 = new JButton();
		button3.setText("Perfekt");
		button3.setBackground(Color.BLACK);
		button3.setForeground(Color.WHITE);
		button3.addActionListener(this);
		button3.setBounds(50, 95, 250, 30);
		button3.setCursor(new Cursor (Cursor.HAND_CURSOR));
		frame1.add(button3);
		
		button4 = new JButton();
		button4.setText("Plusquamperfekt");
		button4.setBackground(Color.BLACK);
		button4.setForeground(Color.WHITE);
		button4.addActionListener(this);
		button4.setBounds(50, 130, 250, 30);
		button4.setCursor(new Cursor (Cursor.HAND_CURSOR));
		frame1.add(button4);
		
		button5 = new JButton();
		button5.setText("Futur I");
		button5.setBackground(Color.BLACK);
		button5.setForeground(Color.WHITE);
		button5.addActionListener(this);
		button5.setBounds(50, 60, 120 ,30);
		button5.setCursor(new Cursor (Cursor.HAND_CURSOR));
		frame1.add(button5);
		
		button6 = new JButton();
		button6.setText("Futur II");
		button6.setBackground(Color.BLACK);
		button6.setForeground(Color.WHITE);
		button6.addActionListener(this);
		button6.setBounds(180, 60, 120, 30);
		button6.setCursor(new Cursor (Cursor.HAND_CURSOR));
		frame1.add(button6);
		
		button7 = new JButton();
		button7.setText("neue Vokabel");
		button7.setBackground(Color.lightGray);
		button7.setForeground(Color.BLUE);
		button7.addActionListener(this);
		button7.setBounds(50, 190, 120, 30);
		button7.setCursor(new Cursor (Cursor.HAND_CURSOR));
		frame1.add(button7);
		
		button8 = new JButton();
		button8.setFont(new Font("Harrington Standard", Font.ITALIC, 15));
		button8.setText("Beenden");
		button8.setBackground(Color.RED);
		button8.setForeground(Color.BLACK);
		button8.addActionListener(this);
		button8.setBounds(115, 225, 120, 30);
		button8.setCursor(new Cursor (Cursor.HAND_CURSOR));
		frame1.add(button8);
		
		button9 = new JButton("Übersetzung");
		button9.setBackground(Color.lightGray);
		button9.setForeground(Color.BLUE);
		button9.setBounds(180, 190, 120, 30);
		button9.addActionListener(this);
		button9.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame1.add(button9);
		
		frame1.setTitle(akonjugation.gv);
		frame1.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == button1) {
			new framew();
			frame1.dispose();

		}else if (ae.getSource() == this.button2) {
			new frameimperfekt();
			frame1.dispose();

		}else if(ae.getSource() == this.button3) {
			new frameperfekt();
			frame1.dispose();
		}else if (ae.getSource() == this.button4) {
			new frameplusq();
			frame1.dispose();
		}else if (ae.getSource() == this.button5) {
			new framefuturI();
			frame1.dispose();
		}else if(ae.getSource() == this.button6) {
			new framefuturII();
			frame1.dispose();
		}else if (ae.getSource() == this.button7) {
			frame1.dispose();
			uea.stringbuffer.delete(0, uea.stringbuffer.length());
			new framemain();
		}else if (ae.getSource() == this.button8) {
			System.exit(0);
		}else if (ae.getSource() == this.button9) {
			if (akonjugation.akon == true) {
				JOptionPane.showMessageDialog(null, uea.returns(), framemain.tfield1.getText(), JOptionPane.INFORMATION_MESSAGE);
			}else if (Formauswahl.ekon == true) {
				JOptionPane.showMessageDialog(null, uee.returns(), framemain.tfield1.getText(), JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}	
}