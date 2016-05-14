package übersetzung;
import javax.swing.JOptionPane;

import frames.frame;

public class uee {
	
	static String gv;
	static int zähler;
	static StringBuffer stringbuffer = new StringBuffer();
	static String ss;
	
	public uee(String s) {
		gv = s;
		auswahl();
	}
	
	public static String[] a = {"moneo", "monere", "ermahnen"};
	public static String[] b = {"adhaereo", "adhaerere", "angrenzen"};
	public static String[] c = {"ardeo", "<u><b><font color=\"#FF0000\">ardere</font></u></b>", "brennen", "verbrennen","funkeln", "blitzen", "", "ardet domus", "das Haus brennt", "", "fauces siti ardent", "lechzen vor Durst", "", "oculi ardent", "die Augen funkeln", "", "fig bei Gefühlen: ", "glühen", "entbrannt sein", "heiß verliebt sein <font color=\"#6E6E6E\">(in aliquo/aliquo/aliquem</font> in jmd.", "", ""};
	
	public static String[][] zg = {a,b,c};
	
	public static void auswahl() {
		for (int i = 0; i<zg.length; i++) {
		 if (zg[i][0].equals(gv)) {
			
			ausgabe(i);
			break;
		 }		 
		}
	}
	
	public static void ausgabe(int z) {

		ss = "<html>" + zg[z][1] + " :" + "<p/>" + "<p/>";
		
		for (int i = 2; i < zg[z].length; i++) {
			ss = ss + zg[z][i] + "<p/>";
			System.out.println(zg[z].length);
			if (i == zg[z].length) {
				ss = ss + "<html/>";
			}
		}
		
		new übergabe(ss);
	}
}