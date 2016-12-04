package bu88le.gui.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;

public class PanelSetText extends CommonPanel {
	
	JTextPane tp_eingabe_latein, tp_eingabe_deutsch;
	JPanel pageStart, pageCenter;
	JLabel lbl_latein, lbl_translation;
	JButton bt_save;
	String name;
	
	FileOutputStream outputStream;
	ObjectOutputStream oos;
	BufferedWriter bfwriter;
	File file;
	
	GridBagConstraints c = new GridBagConstraints();

	public PanelSetText(JPanel caller, String name) {
		super(caller);
		this.name = name;
		initGUI();
	}
	
	private void initGUI() {
		tp_eingabe_latein = new JTextPane();
		tp_eingabe_latein.setEditable(true);
		tp_eingabe_latein.setBorder(new LineBorder(Color.BLACK, 1));
		tp_eingabe_latein.setPreferredSize(new Dimension(300,250));
		add(tp_eingabe_latein, BorderLayout.LINE_START);
		
		add(Box.createRigidArea(new Dimension(30,0)), BorderLayout.CENTER);
		
		tp_eingabe_deutsch = new JTextPane();
		tp_eingabe_deutsch.setPreferredSize(new Dimension(300,250));
		tp_eingabe_deutsch.setBorder(new LineBorder(Color.BLACK, 1));
		add(tp_eingabe_deutsch, BorderLayout.LINE_END);
		
		pageStart = new JPanel();
		pageStart.setLayout(new GridBagLayout());
		
		lbl_latein = new JLabel("Latein", JLabel.LEFT);
		lbl_latein.setFont(new Font("Sans Serif", Font.BOLD, 15));
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(5, 5, 10, 5);
		pageStart.add(lbl_latein, c);
		
		lbl_translation = new JLabel("Translation", JLabel.CENTER);
		lbl_translation.setFont(new Font("Sans Serif", Font.BOLD, 15));
		c.gridx = 2;
		pageStart.add(lbl_translation, c);
		
		add(pageStart, BorderLayout.PAGE_START);
		
		pageCenter = new JPanel();
		pageCenter.setLayout(new GridBagLayout());
		
		bt_save = new JButton("Speichern");
		bt_save.setBackground(Color.LIGHT_GRAY);
		bt_save.setForeground(Color.BLUE);
		bt_save.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bt_save.setPreferredSize(new Dimension(120,30));
		bt_save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (tp_eingabe_deutsch.getText() != "" && tp_eingabe_latein.getText() != "") {
					System.out.println("hi");
					saveToFile();
				}
				
			}
		});
		c.gridx = 0;
		c.gridy = 0;
		pageCenter.add(bt_save, c);
		
		add(pageCenter, BorderLayout.CENTER);
		
		
	}
	
	private void saveToFile() {
		URL url = getClass().getClassLoader().getResource(name);
		try {
			/*file = new File(url.toURI());
			outputStream = new FileOutputStream(file);*/
			FileOutputStream fos = new FileOutputStream(new File(url.toURI()));
			byte[] b = tp_eingabe_latein.getText().getBytes();
			fos.write(b, 0, b.length);
		} catch (FileNotFoundException e1) {
			System.out.println("File not found");
			e1.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException");
			e.printStackTrace();
		} catch (URISyntaxException e1) {
			System.out.println("URISyntaxException");
			e1.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
