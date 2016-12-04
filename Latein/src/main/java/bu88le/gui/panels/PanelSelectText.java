package bu88le.gui.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import bu88le.gui.MainFrame;

public class PanelSelectText extends CommonPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3700071635847141797L;
	
	JButton bt1_caesartext, bt2_cicerotext, bt3_senecatext;
	JPanel jp1_buttons;
	JScrollPane jsp1_buttons;
	GridBagConstraints c = new GridBagConstraints();

	
	
	public PanelSelectText(JPanel caller) {
		super(caller);
		initGUI();
	}
	
	private void initGUI() {
		jp1_buttons = new JPanel();
		jp1_buttons.setLayout(new GridBagLayout());
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(5, 0, 5, 0);
		c.fill = GridBagConstraints.VERTICAL;
				
		bt1_caesartext = new JButton("C�sar");
		bt1_caesartext.setBackground(Color.LIGHT_GRAY);
		bt1_caesartext.setForeground(Color.BLUE);
		bt1_caesartext.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt1_caesartext.setPreferredSize(new Dimension(120,25));
		bt1_caesartext.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		jp1_buttons.add(bt1_caesartext,c);

		bt2_cicerotext = new JButton("Cicero");
		bt2_cicerotext.setBackground(Color.LIGHT_GRAY);
		bt2_cicerotext.setForeground(Color.BLUE);
		bt2_cicerotext.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt2_cicerotext.setPreferredSize(new Dimension(120,25));
		bt2_cicerotext.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		c.gridy = 1;
		jp1_buttons.add(bt2_cicerotext,c);
		
		bt3_senecatext = new JButton("Seneca");
		bt3_senecatext.setBackground(Color.LIGHT_GRAY);
		bt3_senecatext.setForeground(Color.BLUE);
		bt3_senecatext.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt3_senecatext.setPreferredSize(new Dimension(120,25));
		bt3_senecatext.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.panelTextsSeneca();				
			}
		});
		c.gridy = 2;
		jp1_buttons.add(bt3_senecatext, c);
		
		jsp1_buttons = new JScrollPane(jp1_buttons);
		
		add(jsp1_buttons, BorderLayout.CENTER);
	}
}
