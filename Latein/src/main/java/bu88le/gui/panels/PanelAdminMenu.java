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

import bu88le.gui.MainFrame;

public class PanelAdminMenu extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1269330032474616081L;

	GridBagConstraints c = new GridBagConstraints();
	JPanel panelPageStart, panelLineStart, panelLineEnd, panelPageEnd;
	JButton bt1_PageStart, bt2_LineEnd_bt1, bt3_LineEnd_bt3, bt4_PageEnd, bt5_LineStart_bt1, bt6_LineStart_bt2;


	public PanelAdminMenu() {
		setLayout(new BorderLayout());
		initGUI();
	}


	private void initGUI() {
		panelPageStart = new JPanel();
		panelPageStart.setLayout(new GridBagLayout());

		bt1_PageStart = new JButton("Hauptmenü");
		bt1_PageStart.setBackground(Color.BLACK);
		bt1_PageStart.setForeground(Color.WHITE);
		bt1_PageStart.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt1_PageStart.setPreferredSize(new Dimension(200, 30));
		bt1_PageStart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.panelMain();

			}
		});
		c.insets = new Insets(50, 0, 0, 0);
		c.gridx = 0;
		c.fill = GridBagConstraints.VERTICAL;
		c.gridy = 0;
		panelPageStart.add(bt1_PageStart, c);
		add(panelPageStart, BorderLayout.PAGE_START);

		panelLineEnd = new JPanel();
		panelLineEnd.setLayout(new GridBagLayout());

		bt2_LineEnd_bt1 = new JButton("Alle Vokabeln");
		bt2_LineEnd_bt1.setBackground(Color.BLACK);
		bt2_LineEnd_bt1.setForeground(Color.WHITE);
		bt2_LineEnd_bt1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt2_LineEnd_bt1.setPreferredSize(new Dimension(200, 30));
		bt2_LineEnd_bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.panelZusammenfassungVokabeln();

			}
		});
		c.fill = GridBagConstraints.VERTICAL;
		c.insets = new Insets(0, 0, 0, 5);
		c.gridx = 0;
		c.gridy = 0;
		panelLineEnd.add(bt2_LineEnd_bt1, c);

		bt3_LineEnd_bt3 = new JButton("Texte");
		bt3_LineEnd_bt3.setBackground(Color.BLACK);
		bt3_LineEnd_bt3.setForeground(Color.WHITE);
		bt3_LineEnd_bt3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt3_LineEnd_bt3.setPreferredSize(new Dimension(200, 30));
		bt3_LineEnd_bt3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.panelTextSelect();
			}
		});
		c.insets = new Insets(50, 0, 0, 5);
		c.gridy = 1;
		panelLineEnd.add(bt3_LineEnd_bt3, c);
		add(panelLineEnd, BorderLayout.LINE_END);

		panelPageEnd = new JPanel();
		panelPageEnd.setLayout(new GridBagLayout());

		bt4_PageEnd = new JButton("Button4");
		bt4_PageEnd.setBackground(Color.BLACK);
		bt4_PageEnd.setForeground(Color.WHITE);
		bt4_PageEnd.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt4_PageEnd.setPreferredSize(new Dimension(200, 30));
		bt4_PageEnd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		c.gridy = 0;
		c.insets = new Insets(0, 0, 50, 0);
		panelPageEnd.add(bt4_PageEnd, c);
		add(panelPageEnd, BorderLayout.PAGE_END);

		panelLineStart = new JPanel();
		panelLineStart.setLayout(new GridBagLayout());

		bt5_LineStart_bt1 = new JButton("Button5");
		bt5_LineStart_bt1.setBackground(Color.BLACK);
		bt5_LineStart_bt1.setForeground(Color.WHITE);
		bt5_LineStart_bt1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt5_LineStart_bt1.setPreferredSize(new Dimension(200, 30));
		bt5_LineStart_bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		c.gridy = 0;
		c.insets = new Insets(0, 5, 0, 0);
		panelLineStart.add(bt5_LineStart_bt1, c);

		bt6_LineStart_bt2 = new JButton("Button6");
		bt6_LineStart_bt2.setBackground(Color.BLACK);
		bt6_LineStart_bt2.setForeground(Color.WHITE);
		bt6_LineStart_bt2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt6_LineStart_bt2.setPreferredSize(new Dimension(200, 30));
		bt6_LineStart_bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		c.gridy = 1;
		c.insets = new Insets(50, 5, 0, 0);
		panelLineStart.add(bt6_LineStart_bt2, c);
		add(panelLineStart, BorderLayout.LINE_START);

	}
}
