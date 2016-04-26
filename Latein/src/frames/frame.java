package frames;

import javax.swing.*;

import wörter.akonjugation;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame implements ActionListener {
	
	static JFrame frame1;
	JButton button1, button2, button3, button4, button5, button6, button7, button8;
	static JPanel panel1;
	JTextField tfield1;
	
	public frame() {
		frame1 = new JFrame();
		frame1.setSize(250, 200);
		frame1.setLocationRelativeTo(null);
		frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		panel1 = new JPanel();
		
		
		button1 = new JButton();
		button1.setText("Präsens");
		button1.setBackground(Color.BLACK);
		button1.setForeground(Color.WHITE);
		button1.addActionListener(this);
		panel1.add(button1);
		
		button2 = new JButton();
		button2.setText("Imperfekt");
		button2.setBackground(Color.BLACK);
		button2.setForeground(Color.WHITE);
		button2.addActionListener(this);
		panel1.add(button2);
		
		button3 = new JButton();
		button3.setText("Perfekt");
		button3.setBackground(Color.BLACK);
		button3.setForeground(Color.WHITE);
		button3.addActionListener(this);
		panel1.add(button3);
		
		button4 = new JButton();
		button4.setText("Plusquamperfekt");
		button4.setBackground(Color.BLACK);
		button4.setForeground(Color.WHITE);
		button4.addActionListener(this);
		panel1.add(button4);
		
		button5 = new JButton();
		button5.setText("Futur I");
		button5.setBackground(Color.BLACK);
		button5.setForeground(Color.WHITE);
		button5.addActionListener(this);
		panel1.add(button5);
		
		button6 = new JButton();
		button6.setText("Futur II");
		button6.setBackground(Color.BLACK);
		button6.setForeground(Color.WHITE);
		button6.addActionListener(this);
		panel1.add(button6);
		
		frame1.getContentPane().add(panel1);
		
		button7 = new JButton();
		button7.setText("neue Vokabel");
		button7.setBackground(Color.RED);
		button7.setForeground(Color.BLACK);
		button7.addActionListener(this);
		panel1.add(button7);
		
		button8 = new JButton();
		button8.setFont(new Font("Vivaldi", Font.BOLD, 12));
		button8.setText("Beenden");
		button8.setBackground(Color.RED);
		button8.setForeground(Color.BLACK);
		button8.addActionListener(this);
		panel1.add(button8);
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
			new framemain();
		}else if (ae.getSource() == this.button8) {
			System.exit(0);
		}
	}	
}