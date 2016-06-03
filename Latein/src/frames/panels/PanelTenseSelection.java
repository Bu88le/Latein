package frames.panels;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import frames.MainFrame;
import frames.buttons.CommonButton;
import latein.Main;
import übersetzung.übergabe;

public class PanelTenseSelection extends JPanel {

	public static CommonButton b1_präsens; 
	CommonButton b2_imperfekt,b3_perfekt,b4_plusquamperfekt,b5_futurI,b6_futurII,b7_newVoc,b8_Translation,b9_Close;
	Object c;
	
	public PanelTenseSelection() {
		
		setLayout(null);
		
		b1_präsens = new CommonButton("Präsens", 150, 25);
		b1_präsens.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.mf.panelPräsens();				
			}
			
		});
		add(b1_präsens);
		
		b2_imperfekt = new CommonButton("Imperfekt", 150, 60);
		b2_imperfekt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.mf.panelImperfekt();				
			}
		});
		add(b2_imperfekt);
		
		b5_futurI = new CommonButton("Futur I", 150, 95);
		b5_futurI.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.mf.panelFuturI();				
			}
			
		});
		add(b5_futurI);
		
		b3_perfekt = new CommonButton("Perfekt", 150, 130);
		b3_perfekt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.mf.panelPerfekt();				
			}
		});
		add(b3_perfekt);
		
		b4_plusquamperfekt = new CommonButton("Plusquamperfekt", 150, 165);
		b4_plusquamperfekt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.mf.panelPlusquamperfekt();
				
			}
		});
		add(b4_plusquamperfekt);
		
		b6_futurII = new CommonButton("Futur II", 150, 200);
		b6_futurII.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.mf.panelFuturII();				
			}
		});
		add(b6_futurII);
		
		b7_newVoc = new CommonButton("Neue Vokabel", 150, 285, 140, 30, Color.LIGHT_GRAY, Color.BLUE);
		b7_newVoc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.panelMain();
				
			}
		});
		add(b7_newVoc);
		
		b8_Translation = new CommonButton("Übersetzung", 310, 285, 140, 30, Color.LIGHT_GRAY, Color.BLUE);
		b8_Translation.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(b3_perfekt, übergabe.returngv());
				
			}
		});
		add(b8_Translation);
		
		b9_Close = new CommonButton("Beenden", 255, 325, 90, 30, Color.RED, Color.BLACK);
		b9_Close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		add(b9_Close);
		
	}
	
	
}
