package bu88le.gui.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import bu88le.gui.MainFrame;

public class CommonPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2926075213356642187L;

	JPanel buttonPanel;
	JButton back, mainMenu;


	public CommonPanel(JPanel caller) {

		setLayout(new BorderLayout(10, 10));

		back = new JButton("Zurück");
		back.setBackground(new Color(9, 119, 165));
		back.setForeground(Color.WHITE);
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		back.setPreferredSize(new Dimension(120, 30));
		back.setBorderPainted(false);
		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.back(caller);

			}
		});

		mainMenu = new JButton("Hauptmenü");
		mainMenu.setBackground(new Color(9, 119, 165));
		mainMenu.setForeground(Color.WHITE);
		mainMenu.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mainMenu.setPreferredSize(new Dimension(120, 30));
		mainMenu.setBorderPainted(false);
		mainMenu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.panelMain();

			}
		});

		buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(getWidth(), 50));
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.LINE_AXIS));
		buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 75, 0, 75));

		buttonPanel.add(mainMenu);
		buttonPanel.add(Box.createHorizontalGlue());
		buttonPanel.add(back);

		add(buttonPanel, BorderLayout.PAGE_END);

	}

}
