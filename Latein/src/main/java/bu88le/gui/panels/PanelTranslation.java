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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import bu88le.gui.MainFrame;

public class PanelTranslation extends CommonPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6285723980030680662L;
	StringBuffer ausgabe = new StringBuffer();
	JLabel lbl_ausgabe;
	public static JScrollPane jsp_ausgabe;
	JPanel jp_translation, jp2_button;
	JButton b1_ok;


	public PanelTranslation(JPanel caller, StringBuffer ausgabe) {
		super(caller);

		this.ausgabe = ausgabe;
		initGUI();
	}


	private void initGUI() {
		lbl_ausgabe = new JLabel(ausgabe.toString(), SwingConstants.CENTER);

		jsp_ausgabe = new JScrollPane(lbl_ausgabe);
		jsp_ausgabe.requestFocusInWindow();
		jsp_ausgabe.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					b1_ok.doClick();
				}
			}
		});

		jp_translation = new JPanel();
		jp_translation.setLayout(new BorderLayout(10, 10));
		jp_translation.add(jsp_ausgabe, BorderLayout.CENTER);

		b1_ok = new JButton("Weiter");
		b1_ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.panelTenseSelection();
			}
		});
		b1_ok.setBackground(Color.lightGray);
		b1_ok.setForeground(Color.BLUE);
		b1_ok.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b1_ok.setPreferredSize(new Dimension(120, 30));

		jp2_button = new JPanel();
		jp2_button.setPreferredSize(new Dimension(getWidth(), 40));
		jp2_button.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridy = 0;
		c.gridx = 0;
		c.fill = GridBagConstraints.VERTICAL;
		c.insets = new Insets(0, 0, 0, 0);
		jp2_button.add(b1_ok, c);

		jp_translation.add(jp2_button, BorderLayout.PAGE_END);

		add(jp_translation, BorderLayout.CENTER);

	}

}
