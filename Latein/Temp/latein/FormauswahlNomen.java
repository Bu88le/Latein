package latein;

import wörter.*;

public class FormauswahlNomen {
	
	String gesuchtevokabel;
	String gvs;
	
	public FormauswahlNomen(String gv) {
		EndungenSuche(gv);
	}

	void EndungenSuche(String gv) {
		if (gv.endsWith("a") || gv.endsWith("ae") || gv.endsWith("am") ||
				gv.endsWith("arum") || gv.endsWith("is") || gv.endsWith("as")) {
			
			ADeklination(gv);
		
		}else if (gv.endsWith("us") || gv.endsWith("i") || gv.endsWith("o") || gv.endsWith("um") || gv.endsWith("o") ||
				gv.endsWith("orum") || gv.endsWith("is") || gv.endsWith("os") || gv.endsWith("um") || gv.endsWith("er")) {
			
			ODeklination(gv);
			
		}else if (gv.endsWith("em") || gv.endsWith("e") || gv.endsWith("es") || gv.endsWith("ibus")) {
			
			KonsDeklination(gv);
			
		}else {
			Main.mf.panelFehler();
		}
	}
	
	void ADeklination(String gv) {
		gesuchtevokabel = gv;
		if (gv.endsWith("a")) 
			gvs = gv.substring(0, gv.length()-1);
		
		if (gv.endsWith("ae") || gv.endsWith("is") || gv.endsWith("am") || gv.endsWith("as")) 
			gvs = gv.substring(0,  gv.length()-2);
		
		if (gv.endsWith("arum"))
			gvs = gv.substring(0, gv.length()-4);
		
		new ADeklination(gv, gvs);
		
	}
	
	void ODeklination(String gv) {
		//TODO
	}
	
	void KonsDeklination(String gv) {
		//TODO
	}
}
