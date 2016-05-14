package übersetzung;

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
	public static String[] c = {"ardeo", "<u><b><font color=\"#FF0000\">ardere</font></u></b>", "brennen", "verbrennen","funkeln", "blitzen", "", "<font color=\"#6E6E6E\">ardet domus :</font>", "das Haus brennt", "", "<font color=\"#6E6E6E\">fauces siti ardent :</font>", "lechzen vor Durst", "", "<font color=\"#6E6E6E\">oculi ardent :</font>", "die Augen funkeln", "", "fig bei Gefühlen: ", "glühen", "entbrannt sein", "heiß verliebt sein (<font color=\"#6E6E6E\">in aliquo/aliquo/aliquem</font> in jmd.)", "", ""};
	
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

		stringbuffer.append("<html>");
		stringbuffer.append(zg[z][1]);
		stringbuffer.append(" : <p/> <p/>");
		
		for (int i = 2; i < zg[z].length; i++) {
			stringbuffer.append(zg[z][i] + "<p/>");
			if (i == zg[z].length) {
				stringbuffer.append("<html/>");
			}
		}
		
		new übergabe(stringbuffer.toString());
	}
}