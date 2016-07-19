package frames.panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import frames.MainFrame;
import frames.buttons.CommonButton;
import latein.Main;
import w�rter.akonjugation;
import w�rter.ekonjugation;
import zeiten.Auswahl;
import �bersetzung.uea;

public class PanelMehrereW�rter extends JPanel {
	
	JTextField tf1_eingabe;
	JLabel lb1_anzeige, lb2_hinweis;
	JScrollPane sp1;
	CommonButton b1_go, b2_close;
	String gv, gvs;
	JList jl1_anzeige, jl2_�bersetzung;
	DefaultListModel dlm1_Strings, dlm2_�bersetzungen;
	
	public PanelMehrereW�rter(ArrayList<String> MehrereW�rter) {
		
		//String[] l�nge = sb.toString().split("<p/>");
		
		setLayout(null);
		
		lb2_hinweis = new JLabel("Ihre Vokabel trifft auf mehrere lateinische W�rter zu! Bitte w�hlen sie eine Vokabel aus:", JLabel.CENTER);
		lb2_hinweis.setFont(new Font("Calibri", Font.PLAIN, 15));
		lb2_hinweis.setForeground(new Color(0,128,0));
		lb2_hinweis.setBounds(0,5,600,20);
		add(lb2_hinweis);
		
		dlm1_Strings = new DefaultListModel();
		jl1_anzeige = new JList(dlm1_Strings);	
		for (int i = 0; i < MehrereW�rter.size(); i++) {
			dlm1_Strings.addElement(MehrereW�rter.get(i));
		}
		jl1_anzeige.setBounds(5,30,300,150);
		DefaultListCellRenderer renderer = (DefaultListCellRenderer) jl1_anzeige.getCellRenderer();
		renderer.setHorizontalAlignment(SwingConstants.CENTER);
		jl1_anzeige.setBorder(new LineBorder(Color.BLACK));
		add(jl1_anzeige);
		
		
		dlm2_�bersetzungen = new DefaultListModel();
		jl2_�bersetzung = new JList(dlm2_�bersetzungen);
		uea.ZusammenschlussVokabel�bersetzung(MehrereW�rter.get(0));
		for (int i = 0; i < uea.Zusammenschluss().size(); i++) {
			dlm2_�bersetzungen.addElement(uea.Zusammenschluss().get(i));
		}
		jl2_�bersetzung.setBounds(305,30,285,150);
		DefaultListCellRenderer renderer2 = (DefaultListCellRenderer) jl2_�bersetzung.getCellRenderer();
		renderer2.setHorizontalAlignment(SwingConstants.CENTER);
		jl2_�bersetzung.setBorder(new LineBorder(Color.BLACK));
		jl2_�bersetzung.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
            	jl1_anzeige.setSelectedIndex(jl2_�bersetzung.getSelectedIndex());
                jl2_�bersetzung.clearSelection();                
            }
        });
		add(jl2_�bersetzung);
		
		
		b1_go = new CommonButton("Go", 255, 270, 90, 30, Color.LIGHT_GRAY, Color.BLUE);
		b1_go.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (Auswahl.akon) {
					if (jl1_anzeige.getSelectedIndex() >= 0) {
						new akonjugation(MehrereW�rter.get(jl1_anzeige.getSelectedIndex()), Auswahl.gvs, uea.Zusammenschluss.get(jl1_anzeige.getSelectedIndex()));
					}else {
						new akonjugation(MehrereW�rter.get(0), Auswahl.gvs, uea.Zusammenschluss.get(0));
					}
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
