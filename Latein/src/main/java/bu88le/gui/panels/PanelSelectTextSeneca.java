package bu88le.gui.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.BufferedReader;
import java.io.File;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import bu88le.gui.MainFrame;

public class PanelSelectTextSeneca extends CommonPanel {
	
	DefaultListModel<String> dfm_names_first = new DefaultListModel<>();
	JList<String> jl_names_first = new JList<>();
	JPanel p1_gesamt;
	JLabel lbl1_letters;
	JScrollPane jscrollpane, jsp_names_first;
	
	String seneca_letters = "texts/seneca/letters";
	
	URL url1 = getClass().getClassLoader().getResource(seneca_letters);
	BufferedReader reader = null;
	File file;
	
	String[] names;
	ArrayList<Integer> names_int = new ArrayList<>();
	GridBagConstraints c = new GridBagConstraints();
	DefaultListCellRenderer renderer = new DefaultListCellRenderer();
	

	public PanelSelectTextSeneca(JPanel caller) {
		super(caller);
		auslesenNamen();
		initGUI();
	}
	
	private void initGUI() {
		p1_gesamt = new JPanel();
		p1_gesamt.setLayout(new GridBagLayout());
		c.insets = new Insets(5, 5, 5, 5);
		
		lbl1_letters = new JLabel("<html><b><font size=5>Epistulae morales ad Lucilium</b></font></html>", JLabel.CENTER);
		c.gridx = 0;
		c.gridy = 0;
		p1_gesamt.add(lbl1_letters, c);
		
		jl_names_first = new JList<>(dfm_names_first);
		jl_names_first.setBorder(new LineBorder(Color.BLACK));
		jl_names_first.setPreferredSize(new Dimension(MainFrame.getCenterpanel().getWidth()-50, (int) (dfm_names_first.getSize()*18.2)));
		jl_names_first.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jl_names_first.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				System.out.println(seneca_letters + "/" + (jl_names_first.getSelectedIndex()+1));
				MainFrame.panelSetText(seneca_letters + "/" + (jl_names_first.getSelectedIndex()+1));
			}
		});
		renderer = (DefaultListCellRenderer) jl_names_first.getCellRenderer();
		renderer.setHorizontalAlignment(SwingConstants.CENTER);
		jsp_names_first = new JScrollPane(jl_names_first, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		c.gridy = 1;
		p1_gesamt.add(jsp_names_first, c);
		
		jscrollpane = new JScrollPane(p1_gesamt);
		add(jscrollpane, BorderLayout.CENTER);
	}
	
	private void auslesenNamen() {
		try {
			file = new File(url1.toURI());
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		names = file.list();
		
		for (int i = 0; i < names.length; i++) {
			names_int.add(Integer.parseInt(names[i]));
		}
		
		Collections.sort(names_int);
		
		for (int i = 0; i < names_int.size(); i++) {
			String string = "epistula ";
			string += names_int.get(i);
			dfm_names_first.addElement(string);
		}
	}

}
