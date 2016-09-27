package frames.panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import frames.buttons.CommonButton;
import wörter.akonjugation;
import zeiten.Auswahl;
import übersetzung.uea;

public class PanelMehrereWörter extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	JTextField tf1_eingabe;
	JLabel lb1_anzeige, lb2_hinweis;
	JScrollPane sp1;
	CommonButton b1_go, b2_close;
	String gv, gvs;
	JList<String> jl1_anzeige, jl2_übersetzung;
	DefaultListModel<String> dlm1_Strings, dlm2_Übersetzungen;
	
	public PanelMehrereWörter(ArrayList<String> MehrereWörter) {
		
		//String[] länge = sb.toString().split("<p/>");
		
		setLayout(null);
		
		lb2_hinweis = new JLabel("Ihre Vokabel trifft auf mehrere lateinische Wörter zu! Bitte wählen sie eine Vokabel aus:", JLabel.CENTER);
		lb2_hinweis.setFont(new Font("Calibri", Font.PLAIN, 15));
		lb2_hinweis.setForeground(new Color(0,128,0));
		lb2_hinweis.setBounds(0,5,600,20);
		add(lb2_hinweis);
		
		dlm1_Strings = new DefaultListModel<String>();
		jl1_anzeige = new JList<String>(dlm1_Strings);	
		for (int i = 0; i < MehrereWörter.size(); i++) {
			dlm1_Strings.addElement(MehrereWörter.get(i));
		}
		jl1_anzeige.setBounds(5,30,300,150);
		DefaultListCellRenderer renderer = (DefaultListCellRenderer) jl1_anzeige.getCellRenderer();
		renderer.setHorizontalAlignment(SwingConstants.CENTER);
		jl1_anzeige.setBorder(new LineBorder(Color.BLACK));
		add(jl1_anzeige);
		
		
		dlm2_Übersetzungen = new DefaultListModel<String>();
		jl2_übersetzung = new JList<String>(dlm2_Übersetzungen);
		uea.ZusammenschlussVokabelÜbersetzung(MehrereWörter.get(0));
		for (int i = 0; i < uea.Zusammenschluss().size(); i++) {
			dlm2_Übersetzungen.addElement(uea.Zusammenschluss().get(i));
		}
		jl2_übersetzung.setBounds(305,30,285,150);
		DefaultListCellRenderer renderer2 = (DefaultListCellRenderer) jl2_übersetzung.getCellRenderer();
		renderer2.setHorizontalAlignment(SwingConstants.CENTER);
		jl2_übersetzung.setBorder(new LineBorder(Color.BLACK));
		jl2_übersetzung.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
            	jl1_anzeige.setSelectedIndex(jl2_übersetzung.getSelectedIndex());
                jl2_übersetzung.clearSelection();                
            }
        });
		add(jl2_übersetzung);
		
		
		b1_go = new CommonButton("Go", 255, 270, 90, 30, Color.LIGHT_GRAY, Color.BLUE);
		b1_go.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (Auswahl.akon) {
					if (jl1_anzeige.getSelectedIndex() >= 0) {
						new akonjugation(MehrereWörter.get(jl1_anzeige.getSelectedIndex()), Auswahl.gvs, uea.Zusammenschluss.get(jl1_anzeige.getSelectedIndex()));
					}else {
						new akonjugation(MehrereWörter.get(0), Auswahl.gvs, uea.Zusammenschluss.get(0));
					}
				}
			}
		});
		add(b1_go);
	}
}
