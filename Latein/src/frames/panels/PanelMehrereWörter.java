package frames.panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;

import frames.MainFrame;
import frames.buttons.CommonButton;
import latein.Main;
import wörter.akonjugation;
import wörter.ekonjugation;
import zeiten.Auswahl;

public class PanelMehrereWörter extends JPanel {
	
	JTextField tf1_eingabe;
	JLabel lb1_anzeige, lb2_hinweis;
	JScrollPane sp1;
	CommonButton b1_go, b2_close;
	String gv, gvs;
	JList jl1_anzeige;
	DefaultListModel dlm1_Strings;
	
	public PanelMehrereWörter(ArrayList<String> MehrereWörter) {
		
		//String[] länge = sb.toString().split("<p/>");
		
		setLayout(null);
		
		lb2_hinweis = new JLabel("Ihre Vokabel trifft auf mehrere lateinische Wörter zu! Bitte wählen sie eine Vokabel aus:", JLabel.CENTER);
		lb2_hinweis.setFont(new Font("Calibri", Font.PLAIN, 15));
		lb2_hinweis.setForeground(new Color(0,128,0));
		lb2_hinweis.setBounds(0,5,600,20);
		add(lb2_hinweis);
		
		dlm1_Strings = new DefaultListModel();
		jl1_anzeige = new JList(dlm1_Strings);	
		for (int i = 0; i < MainFrame.MehrereVokabeln.size(); i++) {
			if (i%2 == 0) {
				System.out.println(MainFrame.MehrereVokabeln.get(i));
				dlm1_Strings.addElement(MainFrame.MehrereVokabeln.get(i));
			}
		}	
		jl1_anzeige.setBounds(5,30,600,150);
		add(jl1_anzeige);
		/*lb1_anzeige = new JLabel(sb.toString(), JLabel.CENTER);
		lb1_anzeige.setFont(new Font("Calibri", Font.PLAIN, 15));
		lb1_anzeige.setForeground(Color.BLACK);
		
		sp1 = new JScrollPane(lb1_anzeige, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
		            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sp1.setBounds(5,25,575,210);
		add(sp1);
		
		tf1_eingabe = new JTextField("", 15);
		tf1_eingabe.setBounds(275, 240, 50, 25);
		tf1_eingabe.setBorder(new LineBorder(Color.RED));
		tf1_eingabe.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					if (tf1_eingabe.getText().equals("") || !isValid(tf1_eingabe.getText())) {
						
					}else {
							b1_go.doClick();
					}
				}
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (tf1_eingabe.getText().equals("") || !isValid(tf1_eingabe.getText()) || Integer.parseInt(tf1_eingabe.getText()) > länge.length) {
					tf1_eingabe.setBorder(new LineBorder(Color.RED, 2));
					b1_go.setEnabled(false);
				}else {
					tf1_eingabe.setBorder(new LineBorder(Color.BLACK, 1));
					b1_go.setEnabled(true);
				}
			}
		});
		add(tf1_eingabe);*/
		
		b1_go = new CommonButton("Go", 255, 270, 90, 30, Color.LIGHT_GRAY, Color.BLUE);
		b1_go.setEnabled(false);
		b1_go.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					if (Auswahl.ekon) {
						gv =  vokabeln.e.getVerbenEkon()[(int) Auswahl.pointArray.get(Integer.parseInt(tf1_eingabe.getText())).getX()][(int) Auswahl.pointArray.get(Integer.parseInt(tf1_eingabe.getText())).getY()] + "eo";
						gvs = vokabeln.e.getVerbenEkon()[(int) Auswahl.pointArray.get(Integer.parseInt(tf1_eingabe.getText())).getX()][(int) Auswahl.pointArray.get(Integer.parseInt(tf1_eingabe.getText())).getY()];
						new ekonjugation(gv, gvs);
					}
					/*if (Auswahl.ekon2) {
						gv =  vokabeln.e.getVerbenEkonRest()[(int) Auswahl.pointArray.get(Integer.parseInt(tf1_eingabe.getText())).getX()][(int) Auswahl.pointArray.get(Integer.parseInt(tf1_eingabe.getText())).getY()] + "eo";
						gvs = vokabeln.e.getVerbenEkon()[(int) Auswahl.pointArray.get(Integer.parseInt(tf1_eingabe.getText())).getX()][(int) Auswahl.pointArray.get(Integer.parseInt(tf1_eingabe.getText())).getY()];
						new ekonjugation(gv, gvs);
					}*/
					if (Auswahl.akon) {
						gv = vokabeln.a.getVerbenAkon()[(int) Auswahl.pointArray.get(Integer.parseInt(tf1_eingabe.getText())).getX()][(int) Auswahl.pointArray.get(Integer.parseInt(tf1_eingabe.getText())).getY()] + "o";
						gvs = vokabeln.a.getVerbenAkon()[(int) Auswahl.pointArray.get(Integer.parseInt(tf1_eingabe.getText())).getX()][(int) Auswahl.pointArray.get(Integer.parseInt(tf1_eingabe.getText())).getY()];
						new akonjugation(gv, gvs);
					}
					
			}
		});
		add(b1_go);
	}
	
	private static boolean isValid(String s) {
		if (s.matches("[\\d]*"))
			return true;
		
		return false;
	}

}
