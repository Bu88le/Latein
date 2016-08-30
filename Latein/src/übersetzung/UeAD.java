package übersetzung;

public class UeAD {
	
	public static StringBuffer stringbuffer = new StringBuffer();
	
	public UeAD(String gv) {
		
		auswahl(gv);
	}
	
	final static String[] a = {"abella", "<u><b><font color=\"#FF0000\">Abella</font></u></b>", "Abella </p>(<font color=\"#6E6E6E\">Stadt in Kampanien mit bedeutender Obstkultur, heute Avella)</font>"};
	final static String[] b = {"dasistmeinname", "<u><b><font color=\"#FF0000\">DasIstMeinName</font></u></b>"};
	
	
	
	static String[][] zg = {a, b};
	
	void auswahl(String gv) {
		for (int i = 0; i<zg.length; i++) {
			if (zg[i][0].equals(gv)) {

				ausgabe(i);
				break;
			}			 
		}
	}
	
	void ausgabe(int z) {
		stringbuffer.delete(0, stringbuffer.length());
		
		stringbuffer.append("<html>");
		stringbuffer.append(zg[z][1]);
		stringbuffer.append(" : <p/> <p/>");
				
		for (int i = 2; i < zg[z].length; i++) {
			stringbuffer.append(zg[z][i] + "<p/>");
			if (i == zg[z].length) {
				stringbuffer.append("<html/>");
			}
		}

		new ÜbergabeNomen(stringbuffer.toString());
	}
}
