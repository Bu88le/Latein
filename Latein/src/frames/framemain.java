package frames;

import javax.swing.*;

import latein.Formauswahl;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class framemain implements ActionListener {

	JPanel panel1;
	JButton button1, button2;
	JLabel label1, label2;
	static public JTextField tfield1;
	static String gv;
	static JFrame frame1;
	
	public framemain() {
		frame1 = new JFrame();
		frame1.setSize(250, 200);
		frame1.setLocationRelativeTo(null);
		frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame1.setResizable(false);
		panel1 = new JPanel();
		
		label1 = new JLabel("Gesuchte Vokabel: ");
		panel1.add(label1);
		
			
		tfield1 = new JTextField("", 15);
		tfield1.setForeground(Color.BLACK);
		panel1.add(tfield1);
		
		
		label2 = new JLabel();
		panel1.add(label2);
		

		button1 = new JButton("Suchen...");	
		button1.setBackground(Color.BLACK);
		button1.setForeground(Color.WHITE);
		button1.addActionListener(this);	
		panel1.add(button1);		
		

		button2 = new JButton("Beenden");
		button2.setBackground(Color.RED);
		button2.setForeground(Color.BLACK);
		button2.addActionListener(this);
		panel1.add(button2);


		frame1.add(panel1);
		frame1.setVisible(true);	

		
		
	}

	
	public void actionPerformed(ActionEvent ae) {
		
		if (ae.getSource() == this.button1) {
			gv = tfield1.getText();
			new Formauswahl (gv);
			frame1.setVisible(false);
			frame1.dispose();
		
		}else if(ae.getSource() == this.button2) {
			System.exit(0);
		}
		
	}
	
}