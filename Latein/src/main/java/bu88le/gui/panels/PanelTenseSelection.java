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

public class PanelTenseSelection extends CommonPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4053918786355382962L;

	JPanel panelCenter;
	GridBagConstraints c = new GridBagConstraints();
	JButton b1_präsens, b2_imperfekt, b3_futurI, b4_perfekt, b5_plusquamperfekt, b6_futurII;


	public PanelTenseSelection(JPanel caller) {
		super(caller);

		initGUI();
	}


	private void initGUI() {
		panelCenter = new JPanel();
		panelCenter.setLayout(new GridBagLayout());

		b1_präsens = new JButton("Präsens");
		b1_präsens.setBackground(Color.BLACK);
		b1_präsens.setForeground(Color.WHITE);
		b1_präsens.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b1_präsens.setPreferredSize(new Dimension(250, 30));
		b1_präsens.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		c.fill = GridBagConstraints.VERTICAL;
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(0, 0, 5, 0);
		panelCenter.add(b1_präsens, c);

		b2_imperfekt = new JButton("Imperfekt");
		b2_imperfekt.setBackground(Color.BLACK);
		b2_imperfekt.setForeground(Color.WHITE);
		b2_imperfekt.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b2_imperfekt.setPreferredSize(new Dimension(250, 30));
		b2_imperfekt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		c.gridy = 1;
		panelCenter.add(b2_imperfekt, c);

		b3_futurI = new JButton("Futur I");
		b3_futurI.setBackground(Color.BLACK);
		b3_futurI.setForeground(Color.WHITE);
		b3_futurI.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b3_futurI.setPreferredSize(new Dimension(250, 30));
		b3_futurI.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		c.gridy = 2;
		panelCenter.add(b3_futurI, c);

		b4_perfekt = new JButton("Perfekt");
		b4_perfekt.setBackground(Color.BLACK);
		b4_perfekt.setForeground(Color.WHITE);
		b4_perfekt.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b4_perfekt.setPreferredSize(new Dimension(250, 30));
		b4_perfekt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		c.gridy = 3;
		panelCenter.add(b4_perfekt, c);

		b5_plusquamperfekt = new JButton("Plusquamperfekt");
		b5_plusquamperfekt.setBackground(Color.BLACK);
		b5_plusquamperfekt.setForeground(Color.WHITE);
		b5_plusquamperfekt.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b5_plusquamperfekt.setPreferredSize(new Dimension(250, 30));
		b5_plusquamperfekt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		c.gridy = 4;
		panelCenter.add(b5_plusquamperfekt, c);

		b6_futurII = new JButton("Futur II");
		b6_futurII.setBackground(Color.BLACK);
		b6_futurII.setForeground(Color.WHITE);
		b6_futurII.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b6_futurII.setPreferredSize(new Dimension(250, 30));
		b6_futurII.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		c.gridy = 5;
		panelCenter.add(b6_futurII, c);

		add(panelCenter, BorderLayout.CENTER);
	}

}
