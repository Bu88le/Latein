package wörter;

import vokabeln.Adeklination;
import übersetzung.UeAD;

public class ADeklination {
	
	String gesuchtevokabel;
	String gvs;
	public static boolean ADek;
	
	public ADeklination(String gv, String gvs) {
		gesuchtevokabel = gv;
		this.gvs = gvs;
		testen(gvs);
	}
	
	void testen(String gvs) {
		for (int i = 0; i < Adeklination.rnomena().length; i++) {
			if (Adeklination.rnomena()[i].equals(gvs)) {
				ADek = true;
				formen(gvs);
				new UeAD(singular[0]);
			}
		}
	}
	
	//--------------------------------------------------------------
	//------------------------SINGULAR------------------------------
	//--------------------------------------------------------------
	
	private final String[] endungenSingular = {"a", "ae", "ae", "am", "a"};
	
	private static String[] singular = new String[5];
	
	//--------------------------------------------------------------
	//-------------------------PLURAL-------------------------------
	//--------------------------------------------------------------
	
	private final String[] endungenPlural = {"ae", "arum", "is", "as", "is"};
	
	private static String[] plural = new String[5];
	
	
	
	void formen(String gvs) {
		for (int i = 0; i < 5; i++) {
			singular[i] = gvs + endungenSingular[i];
			
			plural[i] = gvs + endungenPlural[i];
			
		}
	}
	
	public static String getSingular() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html><b><font color=\"#0000FF\">");
		for (int i = 0; i < singular.length; i++) {
			sb.append("&#160" + singular[i]);
			sb.append("<p/>");
			if (i == singular.length) {
				sb.append("<font/></b></html>");
			}
		}
		return sb.toString().trim();
	}
	
	public static String getPlural() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html><b><font color=\"#0000FF\">");
		for (int i = 0; i < plural.length; i++) {
			sb.append("&#160" + plural[i]);
			sb.append("<p/>");
			if (i == plural.length) {
				sb.append("<font/></b></html>");
			}
		}
		return sb.toString().trim();
	}
}
