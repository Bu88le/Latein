package bu88le.gui.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import bu88le.gui.Strings;

public class PanelSelectWords extends CommonPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1750985545465889932L;

	ArrayList<String> foundVoc = new ArrayList<String>();
	ArrayList<String> unusualForms = new ArrayList<String>();
	ArrayList<String> infinitive = new ArrayList<String>();
	ArrayList<Integer> placeFoundVocs = new ArrayList<Integer>();
	ArrayList<String> translation = new ArrayList<String>();

	JScrollPane jsp_listVocs, jsp_listTranslation;
	JLabel lbl_Desc;

	DefaultListModel<String> dlm1_lateinVocs, dlm2_translation;
	JList<String> jl1_lateinVocs, jl2_translation;


	public PanelSelectWords(JPanel caller, ArrayList<String> foundVoc, ArrayList<String> unusualForms,
			ArrayList<String> infinitive, ArrayList<Integer> placeFoundVocs, ArrayList<String> translation) {
		super(caller);

		this.foundVoc = foundVoc;
		this.unusualForms = unusualForms;
		this.infinitive = infinitive;
		this.placeFoundVocs = placeFoundVocs;
		this.translation = translation;

		frameaufbau();
	}


	private void frameaufbau() {
		dlm1_lateinVocs = new DefaultListModel<String>();
		jl1_lateinVocs = new JList<String>(dlm1_lateinVocs);
		for (int i = 0; i < infinitive.size(); i++) {
			dlm1_lateinVocs.addElement(infinitive.get(i));
		}
		jl1_lateinVocs.setBorder(new LineBorder(Color.BLACK));
		jl1_lateinVocs.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});;
		jsp_listVocs = new JScrollPane(jl1_lateinVocs);
		add(jsp_listVocs, BorderLayout.LINE_START);

		dlm2_translation = new DefaultListModel<String>();
		jl2_translation = new JList<String>(dlm2_translation);
		for (int i = 0; i < infinitive.size(); i++) {
			dlm2_translation.addElement(translation.get(i));
		}
		jl2_translation.setBorder(new LineBorder(Color.BLACK));
		jl2_translation.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				jl1_lateinVocs.setSelectedIndex(jl2_translation.getSelectedIndex());
				jl2_translation.clearSelection();
			}
		});
		jsp_listTranslation = new JScrollPane(jl2_translation);
		add(jsp_listTranslation, BorderLayout.LINE_END);

		lbl_Desc = new JLabel(
				Strings.getString("PanelSelectWords.lbl_Desc0"), //$NON-NLS-1$
				SwingConstants.CENTER);
		add(lbl_Desc, BorderLayout.PAGE_START);
	}

}
