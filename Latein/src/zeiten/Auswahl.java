package zeiten;

import latein.Main;
import vokabeln.a;
import vokabeln.e;
import wörter.akonjugation;
import wörter.ekonjugation;

public class Auswahl {
	
	private static String gv;
	
	public static void überprüfung(String gvs) {
		a.verbenAkon();
		akonjugation:
		for (int i = 0; i < a.getVerbenAkon().length; i++) {
			for (int z = 0; z < a.getVerbenAkon()[i].length; z++) {
				if (gvs.equals(a.getVerbenAkon()[i][z])) {
					gv = gvs + "o";
					new akonjugation(gv, gvs);
					break akonjugation;
				}
				if (i == a.getVerbenAkon().length-1 && !gvs.equals(a.getVerbenAkon()[i][z])) {
					überprüfung2(gvs);
					break akonjugation;
				}
			}
		}
	}
	
	private static void überprüfung2(String gvs) {
		e.verbenEkon();
		ekonjugation:
		for (int i = 0; i < e.getVerbenEkon().length; i++) {
			for (int z = 0; z < e.getVerbenEkon()[i].length; z++) {
				if (gvs.equals(e.getVerbenEkon()[i][z])) {
					gv = gvs + "eo";
					new ekonjugation(gv, gvs);
					break ekonjugation;
				}
				if (i == e.getVerbenEkon().length-1 && !gvs.equals(e.getVerbenEkon()[i][z])) {
					Main.mf.panelFehler();
					break ekonjugation;
				}
			}
		}
	}
	

}
