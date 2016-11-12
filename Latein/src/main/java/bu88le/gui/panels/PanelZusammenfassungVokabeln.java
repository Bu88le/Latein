package bu88le.gui.panels;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import logic.ZusammenfassungVokabeln;

public class PanelZusammenfassungVokabeln extends CommonPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8060594367342048039L;

	JLabel lb1_ausgabe;
	JScrollPane sp1_ausgabe;


	public PanelZusammenfassungVokabeln(JPanel caller) {
		super(caller);
		initGUI();
	}


	private void initGUI() {
		lb1_ausgabe = new JLabel(ZusammenfassungVokabeln.zusammenfasung(), JLabel.CENTER);
		System.out.println(ZusammenfassungVokabeln.zusammenfasung());

		sp1_ausgabe = new JScrollPane(lb1_ausgabe);
		add(sp1_ausgabe, BorderLayout.CENTER);
	}

}
