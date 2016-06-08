package zeiten;

import vokabeln.a;
import vokabeln.e;
import wörter.akonjugation;
import wörter.ekonjugation;

public class Auswahl {
	
	private static String gv;
	
	public static void überprüfung(String gvs) {
		akonjugation:
		for (int i = 0; i < a.rverbenakon().length; i++) {
			for (int z = 0; z < a.rverbenakon()[i].length; z++) {
				if (gvs.equals(a.rverbenakon()[i][z])) {
					gv = gvs + "o";
					new akonjugation(gv, gvs);
					break akonjugation;
				}
			}
		}
	
		ekonjugation:
		for (int i = 0; i < e.rverbenekon().length; i++) {
			for (int z = 0; z < e.rverbenekon()[i].length; i++) {
				if (gvs.equals(e.rverbenekon()[i][z])) {
					gv = gvs + "eo";
					new ekonjugation(gv, gvs);
					break ekonjugation;
				}
			}
		}
	}
	

}
