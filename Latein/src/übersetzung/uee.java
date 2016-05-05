package übersetzung;

import javax.swing.JOptionPane;

import frames.framemain;

public class uee {
	
	static String gv;
	static int zähler;
	static StringBuffer stringbuffer = new StringBuffer();
	
	public uee(String s) {
		gv = s;
		auswahl();
	}
	
	public static String[] a = {"moneo", "monere", "ermahnen"};
	
	public static String[][] zg = {a};
	
	public static void auswahl() {
		for (int i = 0; i<zg.length; i++) {
		 if (zg[i][0].equals(gv)) {
			
			ausgabe(i);
			break;
		 }
		 
		 
		}
	}
	
	public static void ausgabe(int z) {

		stringbuffer.append(zg[z][1]);
		stringbuffer.append(" : ");
		stringbuffer.append("\n");
		stringbuffer.append("\n");
		
		for (int i = 2; i < zg[z].length; i++) {
			stringbuffer.append(zg[z][i]);
			stringbuffer.append("\n");
		}
		
		JOptionPane.showMessageDialog(null, stringbuffer, framemain.tfield1.getText(), JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static StringBuffer returns() {
		return stringbuffer;
	}
	

}
